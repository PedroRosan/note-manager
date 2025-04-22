package pedro.teste;
import pedro.livraria.Autor;
import pedro.produtos.Ebook;
import pedro.produtos.LivroFisico;

public class testando {

    public static void main(String[] args) {
        
        Autor autor = new Autor();
        autor.setNome("João da Silva");

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Aprendendo Java - Edição Digital");
        ebook.setDescricao("Versão digital do guia completo para iniciantes em Java.");
        ebook.setValor(29.90);

        if(ebook.aplicaDescontoDe(15)) {
            System.out.println("Desconto aplicado com sucesso!");
        } else {
            System.out.println("Desconto não aplicado.");
        }

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setNome("Aprendendo Java - Edição Impressa");
        livroFisico.setDescricao("Versão impressa do guia completo para iniciantes em Java.");
        livroFisico.setValor(49.90);
        if(livroFisico.aplicaDescontoDe(10)) {
            System.out.println("Desconto aplicado com sucesso!");
        } else {
            System.out.println("Desconto não aplicado.");
        }

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(ebook);
        carrinho.adiciona(livroFisico); 

        System.out.println("Total do carrinho: " + carrinho.getTotal());

    }
}
