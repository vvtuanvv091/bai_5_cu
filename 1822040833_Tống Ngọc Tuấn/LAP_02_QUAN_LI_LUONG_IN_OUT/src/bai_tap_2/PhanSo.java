/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_tap_2;
import java.io.Serializable;
public class PhanSo implements Serializable{
    private int tuso;
    private int mauso;
    public PhanSo(boolean a)
    {
        tuso=(int)(Math.random()*100);
        do{
            mauso=(int)(Math.random()*90+1);
        }while(mauso==0);
    }
    public PhanSo(){
        tuso=(int)(Math.random())*100;
        do{
            mauso=(int)(Math.random())*90+1;
        }while(mauso==0);
    }
    public PhanSo(int tuso,int mauso)
    {
        this.tuso=tuso;
        if(mauso==0)
        {
            mauso=1;
        }else{
            this.mauso=mauso;
        }
    }
    public String toString(){
        return tuso+"/"+mauso;
    }
    public int getMauso(){
        return mauso;
    }
}