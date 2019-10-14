/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan35.objectorientedprogramtunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class PBOUlang10116458Latihan35ObjectOrientedProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tunjangan tun = new Tunjangan();
        Scanner scnr = new Scanner(System.in);

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        tun.gajiPokok = scnr.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        tun.status = scnr.next();

        tun.HasilHitung(tun.status,tun.gajiPokok);
    }
    
}
