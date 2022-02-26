/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220226.ch6_8_report;
import ch6_20220226_report.erp.MyErpReport;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class MyReport extends MyErpReport {
    protected void reportStyle(ArrayList<String> data){
        for (String v : data){
            String[] arrayData = v.split(":");                    
            System.out.println("name:"+arrayData[0]+
                    " score:"+arrayData[1]);
        }
    }
}
