package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class upi1k extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1;
            //b2,b3;
  
    upi1k(){
        setTitle("VKIT-ATM");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/1krs.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(250, 90, 250, 250);
        add(l11);
        
        l1 = new JLabel("Pay Using UPI APP");
        l1.setFont(new Font("Osward", Font.BOLD, 38));
        l1.setBounds(200,40,450,40);
        add(l1);
        
        l2 = new JLabel("REF NO.:");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));
        l2.setBounds(125,350,375,30);
        add(l2);
        
        tf1 = new JTextField(15);
        tf1.setBounds(300,350,230,30);
        tf1.setFont(new Font("Arial", Font.BOLD, 14));
        add(tf1);
        
        /*l3 = new JLabel("PIN:");
        l3.setFont(new Font("Raleway", Font.BOLD, 28));
        l3.setBounds(125,220,375,30);
        add(l3);
        
        pf2 = new JPasswordField(15);
        pf2.setFont(new Font("Arial", Font.BOLD, 14));
        pf2.setBounds(300,220,230,30);
        add(pf2);*/
                
        b1 = new JButton("OKAY");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        /*b2 = new JButton("FastCASH");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("SIGN UP");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);*/
        
        setLayout(null);
        
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(300,390,100,30);
        add(b1);
        
        /*b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(430,300,100,30);
        add(b2);
        
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setBounds(300,350,230,30);
        add(b3);*/
        
        b1.addActionListener(this);
        //b2.addActionListener(this);
        //b3.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,480);
        setLocation(550,200);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        try{        
            if(ae.getSource()==b1){
            JOptionPane.showMessageDialog(null, "COLLECT THE CASH");
            this.setVisible(false);
            new Login().setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new upi1k().setVisible(true);
    }

    
}



