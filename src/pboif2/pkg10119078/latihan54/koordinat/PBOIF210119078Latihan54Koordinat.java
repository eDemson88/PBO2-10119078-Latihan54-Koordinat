/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan54.koordinat;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       WarnaKoordinat w = new WarnaKoordinat(10,4,"Jingga");
       
        System.out.println("Warna Koordinat : " + w.getNamaWarna());
        System.out.println("Koordinat Sumbu : x :" + w.getX() + " , y : " + w.getY());
    }
    
}
