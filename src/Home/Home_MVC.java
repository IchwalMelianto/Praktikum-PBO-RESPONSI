/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

/**
 *
 * @author Ichwal Melianto
 */
public class Home_MVC {
    Home_View hv = new Home_View();
    Home_Model hm = new Home_Model();
    Home_Controller hc = new Home_Controller(hv, hm);
}
