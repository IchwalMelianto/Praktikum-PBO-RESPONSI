/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cari;


/**
 *
 * @author Ichwal Melianto
 */
public class Cari_MVC {
    Cari_View hv = new Cari_View();
    Cari_Model hm = new Cari_Model();
    Cari_Controller hc = new Cari_Controller(hv, hm);
}
