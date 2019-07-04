/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Candidato {
Integer	id;
String Nome;
Integer numero;
String Partido;

    public Candidato(Integer id, String Nome, String Partido) {
        this.id = id;
        this.Nome = Nome;
        this.Partido = Partido;
    }

    public Candidato(Integer id, String Nome, Integer numero, String Partido) {
        this.id = id;
        this.Nome = Nome;
        this.numero = numero;
        this.Partido = Partido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPartido() {
        return Partido;
    }

    public void setPartido(String Partido) {
        this.Partido = Partido;
    }


}
