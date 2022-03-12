/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220312.ch8_5_lambda6;

/**
 *
 * @author xvpow
 */
public class Ch8_5 {

    public static void main(String[] args) {
        TestIF5  tif5_1 = new TestIF5(){
            public Product test5(String n,int p){
                return new Product(n,p);
            }
        };
        System.out.println(tif5_1.test5("產品1", 50));
        
        TestIF5 tif5_2 = (String n,int p) ->{
        return new Product(n,p);
        };
        System.out.println(tif5_1.test5("產品2", 90));
        
        TestIF5  tif5_3 = (n,p)-> new Product(n,p);       
          System.out.println(tif5_3.test5("產品3", 180));
          
          TestIF5  tif5_4 = Product::new;
          System.out.println(tif5_4.test5("產品4", 75));
          
          TestIF5_2 tif52= Product::new;
          System.out.println(tif52.test52());//未填寫:-1
    }
    
}
