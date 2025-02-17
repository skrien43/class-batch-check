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
public class Vnama extends JFrame{
    private JTextField namaField;
    private JButton nextButton, backButton;
    
    public Vnama() {
        setTitle("Program Cek Angkatan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        
        JLabel namaLabel = new JLabel("Ketikkan Nama: ");
        namaLabel.setFont(new Font("Calibri", Font.BOLD, 18));
        namaField = new JTextField(40);
        namaField.setFont(new Font("Calibri", Font.PLAIN, 18));
        
        nextButton = new JButton("NEXT");
        backButton = new JButton("BACK");
        nextButton.setFont(new Font("Calibri", Font.PLAIN, 15));
        backButton.setFont(new Font("Calibri", Font.PLAIN, 15));
        
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = namaField.getText();
                if (nama.isEmpty()) {
                    JOptionPane.showMessageDialog(Vnama.this, "Kolom Nama Tidak Boleh Kosong", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else if (nama.length() > 50) {
                    JOptionPane.showMessageDialog(Vnama.this, "Batas Maksimal Karakter adalah 50", "Perhatian", JOptionPane.WARNING_MESSAGE);
                } else {
                    new Vnpm(nama);
                    dispose();
                }
            }
        });
        
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Vwelcompage();
                dispose();
            }
        });
        
        setLayout(new FlowLayout());
        add(namaLabel);
        add(namaField);
        add(backButton);
        add(nextButton);
        setVisible(true);
    }
}
