/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ichwal Melianto
 */
public class Home_View extends JFrame{
    
    int JData;
    public JLabel lJudul;
    
    public JButton bTambah, bHapus, bEdit, bCari, bTampil, bKeluar;
    String data[][] = new String[500][7];
    
    DefaultTableModel TModel;
    JScrollPane SPane;
    public Object NKolom[] = {"ID","Judul Buku","Genre Buku","Penulis","Penerbit","Lokasi","Stok"};
    public JTable tabel = new JTable(data,NKolom);
    
    public Home_View(){
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
        SPane.setBounds(20, 70, 675, 350);
            
        lJudul = new JLabel("PERPUSTAKAAN UMUM YOGYAKARTA");
            lJudul.setFont(new Font("SansSerif", Font.BOLD, 32));
        
        bTambah = new JButton("Tambah");
        bHapus= new JButton("Hapus");
        bEdit = new JButton("Edit");
        bCari = new JButton("Cari");
        bTampil = new JButton("Tampil");
        bKeluar = new JButton("Keluar");
        
        //LABEL
        lJudul.setBounds(130, 10, 700, 70);
        
        //ADD COMPONENT
        add(lJudul);
        add(bTambah);
        add(bHapus);
        add(bEdit);
        add(bCari);
        add(bTampil);
        add(bKeluar);
        
        //BUTTON
        bTambah.setBounds(700, 70, 150, 50);
            bTambah.setFont(new Font("SansSerif", Font.BOLD, 18));
        bHapus.setBounds(700, 130, 150, 50);
            bHapus.setFont(new Font("SansSerif", Font.BOLD, 18));
        bEdit.setBounds(700, 190, 150, 50);
            bEdit.setFont(new Font("SansSerif", Font.BOLD, 18));
        bCari.setBounds(700, 250, 150, 50);
            bCari.setFont(new Font("SansSerif", Font.BOLD, 18));
        bTampil.setBounds(700, 310, 150, 50);
            bTampil.setFont(new Font("SansSerif", Font.BOLD, 18));
        bKeluar.setBounds(700, 370, 150, 50);
            bKeluar.setFont(new Font("SansSerif", Font.BOLD, 18));
    }
}
