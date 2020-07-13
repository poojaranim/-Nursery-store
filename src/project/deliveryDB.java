/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author CPM
 */
public class deliveryDB {
   
    public static boolean flag = false;
    public static void insertIntodeliveryDB(String username,String mobileno,String address,String pincode){
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/deliverydb.db");
         
            PreparedStatement ps = con.prepareStatement("INSERT INTO delivery(username,mobileno,"
                    + "address,pincode) VALUES(?,?,?,?)");
            
           
      
            ps.setString(1, username);
            ps.setString(2, mobileno);
            ps.setString(3, address);
            ps.setString(4, pincode);
            if(ps.executeUpdate()==1)
                JOptionPane.showMessageDialog(null, "Entry successful!");
            
        } catch (SQLException ex) {
            Logger.getLogger(deliveryDB.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    public static void deletebilling(){
          
           try{
               Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/deliverydb.db");
                 PreparedStatement ps = con.prepareStatement("DELETE FROM delivery");
                    ps.executeUpdate();
                     JOptionPane.showMessageDialog(null, "All Entries has been deleted!");
            
        } catch (SQLException ex) {
            Logger.getLogger(deliveryDB.class.getName()).log(Level.SEVERE, null, ex);
    }
            
           }
           
           } 
            
    

