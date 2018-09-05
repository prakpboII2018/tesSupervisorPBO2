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
    
    public DaftarAntrianPasien(String judul){
        this.setTitle(judul);
        init();
        Text();
    }
    public void init(){
        this.setLayout(null);
        
        judulLabel = new JLabel("Daftar Antrian Pasien");
        judulLabel.setBounds(150, 50 ,150 ,50);
        this.add(judulLabel);
        
        namaLabel= new JLabel("nama :");
        namaLabel.setBounds(60,100,100,50);
        this.add(namaLabel);
        
        
      
    }
    public void Text(){
              
        namaText = new JTextField();
        namaText.setBounds(105, 115,50,200);
        namaText.setSize(50, 20);
        this.add(namaText);
    }
}
