public class CarrinhoDeCompras {
    
    private Double total = 0.0;

    public void adiciona(Livros livro) {
        System.out.println("Adicionado : " + livro);
        livro.aplicaDescontoDe(5);
        this.total += livro.getValor();
    }

    public Double getTotal() {
        return this.total;
    }

}
