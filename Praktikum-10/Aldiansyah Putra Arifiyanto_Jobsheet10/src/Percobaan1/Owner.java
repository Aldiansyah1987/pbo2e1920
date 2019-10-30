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
public class Owner {
    public void pay(Payable p){
        System.out.println("TOtal payment ="+p.getPaymentAmount());
        if(p instanceof ElectricityBill){
            ElectricityBill eb = (ElectricityBill) p;
                System.out.println(""+eb.getBillIinfo());
            
        }else if(p instanceof PermanentEmployee){
            PermanentEmployee pe = (PermanentEmployee) p;
            pe.getEmployeeInfo();
            System.out.println(""+pe.getEmployeeInfo());
        }
        
    }
    public void showMyEmployee(Employee e){
        System.out.println(""+e.getEmployeeInfo());
            if(e instanceof PermanentEmployee){           
        }

    }
}
