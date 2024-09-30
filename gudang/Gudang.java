/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gudang;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author LENOVO
 */
public class Gudang extends javax.swing.JFrame{
    private DefaultTableModel model=null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k=new koneksi();
    
    public Gudang() {
        initComponents();
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Koneksi k=new Koneksi():(
        k.connection():*/
        // TODO code application logic here
        login l = new login();
        l.setVisible(true);
    }
    
}