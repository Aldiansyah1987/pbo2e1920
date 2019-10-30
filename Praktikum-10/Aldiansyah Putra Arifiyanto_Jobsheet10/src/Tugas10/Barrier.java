/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas10;

/**
 *
 * @author Aldiansyah
 */
public class Barrier implements Destroyable{
     private int strength;
    public Barrier(int strength) {
        this.strength = strength;
    }
    @Override
    public void destroyed() {
        this.strength -= strength * 0.1;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getStrength() {
        return strength;
    }
    public String getBarrierInfo(){
        return "\nBarrier Strength = " + this.strength + "\n";
    }
}


