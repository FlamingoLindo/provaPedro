/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.MetodosDAO;
import java.sql.SQLException;
import model.Automoveis;

/**
 *
 * @author flamingo_lindo
 */
public class Main {
    public static void main(String[] args) {
        MetodosDAO mdao = new MetodosDAO();
        Automoveis auto = new Automoveis();
        
        auto.setMarca("Citroen");
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
        }
        
    }
}
