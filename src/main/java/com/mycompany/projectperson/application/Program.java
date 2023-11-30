/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectperson.application;

import com.mycompany.projectperson.db.DB;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Bruno
 */
public class Program {
    

    public void conectar() throws IOException, SQLException{
        Connection conn = DB.getConnection();
        DB.closeConnection();
    } 
}
