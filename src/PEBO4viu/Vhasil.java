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
public class Vhasil extends JFrame {
    private JButton selesaiButton, backButton;
    private JLabel namaLabel, npmLabel, kelasLabel;
    
    public Vhasil(String nama, String npm, String kelas) {
        setTitle("Messages");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(575, 240);
        setLocationRelativeTo(null);
        
        String angLabel;
        if (npm.length() >= 4) {
          String duaCh = npm.substring(3, 5);
          switch (duaCh) {
            case "20":
                angLabel = nama +" adalah Angkatan 2020";
                break;
            case "21":
                angLabel = nama +" adalah Angkatan 2021";
                break;
            case "22":
                angLabel = nama +" adalah Angkatan 2022";
                break;
            case "23":
                angLabel = nama +" adalah Angkatan 2023";
                break;
            default:
                angLabel = nama +" tidak terdaftar pada Database";
                break;
            }
        } else {
            angLabel = nama +" tidak terdaftar pada Database";
        }

        String hasil = String.format(
            "<html>Nama : %s<br/>" +
            "dengan NPM : %s<br/>" +
            "dan Kelas  : %s<br/><br/>" +
            "%s</html>",
            nama, npm, kelas, angLabel);
        
        JLabel hasilLabel = new JLabel(hasil);
        hasilLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
        hasilLabel.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 10));
        
        backButton = new JButton("BACK");
        selesaiButton = new JButton("SELESAI");
        backButton.setFont(new Font("Calibri", Font.PLAIN, 15));
        selesaiButton.setFont(new Font("Calibri", Font.PLAIN, 15));
        selesaiButton.setBackground(Color.GREEN);
        selesaiButton.setBorderPainted(false);

        selesaiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Vkelas(nama, npm);
                dispose();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        buttonPanel.add(backButton);
        buttonPanel.add(selesaiButton);
        
        setLayout(new BorderLayout());
        add(hasilLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
    }
}
