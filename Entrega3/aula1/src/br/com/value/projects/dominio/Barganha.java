/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.value.projects.dominio;

import java.util.ArrayList;

/**
 *
 * @author 153264
 */
public class Barganha {
    public Produto entrada;
    public String Nome;
    public ArrayList<Produto> saida;
    public Integer Dias;
    public String UsuarioInteressado;

    public Barganha(Produto entrada, String Nome, ArrayList<Produto> saida, Integer Dias) {
        this.entrada = entrada;
        this.Nome = Nome;
        this.saida = saida;
        this.Dias = Dias;
    }

    public Produto getEntrada() {
        return entrada;
    }

    public void setEntrada(Produto entrada) {
        this.entrada = entrada;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public ArrayList<Produto> getSaida() {
        return saida;
    }

    public void setSaida(ArrayList<Produto> saida) {
        this.saida = saida;
    }

    public Integer getDias() {
        return Dias;
    }

    public void setDias(Integer Dias) {
        this.Dias = Dias;
    }

    public String getUsuarioInteressado() {
        return UsuarioInteressado;
    }

    public void setUsuarioInteressado(String UsuarioInteressado) {
        this.UsuarioInteressado = UsuarioInteressado;
    }
    
    
}
