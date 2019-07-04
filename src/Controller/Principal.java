/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Urna;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Urna c = new Urna();
        c.setTitle("Urna");
        c.setLocationRelativeTo(null);
        c.setVisible(true);
        c.setResizable(false);
    }

   
}
