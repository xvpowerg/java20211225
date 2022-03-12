/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20220312.ch8_11_enum1;

/**
 *
 * @author xvpow
 */
public class MediePlay {
    enum Action{
        PLAY,
        STOP,
        PAUSE,
        EXIT
    }
    
    public static void action(Action action){
        switch(action){              
            case  PLAY:
                System.out.println("播放");
                break;
            case STOP:
                System.out.println("停止");
                break;
            case PAUSE:
                System.out.println("暫停");
                break;
            case EXIT: 
                System.out.println("離開");
               break;
        }
    }
    
}
