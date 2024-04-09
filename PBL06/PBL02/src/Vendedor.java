public class Vendedor extends Pessoa {
    public Vendedor(String nome,String cpf,String email,String telefone,String cidade) {
        super (nome,cpf,email,telefone,cidade);
    }

    public void setCidade(String cidade){
        this.cidade=cidade;
    }
    public void criarAnuncio (){
        System.out.println("Anúncio criado!!");
    };
    public void editarAnuncio () {
        System.out.println("Anuncio editado!!");
    }
}
