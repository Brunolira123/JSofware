package com.mycompany.projectperson.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    private static Connection conn = null;

    public static Connection getConnection() throws IOException, SQLException {
        if (conn == null) {
            Properties props = loadProperties();
            String url = props.getProperty("dburl");
            conn = DriverManager.getConnection(url, props);
        }
        return conn;
    }

    private static Properties loadProperties() throws FileNotFoundException, IOException {
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        }

    }
    
    public static void closeConnection(){
        if(conn == null){
            try{
                conn.close();
            }
            catch(SQLException e){
                throw  new RuntimeException(e.getMessage());
            }
                    
        }
    }
}
