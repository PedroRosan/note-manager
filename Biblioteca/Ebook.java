public class Ebook extends Livros {

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
        return super.aplicaDescontoDe(porcentagem);
    }
    
}