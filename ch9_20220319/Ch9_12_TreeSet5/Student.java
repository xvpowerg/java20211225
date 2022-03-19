/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20220319.Ch9_12_TreeSet5;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int score1;
    private int score2;
  public Student(String name,int score1,int score2){
      this.name = name;
      this.score1 = score1;
      this.score2 = score2;              
  }  
    
    public int getScore1(){
        return this.score1;
    }
    public int getScore2(){
        return this.score2;
    }
    public String getName(){
        return this.name;
    }
  
    public boolean equals(Object obj) {
        if (obj == null || obj instanceof Student == false) {
            return false;
        }
        Student tmpSt = (Student) obj;
        return this.score1 == tmpSt.score1 && 
                this.score2 == tmpSt.score2 &&
                this.name.equals(tmpSt.name);
    }
    //hashCode 一樣才比equals
    //hashCode 不一樣不用比equals
    public int hashCode(){
        return this.score1 + score2+name.hashCode();
    }
  public String toString(){
      return name+":"+score1+":"+score2;
  }
}
