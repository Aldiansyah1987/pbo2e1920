/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author Aldiansyah
 */
public class PermanentEmployee extends Employee implements Payable{
    private int salary;
    
    public PermanentEmployee (String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    @Override
    public int getPaymentAmount() {
        return (int) (salary + 0.05 * salary);
    }
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as permanent employee with salaryr"+salary+"\n";
        return info;
    }
    
}

