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
 * @author Void
 */
public class PlantsDB {
    public static boolean flag = false;
    public static void insertIntoPlantsDB(String id, String name, int price, int qty, String description, String imagePath){
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/plantsDB.db");
         
            PreparedStatement ps = con.prepareStatement("INSERT INTO plants(mid, mname, mprice,"
                    + "mquantity, mdescription, mphoto) VALUES(?,?,?,?,?,?)");
            
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setInt(3, price);
            ps.setInt(4, qty);
            ps.setString(5, description);
            ps.setString(6, imagePath);
            if(ps.executeUpdate()==1)
                JOptionPane.showMessageDialog(null, "Entry successful!");
            
        } catch (SQLException ex) {
            Logger.getLogger(AccessoriesDB.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    
    public static void updatePlantsDB(String name, int qty){
         try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/plantsDB.db");
            
            PreparedStatement ps = con.prepareStatement("UPDATE plants SET mquantity=? WHERE mid=?");
            
            ps.setInt(1, qty);
            ps.setString(2, name);
            if(ps.executeUpdate()==0)
                JOptionPane.showMessageDialog(null, "Entry does not exist!");
            else if(ps.executeUpdate()==1 && flag){
                JOptionPane.showMessageDialog(null, "Stock updated successfully!");
                flag = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccessoriesDB.class.getName()).log(Level.SEVERE, null, ex);

    }
    }
    
    public static ArrayList<ProductList> TableGenerator(){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/plantsDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT mid, mname, mprice,mquantity, mdescription, mphoto FROM plants");
            
            ProductList pl;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("mid"),rs.getString("mname"),
                        rs.getInt("mprice"),rs.getInt("mquantity"),rs.getString("mdescription"),
                        rs.getString("mphoto"));
                
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AccessoriesDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
}
    
   public static ArrayList<ProductList> homePageContent(){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/plantsDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT mid, mname, mprice,mquantity, mdescription, mphoto FROM plants ORDER BY sno DESC LIMIT 3");
            
            ProductList pl;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("mid"),rs.getString("mname"),
                        rs.getInt("mprice"),rs.getInt("mquantity"),rs.getString("mdescription"),
                        rs.getString("mphoto"));
                
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AccessoriesDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
   public static ArrayList<ProductList> checkStock(){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/plantsDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT mid, mname, mprice, mquantity FROM plants");
            
            ProductList pl;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("mid"),rs.getString("mname"),
                        0, rs.getInt("mquantity"),null, null);
                
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AccessoriesDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
    
   public static void delete(String name){
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/plantsDB.db");
            PreparedStatement ps = con.prepareStatement("DELETE FROM plants WHERE mid=?");
            ps.setString(1, name);
            if(ps.executeUpdate()==0)
                JOptionPane.showMessageDialog(null, "Entry does not exist!");
            else
                JOptionPane.showMessageDialog(null, "Entry deleted successfully!");
            
        } catch (SQLException ex) {
            Logger.getLogger(PlantsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
            
   }
    
}
