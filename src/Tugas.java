import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/**
 *
 * @author fatiq
 */
public class Tugas {
    static final String url = "jdbc:postgresql://localhost:5432/PBO";
    static final String user = "postgres";
    static final String pass = "5127";
    static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean berhenti = true;
        do{
            Scanner sci = new Scanner(System.in);
            System.out.println("--|Menu Utama|--");
            System.out.println("1. Select");
            System.out.println("2. Insert");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("----------------");
            System.out.print("Pilih : ");
            int pilih = sci.nextInt();
            System.out.println();
            
            switch (pilih){
                case 1 :
                    ambilData();
                    break;
                case 2 :
                    tambahData();
                    break;
                case 3 :
                    perbaruiData();
                    break;
                case 4 : 
                    hapusData();
                    break;
                default :
                    System.out.println("Tidak ditemukan");
            }
            
            System.out.println("Lanjut [y/t]");
            String lanjut = sc.nextLine();
            
            if(lanjut.equalsIgnoreCase("y"))
                berhenti = true;
            else
                berhenti = false;
            
        } while (berhenti);
        
    }
    
    static void ambilData(){
        String query = "select * from mahasiswa";
        try{
            Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                System.out.println("nim\t:"+" "
                        +String.valueOf(rs.getObject("nim")));
                System.out.println("nama\t:"+" "
                        +String.valueOf(rs.getObject("nama")));
                System.out.println("alamat\t:"+" "
                        +String.valueOf(rs.getObject("alamat")));
                System.out.println("No. TLP\t:"+" "
                        +String.valueOf(rs.getObject("tlp")));
                
                System.out.println();
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    static void tambahData(){
        System.out.println("INSERT");
        System.out.print("NIM\t: ");
        String nim = sc.nextLine();
        System.out.print("NAMA\t: ");
        String nama = sc.nextLine();
        System.out.print("ALAMAT\t: ");
        String alamat = sc.nextLine();
        System.out.print("TLP\t: ");
        String tlp = sc.nextLine();
        
        String query = "insert into mahasiswa values ('" 
                + nim + "','" + nama + "','" + alamat + "','" + tlp +"')";
        
        try{
            Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
            stmt.execute(query);
            System.out.println();
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println();
        }
    }
    
    static void perbaruiData(){
        System.out.println("Update");
        System.out.print("NIM\t: ");
        String nim = sc.nextLine();
        System.out.print("NAMA\t: ");
        String nama = sc.nextLine();
        System.out.print("ALAMAT\t: ");
        String alamat = sc.nextLine();
        System.out.print("TLP\t: ");
        String tlp = sc.nextLine();
        
        String query = "update mahasiswa set nama = '" + nama + "', alamat = '" 
                + alamat + "', tlp = '" + tlp +"' where nim = '" + nim +"'";
        
        try{
            Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
            stmt.execute(query);
            System.out.println();
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println();
        }
    }
    
    static void hapusData(){
        System.out.println("Delete");
        System.out.print("NIM\t: ");
        String nim = sc.nextLine();
        
        String query = "delete from mahasiswa where nim = '" + nim + "'";
        
        try{
            Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
            stmt.execute(query);
            System.out.println();
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println();
        }
    }
    
}
