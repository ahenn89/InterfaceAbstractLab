/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import javax.swing.JOptionPane;
/**
 *
 * @author Ashlee
 */
public class Reports {
     private String report = "";
    
    public void addData(String data) {
        report += data;
    }
    public void outputReport() {
        System.out.println(report);
    }
    
    public void clearReport() {
        report = "";
    } 
}
