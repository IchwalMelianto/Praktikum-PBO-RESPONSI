/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormEdit;

import Tambah.*;

/**
 *
 * @author Ichwal Melianto
 */
public class FE_MVC {
    FE_View tv = new FE_View();
    FE_Model tm = new FE_Model();
    FE_Controller tc = new FE_Controller(tv,tm);
}
