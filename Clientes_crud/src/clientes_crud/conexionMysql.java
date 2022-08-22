/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientes_crud;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author educu
 */
public class conexionMysql {

    Connection cn;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/crudclientes", "root","");
    System.out.println("CONECTADO");
        } catch (Exception e) {
            System.out.println("ERROR" + e);
        }
        return cn;
    }
}
