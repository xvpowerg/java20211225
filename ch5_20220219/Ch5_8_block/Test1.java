/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220219.Ch5_8_block;

import java.util.Arrays;

/**
 *
 * @author xvpow
 */
public class Test1 {
    private String[] srtArray = new String[50000];
    //所有建構式都需要做某件事 可使用初始化區塊
    {
        for (int i = 0;i < srtArray.length;i++){
                srtArray[i] = "";
            }
    }

    /*
       對陣列初始化
    */
    public Test1(){}
    
    public Test1(int size){        
      srtArray =  
              Arrays.copyOf(srtArray, size);        
    }
    
    public Test1(int size,String v){
    
    }
    public boolean append(int index,String v){
        if (index < 0  || index > srtArray.length){
            return false;
        }
        srtArray[index] = v;
        return true;
    }
    public boolean find(String msg){
        for(String s : srtArray){
            if (s.equals(msg)){
                return true;
            }
        }
        return false;
    }
}
