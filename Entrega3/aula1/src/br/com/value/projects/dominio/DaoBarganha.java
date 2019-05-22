/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.value.projects.dominio;
import java.util.ArrayList;
import java.util.List;

public final class DaoBarganha {
    public static ArrayList<Barganha> barganhas = new ArrayList<Barganha>();
    
    public static Barganha PegarBarganha(String nome, String produto) {
        for(Barganha barganha : barganhas )
        {
            if(barganha.getNome()== nome && barganha.getEntrada().getNome() == produto)
                return barganha;
        }
        
        return null;
    }
    
    public static void adicionarBarganha(Barganha barganha)
    {
        barganhas.add(barganha);
    }
    
    public static void removerBarganha(Barganha barganha)
    {
        barganhas.remove(barganha);
    }
    
    public static void criarBarganha(String name,String produto)
    {
        Usuario usuarioNovo = new Usuario(name,"Rua 149");
        Produto produtoTenho = new Produto(produto,null);
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        Produto produtoQuero = new Produto(null,null);
        produtos.add(produtoQuero);
        usuarioNovo.CadastrarBarganha(produtoTenho, produtos, 5);
    }
    
    public static ArrayList<Barganha> pegarBarganhas()
    {
        return barganhas;
    }


         
}
