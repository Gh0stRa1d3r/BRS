/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorproject;
import javax.swing.JFrame;
/**
 *
 * @author Bentley
 */
public class BRSFrame {
    public static void main(String[] args){
        JFrame frame = new LoginFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Bug Report System");
        frame.setVisible(true);
    }
}
