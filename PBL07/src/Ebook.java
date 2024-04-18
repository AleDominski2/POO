public class Ebook extends ItemBibilotecaDigital implements Baixavel{
    private int numeroDePaginas;

    public Ebook(String titulo,String autor,int numeroDePaginas){
        super(titulo,autor);
        this.numeroDePaginas=numeroDePaginas;
    }
    public int getNumeroDePaginas(){
        return numeroDePaginas;
    }

    public void baixar() {System.out.println("Ebook '"+getTitulo()+"' baixado!");}
    public String descricao() {
        return "EBOOK"+ "\nTítulo: "+ getTitulo()+"\nAutor: "+ getAutor()+"\nNúmero de Páginas: "+ getNumeroDePaginas();
    }
}
