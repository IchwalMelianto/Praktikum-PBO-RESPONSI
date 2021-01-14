/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cari;

import Home.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Ichwal Melianto
 */
public class Cari_Model {
    String DBurl = "jdbc:mysql://localhost/perpustakaan";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;
    
    Cari_View hview;
    String JudulBuku, GenreBuku, Penulis, Penerbit, Lokasi, Stok;
    
    public Cari_Model(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println("Koneksi gagal");
        }
    }
    
    public String[][] searchDataJudul(String ID){
        try{
            int JData = 0;
            
            String query1 = "Select COUNT(ID) as ID from data_buku WHERE JudulBuku LIKE '%"+ID+"%'"; 
            ResultSet rSet = statement.executeQuery(query1);
            
            while(rSet.next()){
                JData = rSet.getInt("ID");
                System.out.println("Jumlah data = " + JData);
            }
            
            String query2 = "Select * from data_buku WHERE JudulBuku LIKE '%"+ID+"%'"; 
            ResultSet resultSet = statement.executeQuery(query2);
            
            if(JData!=0){
                for(int i=0; resultSet.next(); i++){
                    JudulBuku = resultSet.getString("JudulBuku"); 
                    GenreBuku = resultSet.getString("GenreBuku");
                    Penulis = resultSet.getString("Penulis");
                    Penerbit = resultSet.getString("Penerbit");
                    Lokasi = resultSet.getString("Lokasi");
                    Stok = resultSet.getString("Stok");
                }
            }
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
        return null;
    }
    
    public String[][] searchDataGenre(String ID){
        try{
            int JData = 0;
            
            String query1 = "Select COUNT(ID) as ID from data_buku WHERE GenreBuku LIKE '%"+ID+"%'"; 
            ResultSet rSet = statement.executeQuery(query1);
            
            while(rSet.next()){
                JData = rSet.getInt("ID");
                System.out.println("Jumlah data = " + JData);
            }
            
            String query2 = "Select * from data_buku WHERE GenreBuku LIKE '%"+ID+"%'"; 
            ResultSet resultSet = statement.executeQuery(query2);
            
            if(JData!=0){
                for(int i=0; resultSet.next(); i++){
                    JudulBuku = resultSet.getString("JudulBuku"); 
                    GenreBuku = resultSet.getString("GenreBuku");
                    Penulis = resultSet.getString("Penulis");
                    Penerbit = resultSet.getString("Penerbit");
                    Lokasi = resultSet.getString("Lokasi");
                    Stok = resultSet.getString("Stok");
                }
            }
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
        return null;
    }
    
    public String[][] searchDataPenulis(String ID){
        try{
            int JData = 0;
            
            String query1 = "Select COUNT(ID) as ID from data_buku WHERE Penulis LIKE '%"+ID+"%'"; 
            ResultSet rSet = statement.executeQuery(query1);
            
            while(rSet.next()){
                JData = rSet.getInt("ID");
                System.out.println("Jumlah data = " + JData);
            }
            
            String query2 = "Select * from data_buku WHERE Penulis LIKE '%"+ID+"%'"; 
            ResultSet resultSet = statement.executeQuery(query2);
            
            if(JData!=0){
                for(int i=0; resultSet.next(); i++){
                    JudulBuku = resultSet.getString("JudulBuku"); 
                    GenreBuku = resultSet.getString("GenreBuku");
                    Penulis = resultSet.getString("Penulis");
                    Penerbit = resultSet.getString("Penerbit");
                    Lokasi = resultSet.getString("Lokasi");
                    Stok = resultSet.getString("Stok");
                }
            }
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
        return null;
    }
    
    public String[][] searchDataPenerbit(String ID){
        try{
            int JData = 0;
            
            String query1 = "Select COUNT(ID) as ID from data_buku WHERE Penerbit LIKE '%"+ID+"%'"; 
            ResultSet rSet = statement.executeQuery(query1);
            
            while(rSet.next()){
                JData = rSet.getInt("ID");
                System.out.println("Jumlah data = " + JData);
            }
            
            String query2 = "Select * from data_buku WHERE Penerbit LIKE '%"+ID+"%'"; 
            ResultSet resultSet = statement.executeQuery(query2);
            
            if(JData!=0){
                for(int i=0; resultSet.next(); i++){
                    JudulBuku = resultSet.getString("JudulBuku"); 
                    GenreBuku = resultSet.getString("GenreBuku");
                    Penulis = resultSet.getString("Penulis");
                    Penerbit = resultSet.getString("Penerbit");
                    Lokasi = resultSet.getString("Lokasi");
                    Stok = resultSet.getString("Stok");
                }
            }
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
        return null;
    }
    
    public String[][] searchDataLokasi(String ID){
        try{
            int JData = 0;
            
            String query1 = "Select COUNT(ID) as ID from data_buku WHERE Lokasi LIKE '%"+ID+"%'"; 
            ResultSet rSet = statement.executeQuery(query1);
            
            while(rSet.next()){
                JData = rSet.getInt("ID");
                System.out.println("Jumlah data = " + JData);
            }
            
            String query2 = "Select * from data_buku WHERE Lokasi LIKE '%"+ID+"%'"; 
            ResultSet resultSet = statement.executeQuery(query2);
            
            if(JData!=0){
                for(int i=0; resultSet.next(); i++){
                    JudulBuku = resultSet.getString("JudulBuku"); 
                    GenreBuku = resultSet.getString("GenreBuku");
                    Penulis = resultSet.getString("Penulis");
                    Penerbit = resultSet.getString("Penerbit");
                    Lokasi = resultSet.getString("Lokasi");
                    Stok = resultSet.getString("Stok");
                }
            }
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
        return null;
    }
    
    public String[][] searchDataStok(String ID){
        try{
            int JData = 0;
            
            String query1 = "Select COUNT(ID) as ID from data_buku WHERE Stok LIKE '%"+ID+"%'"; 
            ResultSet rSet = statement.executeQuery(query1);
            
            while(rSet.next()){
                JData = rSet.getInt("ID");
                System.out.println("Jumlah data = " + JData);
            }
            
            String query2 = "Select * from data_buku WHERE Stok LIKE '%"+ID+"%'"; 
            ResultSet resultSet = statement.executeQuery(query2);
            
            if(JData!=0){
                for(int i=0; resultSet.next(); i++){
                    JudulBuku = resultSet.getString("JudulBuku"); 
                    GenreBuku = resultSet.getString("GenreBuku");
                    Penulis = resultSet.getString("Penulis");
                    Penerbit = resultSet.getString("Penerbit");
                    Lokasi = resultSet.getString("Lokasi");
                    Stok = resultSet.getString("Stok");
                }
            }
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
        return null;
    }
    
    public String[][] readData(){
        try{
            int JData = 0;
            
            String data[][] = new String[getBanyakData()][7];
            
            String query = "Select * from data_buku"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[JData][0] = resultSet.getString("ID");
                data[JData][1] = resultSet.getString("JudulBuku");     
                data[JData][2] = resultSet.getString("GenreBuku");
                data[JData][3] = resultSet.getString("Penulis");
                data[JData][4] = resultSet.getString("Penerbit");
                data[JData][5] = resultSet.getString("Lokasi");
                data[JData][6] = resultSet.getString("Stok");
                JData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public String[][] readDataJudul(String ID){
        try{
            int JData = 0;
            
            String data[][] = new String[getBanyakData()][7];
            
            String query = "Select * from data_buku WHERE JudulBuku='"+ID+"'"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[JData][0] = resultSet.getString("ID");
                data[JData][1] = resultSet.getString("JudulBuku");     
                data[JData][2] = resultSet.getString("GenreBuku");
                data[JData][3] = resultSet.getString("Penulis");
                data[JData][4] = resultSet.getString("Penerbit");
                data[JData][5] = resultSet.getString("Lokasi");
                data[JData][6] = resultSet.getString("Stok");
                JData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public String[][] readDataGenre(String ID){
        try{
            int JData = 0;
            
            String data[][] = new String[getBanyakData()][7];
            
            String query = "Select * from data_buku WHERE GenreBuku='"+ID+"'"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[JData][0] = resultSet.getString("ID");
                data[JData][1] = resultSet.getString("JudulBuku");     
                data[JData][2] = resultSet.getString("GenreBuku");
                data[JData][3] = resultSet.getString("Penulis");
                data[JData][4] = resultSet.getString("Penerbit");
                data[JData][5] = resultSet.getString("Lokasi");
                data[JData][6] = resultSet.getString("Stok");
                JData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public String[][] readDataPenulis(String ID){
        try{
            int JData = 0;
            
            String data[][] = new String[getBanyakData()][7];
            
            String query = "Select * from data_buku WHERE Penulis='"+ID+"'"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[JData][0] = resultSet.getString("ID");
                data[JData][1] = resultSet.getString("JudulBuku");     
                data[JData][2] = resultSet.getString("GenreBuku");
                data[JData][3] = resultSet.getString("Penulis");
                data[JData][4] = resultSet.getString("Penerbit");
                data[JData][5] = resultSet.getString("Lokasi");
                data[JData][6] = resultSet.getString("Stok");
                JData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public String[][] readDataPenerbit(String ID){
        try{
            int JData = 0;
            
            String data[][] = new String[getBanyakData()][7];
            
            String query = "Select * from data_buku WHERE Penerbit='"+ID+"'"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[JData][0] = resultSet.getString("ID");
                data[JData][1] = resultSet.getString("JudulBuku");     
                data[JData][2] = resultSet.getString("GenreBuku");
                data[JData][3] = resultSet.getString("Penulis");
                data[JData][4] = resultSet.getString("Penerbit");
                data[JData][5] = resultSet.getString("Lokasi");
                data[JData][6] = resultSet.getString("Stok");
                JData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public String[][] readDataLokasi(String ID){
        try{
            int JData = 0;
            
            String data[][] = new String[getBanyakData()][7];
            
            String query = "Select * from data_buku WHERE Lokasi='"+ID+"'";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[JData][0] = resultSet.getString("ID");
                data[JData][1] = resultSet.getString("JudulBuku");     
                data[JData][2] = resultSet.getString("GenreBuku");
                data[JData][3] = resultSet.getString("Penulis");
                data[JData][4] = resultSet.getString("Penerbit");
                data[JData][5] = resultSet.getString("Lokasi");
                data[JData][6] = resultSet.getString("Stok");
                JData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public String[][] readDataStok(String ID){
        try{
            int JData = 0;
            
            String data[][] = new String[getBanyakData()][7];
            
            String query = "Select * from data_buku WHERE Stok='"+ID+"'"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[JData][0] = resultSet.getString("ID");
                data[JData][1] = resultSet.getString("JudulBuku");     
                data[JData][2] = resultSet.getString("GenreBuku");
                data[JData][3] = resultSet.getString("Penulis");
                data[JData][4] = resultSet.getString("Penerbit");
                data[JData][5] = resultSet.getString("Lokasi");
                data[JData][6] = resultSet.getString("Stok");
                JData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public int getBanyakData(){
        int JData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from data_buku";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                JData++;
            }
            return JData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
}
