/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220226.ch6_5_Test1;

/**
 *
 * @author xvpow
 */
public class Ch6_5 {
    public static final int MAX = 1;
    public static final int MIN = 2;
    static float compare(int action,float ...values){
         if(values == null || values.length == 0){
                throw new IllegalArgumentException("比較值不可空白");
            }
          float tmp = values[0];
          for (float v : values){
              switch(action){
                  case MAX:
                    tmp = tmp < v ? v : tmp;      
                  break;
                  case MIN:
                      tmp = tmp > v ? v : tmp;
                  break;
                  default:
                    throw new IllegalArgumentException("參數錯誤必須是1或2");  
              }              
          }
          return tmp;
    }
    static int compare(int action,int ... values){
            if(values == null || values.length == 0){
                throw new IllegalArgumentException("比較值不可空白");
            }
            int tmp = values[0];
            for (int v : values){
                switch(action){
                    case MAX:
                        //找最大
                        tmp = tmp < v?v:tmp;
                        break;
                    case MIN:
                        //找最小
                        tmp = tmp > v?v:tmp;
                        break;
                    default:
                        throw new IllegalArgumentException("參數錯誤必須是1或2");
                        
                }
            }
        return tmp;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //寫一個函數 名稱為compare
        //條件如下
        //1 可接收N筆整數或浮點
        //2 有個整數參數 如果1 表示找最大值 如果2 表示找最小值 
        //3 以上都不是拋出一個例外 訊息輸出 參數錯誤必須是1或2
        
        int max = compare(MAX,7,1,9,6,3,2);
        System.out.println(max);
        float max2 = compare(MIN,7.5f,3.8f,4.2f,11.9f,6.3f);
        System.out.println(max2);
    }
    
}
