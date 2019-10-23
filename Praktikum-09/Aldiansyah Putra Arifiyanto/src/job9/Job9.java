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
public class Job9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sepeda sp = new Sepeda("Sepeda", "bmx");
        SepedaMotor sm = new SepedaMotor("Sepeda Motor", "jupiter");
        Mobil m = new Mobil("Mobil", "xenia");
        
        
        sp.tambahGear();
        sp.tambahKecepatan();
        sp.info();
        
        sm.tambahGear();
        sm.tambahKecepatan();
        sm.tambahKecepatan();
        sm.tambahKecepatan();
        sm.rem();
        sm.info();
        
        m.tambahGear();
        m.tambahKecepatan();
        m.info();
        m.tambahGear();
        m.tambahKecepatan();
        m.tambahKecepatan();
        m.info();
    }
}

    