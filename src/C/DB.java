/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Kasun Kalhara
 */
public class DB {

    public static Connection c;

    public static Connection con() throws Exception {

        if (c == null) {
            Class.forName("com.mysql.jdbc.Driver");
            c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics_items", "root", "87654321");
            System.out.println("ok");
        }
        return c;
    }


}
