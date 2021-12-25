/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211225;
public class Ch1_15 {
    public static void main(String[] args) {
        tag1:
        for (int i = 1;i<=5;i++){            
            for (int k = 1; k <= 3;k++){      
                System.out.printf("Start:%d*%d ===",i,k);
                //if ( i == 3){break;}                
                //if ( i == 3){continue;}                
               // if ( i == 3){break tag1;}                
                if ( i == 3){continue tag1;}                
                System.out.printf("%2d*%2d=%2d ",i,k,i*k);  
                System.out.println();
            }
            System.out.println();
        }        
    }
}
