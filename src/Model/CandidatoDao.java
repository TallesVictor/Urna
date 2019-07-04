/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class CandidatoDao {
      private Connection connection;

    public CandidatoDao() {
        this.connection = new ConnectionFactory().getConnection();
    }
        public ArrayList<Candidato> buscarTodos() {
        ArrayList<Candidato> listaCandidato = new ArrayList<>();
        String sql = "select * from candidato";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Candidato c = preencherCandidato(rs);
                listaCandidato.add(c);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar: " + e.getMessage());
            throw new RuntimeException();
        }
        return listaCandidato;
    }
        
        private Candidato preencherCandidato(ResultSet rs) throws SQLException {
        Integer id = rs.getInt("id");
        String nome = rs.getString("nome");
        Integer numero = rs.getInt("numero");
        String partido = rs.getString("partido");
        
        Candidato c= new Candidato(id, nome, numero, partido);
        return c;
    }  
}
