package pedro.produtos;
import pedro.livraria.Autor;

public abstract class Livros implements Produto{
    
    String nome;
    String descricao;
    private double valor;
    String isbn;
    private boolean impresso;

    Autor autor;

    public Livros(Autor autor) {
        this.autor = autor;
        this.impresso = true;
    }

    public Livros() {
    }

    public void mostrarDetalheDoLivro() {
        System.out.println("Detalhes do Livro:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Valor: R$ " + this.getValor());
        System.out.println("ISBN: " + this.isbn);
        if (temAutor()) {
            autor.mostrarDetalheDoAutor();
        }
        System.out.println("------------------------------------");
    }

    public boolean temAutor() {
        return this.autor != null;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIsbn(){
        return this.isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



}