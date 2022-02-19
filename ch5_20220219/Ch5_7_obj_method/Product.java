/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220219.Ch5_7_obj_method;


public class Product {
    private String name;
    private int price;
   public Product(String name,int price){
       this.name = name;
       this.price = price;
   }        
   
   public String toString(){
       return name+":"+price;
   }
   
   public boolean equals(Object obj){
       if (obj == null || obj.getClass() != this.getClass()){
           return false;
       }
       if (obj == null ||  !(obj instanceof Product) ){
           return false;
       }
       Product p = (Product)obj;     
       if (p.name == null || this.name == null){
           return false;
       }
       return p.price == this.price && p.name.equals(this.name)  ;
   }
}
