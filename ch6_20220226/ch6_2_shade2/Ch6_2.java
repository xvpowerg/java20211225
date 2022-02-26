/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220226.ch6_2_shade2;

/**
 *
 * @author xvpow
 */
public class Ch6_2 {
//shade 定義
  //如果有繼承關係
   //子類與父類相同名稱的屬性 或相同名稱的靜態屬性 相同名稱的靜態方法都是遮蔽
 //子類方法如符合override 不是遮蔽
    //重點:
    //遮蔽看類別
    //複寫看物件
    
    public static void main(String[] args) {
        // TODO code application logic here
        Test2 t2 = new Test2();
        Test1 t1 = t2;
        t2.setV1("Test2 V1");
        t2.setV2("Test2 V2");
        
        t1.setV1("Test1 V1");
        t1.setV2("Test1 V2");
        
        System.out.println("Test2:"+t2);
        System.out.println("Test2:"+"v1:"+t2.getV1()+" v2:"+t2.getV2());
        
        System.out.println("Test1:"+t1);
        System.out.println("Test1:"+"v1:"+t1.getV1()+" v2:"+t1.getV2());
        
    }
    
}
