/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tambah;

import Home.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Ichwal Melianto
 */
public class Tambah_Controller {
    Tambah_Model tmodel;
    Tambah_View tview;
    Home_View hview;
    
    public Tambah_Controller(Tambah_View tview, Tambah_Model tmodel){
        this.tview = tview;
        this.tmodel = tmodel;
        
        if (tmodel.getBanyakData()!= 0){
            String dataMahasiswa[][] = tmodel.readData();
            //hview.tabel.setModel((new JTable(dataMahasiswa, hview.NKolom)).getModel());
        }

        tview.bTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String JudulBuku = tview.getJudulBuku();
                String GenreBuku = tview.getGenreBuku();
                String Penulis = tview.getPenulis();
                String Penerbit = tview.getPenerbit();
                String Lokasi = tview.getLokasi();
                String Stok = tview.getStok();
                tmodel.insertData(JudulBuku,GenreBuku,Penulis,Penerbit,Lokasi,Stok);
                
                tview.fJudulBuku.setText("");
                tview.fGenreBuku.setText("");
                tview.fPenulis.setText("");
                tview.fPenerbit.setText("");
                tview.fLokasi.setText("");
                tview.fStok.setText("");
                
                String dataMahasiswa[][] = tmodel.readData();
                tview.setVisible(false);
                new Home_MVC();
            }
        });
        
        tview.bBatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tview.setVisible(false);
                new Home_MVC();
            }
        });
    }
}
