 
package dao;

import beans.Admin;
import beans.News;
import pool.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

 
public class AdminDao {
     public Admin getByLoginDetail(String userid, String password) {
        Admin admin = null;
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from admin where userid=? and password = ?";
                PreparedStatement smt = con.prepareStatement(sql);
               smt.setString(1, userid);
               smt.setString(2,password);
                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                    System.out.println("ok..");
                    admin = new Admin();
                    admin.setImage(rs.getString("image"));
                    admin.setName(rs.getString("name"));
//                  //  admin.setUserid(rs.getString("userid"));
                //   admin.setPassword(rs.getString("password"));
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        return admin;
    }
     public Admin getById( String userid){
         Admin admin=null;
           try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
             if(con!=null){
                 
                 String sql="select *from admin where userid=?";
                 PreparedStatement smt=con.prepareStatement(sql);
                 smt.setString(1, userid);
                 ResultSet rs=smt.executeQuery();
                  while(rs.next()){
                      admin.setImage(rs.getString("image"));
                       admin.setUserid(rs.getString("userid"));
                  }
       
                    cp.putConnection(con);
                smt.close();
                 
                 
                 
                 
             }
         
           }catch(Exception e){
               System.out.println("Error"+e.getMessage());
           }
         
          return admin;
          
         
     }
         public boolean isUserIdExist(String userid) {
        boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "select * from Admin where userid=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, userid);
                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                    status = true;
                }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println("Error :" + e.getMessage());
            }
        }

        return status;
    }
   
     
}
