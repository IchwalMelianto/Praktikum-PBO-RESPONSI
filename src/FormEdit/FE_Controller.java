/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormEdit;

import Tambah.*;
import Home.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author Ichwal Melianto
 */
public class FE_Controller {
    FE_Model femodel;
    FE_View feview;
    Home_View hview;
    
    public FE_Controller(FE_View feview, FE_Model femodel){
        this.feview = feview;
        this.femodel = femodel;
        
        if (femodel.getBanyakData()!= 0){
            String dataMahasiswa[][] = femodel.readData();
            //hview.tabel.setModel((new JTable(dataMahasiswa, hview.NKolom)).getModel());
        }
        
        feview.bCari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cari = feview.getTanya();
                String datacari[][] = femodel.searchData(cari);
                String IDBuku = femodel.IDBuku;
                String JudulBuku = femodel.JudulBuku;     
                String GenreBuku = femodel.GenreBuku;
                String Penulis = femodel.Penulis;
                String Penerbit = femodel.Penerbit;
                String Lokasi = femodel.Lokasi;
                String Stok = femodel.Stok;

                feview.fTanya.setText(IDBuku);
                feview.fJudulBuku.setText(JudulBuku);
                feview.fGenreBuku.setText(GenreBuku);
                feview.fPenulis.setText(Penulis);
                feview.fPenerbit.setText(Penerbit);
                feview.fLokasi.setText(Lokasi);
                feview.fStok.setText(Stok);
              
                feview.fJudulBuku.setEditable(true);
                feview.fGenreBuku.setEditable(true);
                feview.fPenulis.setEditable(true);
                feview.fPenerbit.setEditable(true);
                feview.fLokasi.setEditable(true);
                feview.fStok.setEditable(true);
            }
        });
        
        feview.bUbah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String IDBuku = feview.getTanya();
                String JudulBuku = feview.getJudulBuku();
                String GenreBuku = feview.getGenreBuku();
                String Penulis = feview.getPenulis();
                String Penerbit = feview.getPenerbit();
                String Lokasi = feview.getLokasi();
                String Stok = feview.getStok();
                femodel.updateData(IDBuku,JudulBuku,GenreBuku,Penulis,Penerbit,Lokasi,Stok);
                
                String dataMahasiswa[][] = femodel.readData();
                feview.setVisible(false);
                new Home_MVC();
            }
        });
        
        feview.bBatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feview.setVisible(false);
                new Home_MVC();
            }
        });
    }
}
