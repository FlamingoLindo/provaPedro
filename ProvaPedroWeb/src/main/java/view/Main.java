/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.MetodosDAO;
import java.sql.SQLException;
import model.Automoveis;
import model.Cliente;
import model.Funcionario;

/**
 *
 * @author flamingo_lindo
 */
public class Main {
    public static void main(String[] args) {
        MetodosDAO mdao = new MetodosDAO();
        Automoveis auto = new Automoveis();
        Funcionario fun = new Funcionario();
        Cliente cli = new Cliente();
        
        //ADICIONA UM NOVO CARRO
        /*auto.setMarca("Citroen");
        auto.setModelo("SUV");
        auto.setCor("Vermelho");
        auto.setImportado(true);
        auto.setNumeroRodas(4);
        auto.setPreco(123);
        try{
            mdao.cadastrarCarro(auto);
            System.out.println("CARRO CADASTRADO COM SUCESSO!");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("ERRO: " + ex);
        }*/
        
        //REMOVE UM CARRO
        /*auto.setIdAuto(1);
        try{
            mdao.deletarCarro(auto);
            System.out.println("CARRO DELETADO COM SUCESSO!");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("ERRO: " + ex);
        }*/
        
        //ADICIONA UM FUNCIONARIO
        /*fun.setNomeFun("Funcionario123");
        fun.setSobrenomeFun("321Oiranoicnuf");
        fun.setSenhaFun("senha");
        fun.setDataNascimentoFun("1999/02/12");
        fun.setRgFun("3123131231");
        fun.setCpfFun("3515151251");
        try{
            mdao.cadastroFuncionario(fun);
            System.out.println("FUNCIONARIO CADASTRADO COM SUCESSO!");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("ERRO: " + ex);
        }*/
        
        //REMOVE UM FUNCIONARIO
        /*fun.setIdFun(2);
        try{
            mdao.deletarFuncionario(fun);
            System.out.println("FUNCIONARIO DELETADO COM SUCESSO!");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("ERRO: " + ex);
        }*/
        
        //ADICIONA UM CLIENTE
        /*cli.setNomeCli("Cliente");
        cli.setSobrenomeCli("Clientela");
        cli.setSenhaCli("senhcliente");
        cli.setDataNascimentoCli("2032/02/12");
        cli.setRgCli("975643");
        cli.setCpfCli("1515");
        cli.setGasto(1214134124);
        try{
            mdao.cadastrarCliente(cli);
            System.out.println("CLIENTE CADASTRADO COM SUCESSO!");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("ERRO: " + ex);
        }*/
        
        //REMOVE UM CLIENTE
        /*cli.setIdCli(3);
        try{
            mdao.deletarCliente(cli);
            System.out.println("CLIENTE DELETADO COM SUCESSO!");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("ERRO: " + ex);
        }*/
        
        //ALTERA DADOS NA TABELA AUTOMOVEIS
        /*auto.setIdAuto(2);
        auto.setMarca("Citroen");
        auto.setModelo("SUV");
        auto.setCor("Azul");
        auto.setImportado(true);
        auto.setNumeroRodas(4);
        auto.setPreco(123);
        try{
            mdao.alterarCarro(auto);
            System.out.println("CADASTRO DE CARRO ALTERADO COM SUCESSO!");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("ERRO: " + ex);
        }*/
        
        //ALTERA DADOS NA TABELA FUNCIONARIO
        /*fun.setIdFun(3);
        fun.setNomeFun("Jonathan");
        fun.setSobrenomeFun("321Oiranoicnuf");
        fun.setSenhaFun("senha2fun");
        fun.setDataNascimentoFun("1999/02/12");
        fun.setRgFun("3123131231");
        fun.setCpfFun("3515151251");
        try{
            mdao.alterarFuncionario(fun);
            System.out.println("CADASTRO DO FUNCIONARIO: " + fun.getNomeFun() + " ALTERADO COM SUCESSO!");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("ERRO: " + ex);          
        }*/
        
        //ALTERA DADOS NA TABELA CLIENTE
        cli.setIdCli(4);
        cli.setNomeCli("Junin");
        cli.setSobrenomeCli("Cosa");
        cli.setSenhaCli("senha2Cliente");
        cli.setDataNascimentoCli("2032/02/12");
        cli.setRgCli("975643");
        cli.setCpfCli("1515");
        cli.setGasto(1214134124);
        try{
            mdao.alterarCliente(cli);
            System.out.println("CADASTRO DO CLIENTE: " + cli.getNomeCli() + " ALTERADO COM SUCESSO!");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("ERRO: " + ex);
        }
    }
}
