/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Automoveis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Cliente;
import model.Funcionario;


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
        comando.execute();
        con.close();
    }
    
    public void deletarCarro(Automoveis auto) throws ClassNotFoundException, SQLException{
        Connection con = Conexao.getConexao();
        PreparedStatement comando = con.prepareStatement("delete from automoveis where idAuto = ? "); 
        comando.setInt(1, auto.getIdAuto());
        comando.execute();
        con.close();
    }
    
    public void cadastroFuncionario(Funcionario fun)throws ClassNotFoundException, SQLException{
        Connection con = Conexao.getConexao();
        PreparedStatement comando = con.prepareStatement("insert into funcionario(nomeFun,sobrenomeFun,senhaFun,dataNascimentoFun,rgFun,cpfFun) values (?,?,?,?,?,?)");
        comando.setString(1, fun.getNomeFun());
        comando.setString(2, fun.getSobrenomeFun());
        comando.setString(3, fun.getSenhaFun());
        comando.setString(4, fun.getDataNascimentoFun());
        comando.setString(5, fun.getRgFun());
        comando.setString(6, fun.getCpfFun());
        comando.execute();
        con.close();
    }
    
    public void deletarFuncionario(Funcionario fun)throws ClassNotFoundException, SQLException{
       Connection con = Conexao.getConexao();
       PreparedStatement comando = con.prepareStatement("delete from funcionario where idFun = ?");
       comando.setInt(1, fun.getIdFun());
       comando.execute();
       con.close();
    }
    
    public void cadastrarCliente(Cliente cli)throws ClassNotFoundException, SQLException{
        Connection con = Conexao.getConexao();
        PreparedStatement comando = con.prepareStatement("insert into cliente (nomeCli,sobrenomeCli,senhaCli,dataNascimentoCli,rgCli,cpfCli,gasto) values (?,?,?,?,?,?)");
        comando.setString(1, cli.getNomeCli());
        comando.setString(2, cli.getSobrenomeCli());
        comando.setString(3, cli.getSenhaCli());
        comando.setString(4,cli.getDataNascimentoCli());
        comando.setString(5, cli.getRgCli());
        comando.setString(6,cli.getCpfCli());
        comando.setFloat(7,cli.getGasto());
        comando.execute();
        con.close();
    }
    
    public void deletarCliente(Cliente cli)throws ClassNotFoundException, SQLException{
       Connection con = Conexao.getConexao();
       PreparedStatement comando = con.prepareStatement("delete from cliente where idCli = ?");
       comando.setInt(1,cli.getIdCli());
       comando.execute();
       con.close();
    }
    
    public void alterarCarro(Automoveis auto) throws ClassNotFoundException, SQLException{
        Connection con = Conexao.getConexao();
        PreparedStatement comando = con.prepareStatement("update automoveis set marca = ?, modelo = ?, cor = ?, importado = ?, numeroRodas = ?, preco = ? where idAuto = ?");
        comando.setString(1, auto.getMarca());
        comando.setString(2, auto.getModelo());
        comando.setString(3, auto.getCor());
        comando.setBoolean(4, auto.isImportado());
        comando.setInt(5, auto.getNumeroRodas());
        comando.setFloat(6, auto.getPreco());
        comando.setInt(7, auto.getIdAuto());
        comando.execute();
        con.close();
    }
    
    public void alterarFuncionario (Funcionario fun)throws ClassNotFoundException, SQLException{
        Connection con = Conexao.getConexao();
        PreparedStatement comando = con.prepareStatement("update funcionario set nomeFun = ?, sobrenomeFun = ?, senhaFun = ?, dataNascimentoFun = ?, rgFun = ?, cpfFun = ? where idFun = ?");
        comando.setString(1, fun.getNomeFun());
        comando.setString(2, fun.getSobrenomeFun());
        comando.setString(3,fun.getSenhaFun());
        comando.setString(4, fun.getDataNascimentoFun());
        comando.setString(5, fun.getRgFun());
        comando.setString(6, fun.getCpfFun());
        comando.setInt(7, fun.getIdFun());
        comando.execute();
        con.close();
    }
    
    public void alterarCliente (Cliente cli)throws ClassNotFoundException, SQLException{
        Connection con = Conexao.getConexao();
        PreparedStatement comando = con.prepareStatement("update cliente set nomeCli = ?, sobrenomeCli = ?, senhaCli = ?, dataNascimentoCli= ?, rgCli = ?, cpfCli = ?, gasto = ? where idCli = ?");
        comando.setString(1, cli.getNomeCli());
        comando.setString(2, cli.getSobrenomeCli());
        comando.setString(3,cli.getSenhaCli());
        comando.setString(4,cli.getDataNascimentoCli());
        comando.setString(5, cli.getRgCli());
        comando.setString(6,cli.getCpfCli());
        comando.setFloat(7,cli.getGasto());
        comando.setInt(8, cli.getIdCli());
        comando.execute();
        con.close();
    }
}
