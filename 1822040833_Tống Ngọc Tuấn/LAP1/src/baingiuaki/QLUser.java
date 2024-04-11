/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baingiuaki;

import java.util.Vector;

public class QLUser {
    public User[] users;
    public int MAXN;
    public int n;

    public QLUser(int MAXN) {
        this.MAXN = MAXN;
        this.users = new User[MAXN];
        this.n = 0;
    }

    public void themUser(User user) {
        users[n] = user;
        n++;
    }

    public Vector timKiem(String ten) {
        Vector rows = new Vector();
        for (int i = 0; i < n; i++) {
            if (users[i].laUser(ten)) {
                rows.add(users[i].hienThiRow());
            }
        }
        return rows;
    }

    public Vector timKiem(int quyen) {
        Vector rows = new Vector();
        for (int i = 0; i < n; i++) {
            if (users[i].laUser(quyen)) {
                rows.add(users[i].hienThiRow());
            }
        }
        return rows;
    }
}
