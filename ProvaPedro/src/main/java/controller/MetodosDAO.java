/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Automoveis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author flamingo_lindo
 */
public class MetodosDAO {
    public void cadastrarCarro(Automoveis auto) throws ClassNotFoundException, SQLException{
        Connection con = Conexao.getConexao();
        PreparedStatement comando = con.prepareStatement("insert into automoveis(marca,modelo,cor,importado,numeroRodas,preco) values (?,?,?,?,?,?)");
        comando.setString(1, auto.getMarca());
        comando.setString(2, auto.getModelo());
        comando.setString(3, auto.getCor());
        comando.setBoolean(4, auto.isImportado());
        comando.setInt(5, auto.getNumeroRodas());
        comando.setFloat(6, auto.getPreco());
    }
}
