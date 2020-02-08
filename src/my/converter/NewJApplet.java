/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.converter;

import java.awt.Graphics;
import javax.swing.JApplet;
public class NewJApplet extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
   /* public void init() {
        // TODO start asynchronous download of heavy resources
        currency c=new currency();
        c.show(true);
    }*/
     public void paint(Graphics g)
    {
        g.drawString("Welcome to currency converter", 50, 50);
    }


    // TODO overwrite start(), stop() and destroy() methods
}
