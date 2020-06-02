/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author KangKoder
 */
public class UserSession {
    
    private static String u_username;
    private static String u_nama;
    private static String u_password;
    private static String u_status;
    private static int u_id;
    
    public static int get_uid() {
        return u_id;
    }
    
    public static void set_uid(int u_id) {
        UserSession.u_id = u_id;
    }
    
    public static String get_username() {
        return u_username;
    }
    
    public static void set_username(String u_username) {
        UserSession.u_username = u_username;
    }
    
    public static String get_password() {
        return u_password;
    }
    
    public static void set_password(String u_password) {
        UserSession.u_password = u_password;
    }
    
    public static String get_status() {
        return u_status;
    }
    
    public static void set_status(String u_status) {
        UserSession.u_status = u_status;
    }
    
    public static String get_nama() {
        return u_nama;
    }
    
    public static void set_nama(String u_nama) {
        UserSession.u_nama = u_nama;
    }
    
}
