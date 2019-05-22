/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.value.projects.dominio;

/**
 *
 * @author 153264
 */
public class Produto {
    public String Nome;
    public String Imagem;

    public Produto(String Nome, String Imagem) {
        this.Nome = Nome;
        this.Imagem = Imagem;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getImagem() {
        return Imagem;
    }

    public void setImagem(String Imagem) {
        this.Imagem = Imagem;
    }
    
    
}
