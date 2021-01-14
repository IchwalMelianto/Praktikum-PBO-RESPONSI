/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hapus;

/**
 *
 * @author Ichwal Melianto
 */
public class Hapus_MVC {
    Hapus_View ev = new Hapus_View();
    Hapus_Model em = new Hapus_Model();
    Hapus_Controller ec = new Hapus_Controller(ev,em);
}
