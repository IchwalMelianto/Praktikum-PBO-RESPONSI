/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cari;

import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ichwal Melianto
 */
public class Cari_View extends JFrame{
    
    int JData;
    public JLabel lJudul;
    public JLabel lTanya;
    public JTextField fTanya;
    public JButton bCari, bTampil, bKeluar;
    public JRadioButton rJudulBuku, rGenreBuku, rPenulis, rPenerbit, rLokasi, rStok;
    public ButtonGroup bg=new ButtonGroup();
    String data[][] = new String[500][7];
    
    DefaultTableModel TModel;
    JScrollPane SPane;
    public Object NKolom[] = {"ID","Judul Buku","Genre Buku","Penulis","Penerbit","Lokasi","Stok"};
    public JTable tabel = new JTable(data,NKolom);
    
    public Cari_View(){
        setTitle("PERPUSTAKAAN UMUM YOGYAKARTA");
        SPane = new JScrollPane(tabel);
        add(SPane);
        SPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setSize(900,500);
        setLocationRelativeTo(null);
        add(SPane);
        SPane.setBounds(20, 70, 640, 350);
            
        lJudul = new JLabel("PERPUSTAKAAN UMUM YOGYAKARTA");
            lJudul.setFont(new Font("SansSerif", Font.BOLD, 32));
        fTanya = new JTextField();
            lTanya = new JLabel("Input Yang Dicari ");
            
        rJudulBuku = new JRadioButton("Judul Buku");
        rGenreBuku = new JRadioButton("Genre Buku");
        rPenulis = new JRadioButton("Penulis");
        rPenerbit = new JRadioButton("Penerbit");
        rLokasi = new JRadioButton("Lokasi");
        rStok = new JRadioButton("Stok");
        bCari = new JButton("Cari");
        bTampil = new JButton("Tampil");
        bKeluar = new JButton("Keluar");
        
        //LABEL
        lTanya.setBounds(665, 240, 140, 30);
            lTanya.setFont(new Font("SansSerif", Font.BOLD, 14));
        lJudul.setBounds(130, 10, 700, 70);
        
        //TEXTFIELD
        fTanya.setBounds(665, 270, 200, 30);
            fTanya.setFont(new Font("SansSerif", Font.BOLD, 14));
        
        //ADD COMPONENT
        add(fTanya);
        add(lTanya);
        add(lJudul);
        add(bCari);
        add(bTampil);
        add(bKeluar);
        bg.add(rJudulBuku);
        bg.add(rGenreBuku);
        bg.add(rPenulis);
        bg.add(rPenerbit);
        bg.add(rLokasi);
        bg.add(rStok);
        add(rJudulBuku);
        add(rGenreBuku);
        add(rPenulis);
        add(rPenerbit);
        add(rLokasi);
        add(rStok);
        
        //RADIOBUTTON
        rJudulBuku.setBounds(665, 60, 200, 40);
            rJudulBuku.setFont(new Font("SansSerif", Font.BOLD, 14));
        rGenreBuku.setBounds(665, 90, 200, 40);
            rGenreBuku.setFont(new Font("SansSerif", Font.BOLD, 14));
        rPenulis.setBounds(665, 120, 200, 40);
            rPenulis.setFont(new Font("SansSerif", Font.BOLD, 14));
        rPenerbit.setBounds(665, 150, 200, 40);
            rPenerbit.setFont(new Font("SansSerif", Font.BOLD, 14));
        rLokasi.setBounds(665, 180, 200, 40);
            rLokasi.setFont(new Font("SansSerif", Font.BOLD, 14));
        rStok.setBounds(665, 210, 200, 40);
            rStok.setFont(new Font("SansSerif", Font.BOLD, 14));
            
        //BUTTON
        bCari.setBounds(665, 305, 200, 35);
            bCari.setFont(new Font("SansSerif", Font.BOLD, 18));
        bTampil.setBounds(665, 345, 200, 35);
            bTampil.setFont(new Font("SansSerif", Font.BOLD, 18));
        bKeluar.setBounds(665, 385, 200, 35);
            bKeluar.setFont(new Font("SansSerif", Font.BOLD, 18));
    }
    
    public String getTanya(){
        return fTanya.getText();
    }
}
