/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20220305.Ch7_6_Interface_functional;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class TestUnaryOperator implements UnaryOperator<Integer>{
    public Integer apply(Integer data){
        return data + 5;
    }
}
