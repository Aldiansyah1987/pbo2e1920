/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9.abstarctclass;

/**
 *
 * @author Riza Zulfah
 */
public class Orang {
    private String nama;
    private Hewan hewanPeliharaan;
    
    public Orang(String nama){
        this.nama = nama;
    }
    public void peliharaanHewan(Hewan hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }
    public void ajakPeliharaanJalan(){
        System.out.println("Namaku "+this.nama);
        System.out.println("Hewan Peliharaanku berjalan dengan cara : ");
        this.hewanPeliharaan.bergerak();
        System.out.println("-----------------------------------------------");
    }
}
