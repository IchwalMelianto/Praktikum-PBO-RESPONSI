/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cari;

import Home.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author Ichwal Melianto
 */
public class Cari_Controller {
    
    Cari_View cview;
    Cari_Model cmodel;
    
    public Cari_Controller(Cari_View cview, Cari_Model cmodel){
        this.cview = cview;
        this.cmodel = cmodel;
        
        if (cmodel.getBanyakData()!= 0) {
            String dataMahasiswa[][] = cmodel.readData();
            cview.tabel.setModel((new JTable(dataMahasiswa, cview.NKolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        cview.bCari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                if(cview.rJudulBuku.isSelected()){
                    String cari = cview.getTanya();
                    String datacari[][] = cmodel.searchDataJudul(cari);
                    String JudulBuku = cmodel.JudulBuku;
                    
                    String dataMahasiswa[][] = cmodel.readDataJudul(JudulBuku);
                    cview.tabel.setModel(new JTable(dataMahasiswa, cview.NKolom).getModel());
                }
                else if(cview.rGenreBuku.isSelected()){
                    String cari = cview.getTanya();
                    String datacari[][] = cmodel.searchDataGenre(cari);
                    String GenreBuku = cmodel.GenreBuku;
                    
                    String dataMahasiswa[][] = cmodel.readDataGenre(GenreBuku);
                    cview.tabel.setModel(new JTable(dataMahasiswa, cview.NKolom).getModel());
                }
                else if(cview.rPenulis.isSelected()){
                    String cari = cview.getTanya();
                    String datacari[][] = cmodel.searchDataPenulis(cari);
                    String Penulis = cmodel.Penulis;
                    
                    String dataMahasiswa[][] = cmodel.readDataPenulis(Penulis);
                    cview.tabel.setModel(new JTable(dataMahasiswa, cview.NKolom).getModel());
                }
                else if(cview.rPenerbit.isSelected()){
                    String cari = cview.getTanya();
                    String datacari[][] = cmodel.searchDataPenerbit(cari);
                    String Penerbit = cmodel.Penerbit;
                    
                    String dataMahasiswa[][] = cmodel.readDataPenerbit(Penerbit);
                    cview.tabel.setModel(new JTable(dataMahasiswa, cview.NKolom).getModel());
                }
                else if(cview.rLokasi.isSelected()){
                    String cari = cview.getTanya();
                    String datacari[][] = cmodel.searchDataLokasi(cari);
                    String Lokasi = cmodel.Lokasi;
                    
                    String dataMahasiswa[][] = cmodel.readDataLokasi(Lokasi);
                    cview.tabel.setModel(new JTable(dataMahasiswa, cview.NKolom).getModel());
                }
                else if(cview.rStok.isSelected()){
                    String cari = cview.getTanya();
                    String datacari[][] = cmodel.searchDataStok(cari);
                    String Stok = cmodel.Stok;
                    
                    String dataMahasiswa[][] = cmodel.readDataStok(Stok);
                    cview.tabel.setModel(new JTable(dataMahasiswa, cview.NKolom).getModel());
                }
            }
        });
        
        cview.bTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cview.setVisible(false);
                new Cari_MVC();
            }
        });
        
        cview.bKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cview.setVisible(false);
                new Home_MVC();
            }
        });
    }
}
