/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Votos {
Integer id;
Integer idcandidato;
Integer quantidade;

    public Votos(Integer id, Integer quantidade) {
        this.id = id;
        this.quantidade = quantidade;
    }

    public Votos(Integer id, Integer idcandidato, Integer quantidade) {
        this.id = id;
        this.idcandidato = idcandidato;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdcandidato() {
        return idcandidato;
    }

    public void setIdcandidato(Integer idcandidato) {
        this.idcandidato = idcandidato;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    
}
