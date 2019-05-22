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
public class Usuario {
    public String Nome;
    public ArrayList<Barganha> entrada;
    public ArrayList<Produto> interressado;
    public String Endereco;

    public Usuario(String Nome, String Endereco) {
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.entrada = new ArrayList();
        this.interressado = new ArrayList();
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public ArrayList<Barganha> getEntrada() {
        return entrada;
    }

    public void setEntrada(ArrayList<Barganha> entrada) {
        this.entrada = entrada;
    }

    public ArrayList<Produto> getInterressado() {
        return interressado;
    }

    public void setInterressado(ArrayList<Produto> interressado) {
        this.interressado = interressado;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public void CadastrarBarganha(Produto produtoTenho, ArrayList<Produto> produtos, Integer dias) {
        Barganha nova = new Barganha(produtoTenho, getNome(), produtos, dias);
        this.entrada.add(nova);
        DaoBarganha.barganhas.add(nova);
    }
    
    

    
    
    
}
