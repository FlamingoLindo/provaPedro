/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author flamingo_lindo
 */
public class Cliente {
    private int idCli;
    private String nomeCli,sobrenomeCli,rgCli,cpfCli,dataNascimentoCli;
    private float gasto;

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public String getSobrenomeCli() {
        return sobrenomeCli;
    }

    public void setSobrenomeCli(String sobrenomeCli) {
        this.sobrenomeCli = sobrenomeCli;
    }

    public String getRgCli() {
        return rgCli;
    }

    public void setRgCli(String rgCli) {
        this.rgCli = rgCli;
    }

    public String getCpfCli() {
        return cpfCli;
    }

    public void setCpfCli(String cpfCli) {
        this.cpfCli = cpfCli;
    }

    public String getDataNascimentoCli() {
        return dataNascimentoCli;
    }

    public void setDataNascimentoCli(String dataNascimentoCli) {
        this.dataNascimentoCli = dataNascimentoCli;
    }

    public float getGasto() {
        return gasto;
    }

    public void setGasto(float gasto) {
        this.gasto = gasto;
    }

    
    
    
}
