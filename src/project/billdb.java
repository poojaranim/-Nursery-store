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
public class billdb {
    public static ArrayList<bill> billling(){
        ArrayList<bill> customer = new ArrayList<>();
      
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/deliverydb.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT invoiceno, username, mobileno, address,pincode FROM delivery");
            
            bill pl;
            
            while(rs.next()){
                pl = new bill(rs.getInt("invoiceno"),rs.getString("username"),
                        rs.getString("mobileno"),rs.getString("address"),rs.getInt("pincode"));
                customer.add(pl);

            }
        } catch (SQLException ex) {
            Logger.getLogger(AccessoriesDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customer;
    }
}
