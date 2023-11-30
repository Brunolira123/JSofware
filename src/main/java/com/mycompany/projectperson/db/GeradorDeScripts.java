/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectperson.db;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Bruno
 */
public class GeradorDeScripts {
    
    Connection conn = null;
    
    public GeradorDeScripts(Connection connection){
        this.conn = connection;
    }
    
    public void criarTabelaProduct()throws Exception{
        try(Statement stm = conn.createStatement()){
            stm.execute(
            """
            CREATE TABLE IF NOT EXISTS 
            product  
            (id serial not null primary key, 
            descricao varchar (100), 
            estoque float,
            custo float,
            preco float,
            dataCadastro date,
            ativo boolean) ;
            """
            );
        }
    }
    public void criarTabelaUser()throws Exception{
        try(Statement stm = conn.createStatement()){
            stm.execute(
            """
            CREATE TABLE IF NOT EXISTS 
            users
            (id serial not null primary key, 
            login varchar (100), 
            senha varchar(10)) ;
            """
            );
        }
    }
}
