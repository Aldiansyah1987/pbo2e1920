/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job9;

/**
 *
 * @author Aldiansyah
 */
public class Sepeda extends Kendaraan implements IKendaraan{
    public String merk;
    public int gear = 0;
    public int kecepatan = 0;
    
    public Sepeda(String jenisKendaraan, String merk){
        super(jenisKendaraan);
        this.merk = merk;
    }

    @Override
    public void tambahGear() {
        if (gear>=0) {
        gear += 1;    
        }
        else{
    }
}

    @Override
    public void kurangiGear() {
        if (gear == 0) {
            System.out.println("Gear di 0, tidak bisa di kurangi");
        }
        else{
            gear -=1;
    }
    }
    @Override
    public void tambahKecepatan() {
        kecepatan += 5;
    }

    @Override
    public void rem() {
        if (kecepatan == 0) {
            System.out.println("kecepatan masih di angka 0");
        }else{
            kecepatan -= 5;
        }
    }
    public void info(){
        super.info();
        System.out.println("Merek       : "+this.merk);
        System.out.println("Gear        : "+this.gear);
        System.out.println("Kecepatan   : "+this.kecepatan);
        System.out.println("-------------------------------------");
    }

}
