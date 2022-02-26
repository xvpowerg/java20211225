/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220226.ch6_6_Test2.p2;
import ch6_20220226.ch6_6_Test2.p1.Employee;
/**
 *
 * @author xvpow
 */
public class Manager  extends Employee {
        public Manager(String name,int salary){
                    super(name,salary);
       }
        
        public String getName(){
            return "M:"+super.getName();
        }
        public int getSalary(){
            return super.getSalary()  + 1000;
        }
}
