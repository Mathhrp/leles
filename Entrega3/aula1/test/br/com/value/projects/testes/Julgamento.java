
package br.com.value.projects.testes;

import br.com.value.projects.dominio.Barganha;
import br.com.value.projects.dominio.Produto;
import br.com.value.projects.dominio.Usuario;
import br.com.value.projects.dominio.DaoBarganha;
import java.util.ArrayList;

import org.junit.*;
import static org.mockito.Mockito.mock;

public class Julgamento {
    @Test
    public void teste_Cadastrar_Barganha()
    {
        Usuario usuarioNovo = new Usuario("Lucas","Rua 149");
        Produto produtoTenho = new Produto("escada","Image.png");
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        Produto produtoQuero = new Produto("furadeira","Image.png");
        produtos.add(produtoQuero);
        usuarioNovo.CadastrarBarganha(produtoTenho,produtos, null);
        Barganha barganha = DaoBarganha.PegarBarganha("Lucas","escada");
        Assert.assertNotEquals(barganha, null);
    }
    
    @Test
    public void teste_Listar_Barganha_Mock()
    {
       DaoBarganha.criarBarganha("Lucas", "Escada");
       DaoBarganha.criarBarganha("Matheus", "PC");
       DaoBarganha.criarBarganha("Fernando", "Alicate");
       ArrayList<Barganha> barganhas = DaoBarganha.pegarBarganhas();
       Assert.assertEquals(barganhas.size(), 3, 0.000001f);
        
    }
    

}
