/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20220409.Ch12_1_streeam1;

/**
 *
 * @author xvpow
 */
public class Book {
    private String name;
    private int price;
    public Book(String name,int price){
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return name+":"+price;
    }
}
