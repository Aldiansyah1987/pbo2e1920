/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan9.interfacelatihan;

/**
 *
 * @author Kian Arata
 */
public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa)
    {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri Anda....");
        
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        
        System.out.println("----------------------------------------------");
    }
}
