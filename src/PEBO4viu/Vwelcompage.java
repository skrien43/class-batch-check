/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PEBO4viu;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author dhamar-10122877
 */
public class Vwelcompage extends JFrame {
    private JButton startButton, exitButton;
    
    public Vwelcompage() {
        setTitle("Program Biodata");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        
        JLabel label1 = new JLabel("Selamat Datang di Program Cek Angkatan Mahasiswa");
        JLabel label2 = new JLabel("Silakan tekan 'START' untuk memulai atau tekan 'EXIT' untuk keluar Program");
        JLabel label3 = new JLabel("Copyright_10122877  ©2024");
        label1.setFont(new Font("Calibri", Font.BOLD, 22));
        label2.setFont(new Font("Calibri", Font.BOLD, 17));
        label3.setFont(new Font("Arial", Font.PLAIN, 10));
        label1.setBorder(BorderFactory.createEmptyBorder(90, 0, 10, 0));
        label2.setBorder(BorderFactory.createEmptyBorder(0, 0, 54, 0));
        
        exitButton = new JButton("EXIT");
        startButton = new JButton("START");
        startButton.setFont(new Font("Calibri", Font.PLAIN, 15));
        exitButton.setFont(new Font("Calibri", Font.PLAIN, 15));
        exitButton.setBackground(Color.RED);
        exitButton.setForeground(Color.WHITE);
        exitButton.setBorderPainted(false);
        
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Vnama();
                dispose();
            }
        });
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 60));
        buttonPanel.add(exitButton);
        buttonPanel.add(startButton);
        
        setLayout(new BorderLayout());
        JPanel labelPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        labelPanel.add(label1, gbc);
        gbc.gridy++;
        labelPanel.add(label2, gbc);
        gbc.gridy++;
        labelPanel.add(label3, gbc);
        add(labelPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
    }
}
