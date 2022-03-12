/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20220312.ch8_5_lambda6;

/**
 *
 * @author xvpow
 */
public class Product {
    private String name = "";
    private int price = 0;
    public Product(){
    name = "未填寫";
    price = -1;
    }
    public Product(String name,int price){
    this.name = name;
    this.price = price;
    }
    
    public String toString(){
        return name+":"+price;
    }
}
