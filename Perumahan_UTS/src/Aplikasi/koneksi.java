package Aplikasi;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;

/**
 *
 * @author rifki
 */
public class koneksi {
   public static Connection sambungDB(){
        try {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUser("root");
            dataSource.setPassword("");
            dataSource.setServerName("localhost");
            dataSource.setDatabaseName("perumahan-uts");
            dataSource.setPortNumber(3306);
            dataSource.setAllowMultiQueries(true); 
            dataSource.setServerTimezone("Asia/Jakarta");
            Connection c = dataSource.getConnection();
            return c;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
