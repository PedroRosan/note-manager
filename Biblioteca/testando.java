public class testando {

    public static void main(String[] args) {
        Livros livro = new Livros();
        livro.setNome("Aprendendo Java");
        livro.setDescricao("Um guia completo para iniciantes em Java.");
        livro.setValor(49.90);
        livro.setIsbn("978-3-16-148410-0");

        livro.setAutor(new Autor());
        livro.getAutor().setNome("João da Silva");
        livro.getAutor().setDataNascimento("01/01/1980");
        livro.getAutor().setNacionalidade("Brasileiro");

        livro.aplicaDescontoDe(10);
        
        livro.mostrarDetalheDoLivro();
    }
}
