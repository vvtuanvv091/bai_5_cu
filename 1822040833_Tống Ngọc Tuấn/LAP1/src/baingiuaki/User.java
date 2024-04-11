/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baingiuaki;
import java.util.Vector;

public class User {
    public String ten;
    public String matKhau;
    public String duongDan;
    public int quyen;

    public static final int READ = 0;
    public static final int WRITE = 1;
    public static final int ALL = 2;

    public User(String ten, String matKhau, String duongDan, int quyen) {
        this.ten = ten;
        this.matKhau = matKhau;
        this.duongDan = duongDan;
        this.quyen = quyen;
    }
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getDuongDan() {
        return duongDan;
    }

    public void setDuongDan(String duongDan) {
        this.duongDan = duongDan;
    }

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }

    public boolean laUser(String ten) {
        return ten.equals(this.ten);
    }

    public boolean laUser(int quyen) {
        return quyen == this.quyen;
    }

    public Vector hienThiRow() {
        Vector row = new Vector();
        row.add(ten);
        row.add(matKhau);
        row.add(duongDan);
        row.add(quyen);
        return row;
    }
}
