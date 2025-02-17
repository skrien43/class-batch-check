/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PEBO4viu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author dhamar-10122877
 */
public class Vnpm extends JFrame {
    private JTextField npmField;
    private JButton nextButton, backButton;
    private String nama;
    
    public Vnpm(String nama) {
        this.nama = nama;
        
        setTitle("Program Cek Angkatan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        
        JLabel npmLabel = new JLabel("Ketikkan NPM: ");
        npmLabel.setFont(new Font("Calibri", Font.BOLD, 18));
        npmField = new JTextField(40);
        npmField.setFont(new Font("Calibri", Font.PLAIN, 18));
        
        nextButton = new JButton("NEXT");
        backButton = new JButton("BACK");
        nextButton.setFont(new Font("Calibri", Font.PLAIN, 15));
        backButton.setFont(new Font("Calibri", Font.PLAIN, 15));
        
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String npm = npmField.getText();
                if (npm.isEmpty()) {
                    JOptionPane.showMessageDialog(Vnpm.this, "Kolom NPM Tidak Boleh Kosong", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else if (npm.length() != 8) {
                    JOptionPane.showMessageDialog(Vnpm.this, "NPM Hanya bisa di isi sebanyak 8 Karakter", "Perhatian", JOptionPane.WARNING_MESSAGE);
                } else {
                    new Vkelas(nama, npm);
                    dispose();
                }
            }
        });
        
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Vnama();
                dispose();
            }
        });
        
        setLayout(new FlowLayout());
        add(npmLabel);
        add(npmField);
        add(backButton);
        add(nextButton);
        setVisible(true);
    }
}
