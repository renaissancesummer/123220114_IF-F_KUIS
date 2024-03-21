/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KUIS123220114;

import java.awt.event.ActionEvent;
import KUIS123220114.halamanutama;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class Frameanak extends JFrame implements ActionListener {
    
    JLabel beli = new JLabel ("Halaman Pembelian");
    JLabel kat = new JLabel ("Kategori");
    JLabel katego = new JLabel ("Majalah anak");
    JLabel harga = new JLabel ("Harga");
    JLabel piro = new JLabel ("Rp12,700/pcs");
    JLabel piro2 = new JLabel ("Rp12,700/pcs");
    JLabel jumlah = new JLabel ("Jumlah");
    JTextField berapa = new JTextField();
    JButton kembali = new JButton ("kembali");
    JButton cuy = new JButton ("Beli");
    JLabel total = new JLabel ("Total Pembelian");
    JLabel satuan = new JLabel ("Harga Satuan");
    JLabel jumlah2 = new JLabel ("Jumlah");
    JLabel toha = new JLabel ("Total Harga");
    
    Frameanak(){
        setVisible(true);
        setSize(550, 550);
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add(beli);
        add(kat);
        add(katego);
        add(harga);
        add(piro);
        add(piro2);
        add(jumlah);
        add(berapa);
        add(kembali);
        add(cuy);
        add(total);
        add(satuan);
        add(jumlah2);
        add(toha);
        
        beli.setBounds(40, 40, 200, 35);
        beli.setFont(beli.getFont().deriveFont(15.0F));
        kat.setBounds(40, 90, 200, 35);
        kat.setFont(kat.getFont().deriveFont(15.0F));
        katego.setBounds(250, 90, 200, 35);
        katego.setFont(katego.getFont().deriveFont(15.0F));
        
        harga.setBounds(40, 140, 200, 35);
        harga.setFont(harga.getFont().deriveFont(15.0F));
        piro.setBounds(250, 140, 200, 35);
        piro.setFont(piro.getFont().deriveFont(15.0F));
        
        jumlah.setBounds(40, 190, 200, 35);
        jumlah.setFont(jumlah.getFont().deriveFont(15.0F));
        berapa.setBounds(250, 190, 200, 35);
        
        kembali.setBounds(40, 240, 200, 35);
        kembali.setFont(kembali.getFont().deriveFont(15.0F));
        cuy.setBounds(280, 240, 200, 35);
        cuy.setFont(cuy.getFont().deriveFont(15.0F));
        
        total.setBounds(40, 290, 200, 35);
        total.setFont(total.getFont().deriveFont(15.0F));
        
        satuan.setBounds(40, 340, 200, 35);
        satuan.setFont(satuan.getFont().deriveFont(15.0F));
        piro2.setBounds(250, 340, 200, 35);
        piro2.setFont(piro2.getFont().deriveFont(15.0F));
        
        jumlah.setBounds(40, 340, 200, 35);
        jumlah.setFont(jumlah.getFont().deriveFont(15.0F));
        kembali.addActionListener(this);
        cuy.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            int jumlahbeli = Integer.parseInt(berapa.getText());
            String jumlahbel = "";
            int totalbayar = 0;
            if(e.getSource() == kembali){
                new halamanutama();
                this.dispose();
            }
            else if (e.getSource() == cuy)
                
        }catch (Exception error){
        
        }
    }
    
}
