/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Votos;
import Model.VotosDao;
import java.util.ArrayList;


public class VotosController {
    VotosDao dao;
    
    public ArrayList<Votos> buscarVotos() {
        dao = new VotosDao();
        return dao.buscarTodos();
    }
    public void CapturarVotos(Integer id) {
        dao = new VotosDao();
        dao.Contador(id);
    }

}
