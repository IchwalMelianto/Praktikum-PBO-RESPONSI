/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tambah;

/**
 *
 * @author Ichwal Melianto
 */
public class Tambah_MVC {
    Tambah_View tv = new Tambah_View();
    Tambah_Model tm = new Tambah_Model();
    Tambah_Controller tc = new Tambah_Controller(tv,tm);
}
