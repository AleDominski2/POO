public abstract class ItemBibilotecaDigital {
    private String titulo;
    private String autor;

    public ItemBibilotecaDigital (String titulo, String autor){
        this.titulo= titulo;
        this.autor= autor;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public abstract String descricao();


}
