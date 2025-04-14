public class RegistroDeVendas {

    public static void main(String[] args) {
        
        Autor autor = new Autor();
        autor.setNome("João da Silva");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Aprendendo Java");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Aprendendo Java - Edição Digital");
        ebook.setValor(39.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total do carrinho: " + carrinho.getTotal());
        

    }
}
