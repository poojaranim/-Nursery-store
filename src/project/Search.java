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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Void
 */
public class Search {
    static int plants = 0;
    static int accessories = 0;
    static int essentials = 0;
    public static ArrayList<ProductList> accessoriesSearch(String name){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/plantsDB.db");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM plants WHERE mid=? COLLATE NOCASE OR mname=? COLLATE NOCASE");
            ps.setString(1, name);
            ps.setString(2, name);
            ResultSet rs = ps.executeQuery();
            
            ProductList pl, gl, kl=null;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("mid"),rs.getString("mname"),
                        rs.getInt("mprice"),rs.getInt("mquantity"),rs.getString("mdescription"),
                        rs.getString("mphoto"));
                plants++;
                
                list.add(pl);

            }
            con.close();
            
            con = DriverManager.getConnection("jdbc:sqlite:DBs/accessoriesDB.db");
            ps = con.prepareStatement("SELECT * FROM accessories WHERE mid=? COLLATE NOCASE OR mname=? COLLATE NOCASE");
            ps.setString(1, name);
            ps.setString(2, name);
            rs = ps.executeQuery();

            
            while(rs.next()){
                gl = new ProductList(rs.getString("mid"),rs.getString("mname"),
                        rs.getInt("mprice"),rs.getInt("mquantity"),rs.getString("mdescription"),
                        rs.getString("mphoto"));
                accessories++;
                list.add(gl);

            }
            con.close();
            
            con = DriverManager.getConnection("jdbc:sqlite:DBs/essentialsDB.db");
            ps = con.prepareStatement("SELECT * FROM essentials WHERE mid=? COLLATE NOCASE OR mname=? COLLATE NOCASE");
            ps.setString(1, name);
            ps.setString(2, name);
            rs = ps.executeQuery();

            
            while(rs.next()){
                kl = new ProductList(rs.getString("mid"),rs.getString("mname"),
                        rs.getInt("mprice"),rs.getInt("mquantity"),rs.getString("mdescription"),
                        rs.getString("mphoto"));
                essentials++;
                list.add(kl);

            }
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(AccessoriesDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
    
}
