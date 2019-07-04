/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Candidato;
import Model.CandidatoDao;

import java.util.ArrayList;


public class CandidatoController {
    CandidatoDao dao;
      public ArrayList<Candidato> buscarCandidato() {
        dao = new CandidatoDao();
        return dao.buscarTodos();
    }
}
