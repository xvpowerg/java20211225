/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220219.Ch5_9_static_block;

import java.util.Arrays;

/**
 *
 * @author xvpow
 */
public class TestStaticBlock {
    private static String[] arrays = new String[50000];
    static{
       Arrays.fill(arrays, "");    
    }
    public static boolean find(String v){
            for (String st : arrays){
                   if (st.equals(v)) return true;
            }
            return false;
    }
    
}
