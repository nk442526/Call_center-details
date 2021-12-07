/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calldata;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Neha
 */
public class NewClass {
    
    public static void main(String[] args){
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/call_details","root","");


        JOptionPane.showMessageDialog(null,"connected with "+con.toString());


    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"not connect to server and message is"+e.getMessage());
    }
    }
}
