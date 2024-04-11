/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baingiuaki;

/**
 *
 * @author lyhuy
 */
public class Baingiuaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        QLUser ql = new QLUser (100);
        
        //frmGiaoDien obj= new frmGiaoDien(ql);
        frmTaoUser obj= new frmTaoUser(ql);
        obj.setVisible(true);
    }
    
}
