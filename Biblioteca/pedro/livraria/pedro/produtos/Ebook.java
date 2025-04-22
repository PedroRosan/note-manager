package pedro.produtos;
import pedro.livraria.Autor;

public class Ebook extends Livros implements Promocional {

    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
    public String getWaterMark() {
        return waterMark;
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 15) {
            return false;
        }
        double desconto = this.getValor() * porcentagem / 100;
        this.setValor(this.getValor() - desconto);
        return true;
    }
    
}