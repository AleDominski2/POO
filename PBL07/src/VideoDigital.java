public class VideoDigital extends ItemBibilotecaDigital implements Baixavel, Visualizavel{

    public VideoDigital(String titulo, String autor){
        super(titulo,autor);
    }
    public void baixar(){System.out.println("Video: '"+getTitulo()+"' baixado!");}
    public void visualizar() {System.out.println("Agora você está vendo:'"+getTitulo()+"'");}
    public String descricao() {
        return "VÍDEO DIGITAL "+"\nTítulo: "+ getTitulo()+"\nAutor: "+ getAutor();
    }
}
