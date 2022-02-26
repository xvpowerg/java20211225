/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220226.ch6_6_Test2.p1;

/**
 *
 * @author xvpow
 */
public class Employee {
      private String name;
      private int salary;
      //幫我寫 Employee equals
      //幫我寫 Employee toString
      public Employee(String name,int salary){
          this.name = name;
          this.salary = salary;
      }
      public void setSalary(int salary){
          this.salary = salary;
      }
      public int getSalary(){
          return salary;
      }
      
      public void setName(String name){
          this.name = name;
      }
      public String getName(){
          return name;
      }
      
      public boolean equals(Object obj){
          if (obj == null || !(obj instanceof Employee)){
              return false;
          }
          Employee emp = (Employee)obj;
          return this.salary == emp.salary && this.name.equals(emp.name);
      }
      public String toString(){
          return this.getName()+":"+this.getSalary();
      }
}
