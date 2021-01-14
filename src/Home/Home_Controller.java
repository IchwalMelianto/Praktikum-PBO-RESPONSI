/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import Cari.Cari_MVC;
import FormEdit.FE_MVC;
import Hapus.Hapus_MVC;
import Home.*;
import Tambah.Tambah_MVC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.*;
/**
 *
 * @author Ichwal Melianto
 */
public class Home_Controller {
    
    Home_View hview;
    Home_Model hmodel;
    
    public Home_Controller(Home_View hview, Home_Model hmodel){
        this.hview = hview;
        this.hmodel = hmodel;
        
        if (hmodel.getBanyakData()!= 0) {
            String dataMahasiswa[][] = hmodel.readData();
            hview.tabel.setModel((new JTable(dataMahasiswa, hview.NKolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }

        hview.bTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hview.setVisible(false);
                new Tambah_MVC();
            }
        });
        
        hview.bCari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                hview.setVisible(false);
                new Cari_MVC();
                
            }
        });
        hview.bEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                hview.setVisible(false);
                new FE_MVC();
            }
        });
        
        hview.bHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                hview.setVisible(false);
                new Hapus_MVC();
            }
        });
        
        hview.bTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hview.setVisible(false);
                new Home_MVC();
            }
        });
        
        hview.bKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 int input = JOptionPane.showConfirmDialog(null,"Apa anda ingin Keluar?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    hview.setVisible(false);
                    System.exit(0);
                }
                else{
                JOptionPane.showMessageDialog(null, "Tidak Keluar");
                }
            }
        });
    }
}
