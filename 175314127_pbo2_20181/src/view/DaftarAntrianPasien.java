/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Alexander Adam
 */
public class DaftarAntrianPasien extends JDialog{
    private JLabel judulLabel;
    private JLabel namaLabel;
    private JTextField namaText;
    private JButton saveButton;
    
    public void init(){
        this.setLayout(null);
        
        namaLabel = new JLabel("Daftar Pasien");
        namaLabel.setBounds(100, 200 ,250 ,100);
        this.add(judulLabel);
    }
}
