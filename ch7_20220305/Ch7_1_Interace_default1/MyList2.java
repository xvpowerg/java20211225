/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20220305.Ch7_1_Interace_default1;

/**
 *
 * @author xvpow
 */
public class MyList2  implements  MyIterator{
    public static final int MAX_SIZE=1000000;
    private String[] data = new String[MAX_SIZE];
    private int size = 0;
    private int count = 0;
    public String get(int index){     
        if (index >= size || index < 0 || index >=MAX_SIZE ){
            throw new ArrayIndexOutOfBoundsException("超出MyList的Index");
        }
        return data[index];
    }
    public void add(String add){
        data[size++] = add;
    }
    
    public int getSize(){
        return size;
    }
    
    public String getValue(){
        return data[count++];
    }
    public boolean hasNext(){
        if (count < size){
            return true;
        }
        count = 0;
        return false;
    }
}
