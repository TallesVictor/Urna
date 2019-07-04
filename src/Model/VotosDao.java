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


public class VotosDao {

    private Connection connection;

    public VotosDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public ArrayList<Votos> buscarTodos() {

        ArrayList<Votos> listaVotos = new ArrayList<>();
        String sql = "select * from votos";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Votos v = preencherVotos(rs);
                listaVotos.add(v);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar: " + e.getMessage());
            throw new RuntimeException();
        }
        return listaVotos;
    }


    public void Contador(Integer id) {
        String sql = "UPDATE votos SET quantidade=quantidade+1 WHERE idcandidato=?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar: " + e.getMessage());
            throw new RuntimeException();
        }
    }
    
    private Votos preencherVotosIDQUANTIDADE(ResultSet rs) throws SQLException {
        Integer id = rs.getInt("id");
        Integer quantidade = rs.getInt("quantidade");

        Votos v = new Votos(id, quantidade);
        return v;
    }

    private Votos preencherVotos(ResultSet rs) throws SQLException {
        Integer id = rs.getInt("id");
        Integer idcandidato = rs.getInt("idcandidato");
        Integer quantidade = rs.getInt("quantidade");

        Votos v = new Votos(id, idcandidato, quantidade);
        return v;
    }

    private Candidato preencherCandidato(ResultSet rs) throws SQLException {
        Integer id = rs.getInt("id");
        String nome = rs.getString("nome");
        String partido = rs.getString("partido");

        Candidato c = new Candidato(id, nome, partido);
        return c;
    }
}
