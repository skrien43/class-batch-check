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
public class Vkelas extends JFrame {
    private JTextField kelasField;
    private JButton nextButton, backButton;
    private String nama, npm;
    
    public Vkelas(String nama, String npm) {
        this.nama = nama;
        this.npm = npm;
        
        setTitle("Program Cek Angkatan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        
        JLabel kelasLabel = new JLabel("Ketikkan Kelas: ");
        kelasLabel.setFont(new Font("Calibri", Font.BOLD, 18));
        kelasField = new JTextField(40);
        kelasField.setFont(new Font("Calibri", Font.PLAIN, 18));
        
        nextButton = new JButton("NEXT");
        backButton = new JButton("BACK");
        nextButton.setFont(new Font("Calibri", Font.PLAIN, 15));
        backButton.setFont(new Font("Calibri", Font.PLAIN, 15));
        
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String kelas = kelasField.getText();
                if (kelas.isEmpty()) {
                    JOptionPane.showMessageDialog(Vkelas.this, "Kolom Kelas Tidak Boleh Kosong", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else if (kelas.length() > 5) {
                    JOptionPane.showMessageDialog(Vkelas.this, "Batas Maksimal Karakter adalah 5", "Perhatian", JOptionPane.WARNING_MESSAGE);
                } else {
                    new Vhasil(nama, npm, kelas);
                    dispose();
                }
            }
        });
        
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Vnpm(npm);
                dispose();
            }
        });
        
        setLayout(new FlowLayout());
        add(kelasLabel);
        add(kelasField);
        add(backButton);
        add(nextButton);
        setVisible(true);
    }
}
