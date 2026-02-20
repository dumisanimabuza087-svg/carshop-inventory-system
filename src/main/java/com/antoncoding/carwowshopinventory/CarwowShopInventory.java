/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/*
* @Imports
*/
package com.antoncoding.carwowshopinventory;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Dumisani Joseph Mabuza
 */
public class CarwowShopInventory extends JFrame{
  

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Carwow Shop Inventory System");
            frame.setSize(891,423);
            
            //Making the frame move to the center
            frame.setLocationRelativeTo(null);
            //Making the frame resizazble to full screen
     
             // Add JPanel to Frame
            frame.setContentPane(new CarwowFrame());
  
            frame.setVisible(true);

        });

    }
}
