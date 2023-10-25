 package koneksiDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author fatiq
 */
public class coba {
    static final String url = "jdbc:postgresql://localhost:5432/PBO";
    static final String user = "postgres";
    static final String pass = "5127";
    static final String query = "select * from mahasiswa";
    
    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                System.out.println("nim\t:"+" "+String.valueOf(rs.getObject("nim")));
                System.out.println("nama\t:"+" "+String.valueOf(rs.getObject("nama")));
                System.out.println("alamat\t:"+" "+String.valueOf(rs.getObject("alamat")));
                
                System.out.println();
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
            
}
