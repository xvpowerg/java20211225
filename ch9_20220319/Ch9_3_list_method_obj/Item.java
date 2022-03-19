/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20220319.Ch9_3_list_method_obj;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    private int price;
    public Item(String name,int price){
        this.name = name;
        this.price = price;
    }
    
    public String toString(){
        return name+":"+price;
    }
    
    public boolean equalse(Object obj){
        if (obj == null || obj instanceof Item == false){
            return false;
        }
        Item i1 = (Item)obj;
        return this.name.equals(i1.name) && this.price == i1.price;
    }
}
