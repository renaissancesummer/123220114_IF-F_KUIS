/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KUIS123220114;

import KUIS123220114.LoginPage;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Lab Informatika
 */
public class halamanutama extends JFrame implements ActionListener {
    
    JLabel tulisanbesar = new JLabel ("Selamat datang, ");
    JLabel tulisankedua = new JLabel ("Silahkan pilih menu dibawah untuk membeli majalah.");
    JButton anak = new JButton ("Majalah Anak");
    JButton remaja = new JButton ("Majalah Remaja");
    JButton dewasa = new JButton ("Majalah Dewasa");
    
    halamanutama(String username){
        setVisible(true);
        setSize(550, 550);
        setTitle("Majalah");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add(tulisanbesar);
        add(tulisankedua);
        add(anak);
        add(remaja);
        add(dewasa);
        
        tulisanbesar.setText("Welcome, " + username);
        tulisanbesar.setFont(tulisanbesar.getFont().deriveFont(30.0F));
        tulisanbesar.setBounds(40, 40, 400, 35);
        tulisankedua.setFont(tulisankedua.getFont().deriveFont(15.0F));
        tulisankedua.setBounds(40, 70, 400, 35);
        
        anak.setBounds(40, 190, 450, 35);
        remaja.setBounds(40, 240, 450, 35);
        dewasa.setBounds(40, 290, 450, 35);
        anak.setFont(tulisankedua.getFont().deriveFont(15.0F));
        remaja.setFont(tulisankedua.getFont().deriveFont(15.0F));
        dewasa.setFont(tulisankedua.getFont().deriveFont(15.0F));
        anak.addActionListener(this);
        dewasa.addActionListener(this);
        remaja.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == anak){
                new Frameanak();
                this.dispose();
            }
            else if(e.getSource() == remaja){
                new frameremaja();
                this.dispose();
            }
            else{
                new framedewasa();
                this.dispose();
            }
        } catch (Exception error){
        
        }
    }
        
}
