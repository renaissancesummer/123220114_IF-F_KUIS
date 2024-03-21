/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KUIS123220114;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class LoginPage extends JFrame implements ActionListener {
    JLabel tulisanbesar = new JLabel ("Selamat Datang");
    JLabel tulisankedua = new JLabel ("Login terlebih dahulu.");
    JLabel username = new JLabel ("Username");
    JLabel password = new JLabel ("Password");
    JTextField inputusername = new JTextField();
    JTextField inputpass = new JTextField();
    JButton login = new JButton ("Login");

    LoginPage(){
        setVisible(true);
        setSize(550, 550);
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add(tulisanbesar);
        tulisanbesar.setFont(tulisanbesar.getFont().deriveFont(30.0F));
        tulisanbesar.setBounds(40, 40, 400, 35);
        
        add(tulisankedua);
        tulisankedua.setFont(tulisankedua.getFont().deriveFont(20.0F));
        tulisankedua.setBounds(40, 70, 300, 35);
        
        add(username);
        add(password);
        add(inputusername);
        add(inputpass);
        add(login);
        
        username.setBounds(40, 130, 150, 50);
        inputusername.setBounds(40, 170, 450, 35);
        username.setFont(username.getFont().deriveFont(17.0F));
        
        password.setBounds(40, 220, 150, 50);
        inputpass.setBounds(40, 260, 450, 35);
        password.setFont(password.getFont().deriveFont(17.0F));
        
        login.setBounds(40, 390, 450, 35);
        login.setFont(login.getFont().deriveFont(17.0F));
        login.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String username = inputusername.getText();
            String pass = inputpass.getText();
        
            if(username.isEmpty() || pass.isEmpty()){
                throw new Exception ("Field must not be blank");
            }
        
            new halamanutama(username);
            this.dispose();
        } catch (Exception error){
            JOptionPane.showMessageDialog(null, error.getMessage());
        }
        
    }
    
    
}
