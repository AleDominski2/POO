public class Main {
    public static void main(String[] args) {
        Ebook livro1 = new Ebook("Teste","Julio",19);
        VideoDigital video1 = new VideoDigital("Como pensar","Julio Gameplays");

        livro1.baixar();
        video1.baixar();
        System.out.println(livro1.descricao());
        System.out.println(video1.descricao());
        video1.visualizar();
}}