package pedro.teste;
import pedro.produtos.Livros;
import pedro.produtos.Revista;

public class CarrinhoDeCompras {
    
    private Double total = 0.0;

    public void adiciona(Livros livro) {
        System.out.println("Adicionado : " + livro);
        this.total += livro.getValor();
    }

    public void adiciona(Revista revista) {
        System.out.println("Adicionado : " + revista);
        revista.aplicaDescontoDe(0.05);
        this.total += revista.getValor();
    }

    public Double getTotal() {
        return this.total;
    }

}
