/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220312.ch8_12_enum2;

/**
 *
 * @author xvpow
 */
public class Ch8_11 {
    enum MyEnum{
        A1,B2,C3,E4;
        private String v1;
        public void setV1(String v1){
            this.v1 = v1;
        }
        public void test1(){
            System.out.println("Test1:"+this.name()+"v1:"+v1);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
          MyEnum.A1.setV1("A1產品");
        MyEnum.A1.test1();
    }
    
}
