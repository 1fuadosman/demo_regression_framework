package com.demo.framework.utilities;

import com.demo.framework.config.Settings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseUtil {

    public static Connection open(String connectionString,String userName, String password) throws Exception {
            Class.forName(Settings.dbDriverType);
            return DriverManager.getConnection(connectionString, userName, password);
    }

    public static void executeQuery(String query, Connection connection)
    {
        Statement statement=null;
        ResultSet resultSet=null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            while(resultSet.next())
            {
                //remove the println as its there to verify data is returned
                System.out.println(resultSet.getInt(2));
            }


        } catch(Exception e) {

        } //close connection
        finally { try { resultSet.close(); } catch (Exception e) { /* ignored */ }
            try { statement.close(); } catch (Exception e) { /* ignored */ }
            try { connection.close(); } catch (Exception e) { /* ignored */ }

        }

    }

}
