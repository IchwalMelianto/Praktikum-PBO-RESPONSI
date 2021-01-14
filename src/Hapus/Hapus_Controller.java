/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hapus;

import Home.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Ichwal Melianto
 */
public class Hapus_Controller {
    Hapus_Model hpmodel;
    Hapus_View hpview;
    
    public Hapus_Controller(Hapus_View hpview, Hapus_Model hpmodel){
        this.hpview = hpview;
        this.hpmodel = hpmodel;
        
        if (hpmodel.getBanyakData()!= 0){
            String dataMahasiswa[][] = hpmodel.readData();
            //hpview.tabel.setModel((new JTable(dataMahasiswa, hpview.NKolom)).getModel());
        }

        hpview.bOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               String cari = hpview.getTanya();
               int input = JOptionPane.showConfirmDialog(null,"Menghapus Buku dengan ID " + cari + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

               if (input == 0) {
                   String data [][] = hpmodel.searchData(cari);
                   hpmodel.deleteData(cari);
                   String dataMahasiswa[][] = hpmodel.readData();
               }else{
               JOptionPane.showMessageDialog(null, "Hapus Gagal!");
               }
               hpview.setVisible(false);
               new Home_MVC();
            }
        });
        
        hpview.bBatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               hpview.setVisible(false);
               new Home_MVC();
            }
        });
    }
}
