public class Comprador extends Pessoa{
    public Comprador (String nome,String cpf,String email,String telefone,String cidade){
    super (nome,cpf,email,telefone,cidade);
    }
    public Comprador(){
        this("Julio","989483984","julioemail@gmail.com","9988776655","Jenipapo de Minas, MG");
    }
    public void setCidade(String cidade){
        this.cidade=cidade;
    }

    public void demonstrarInteresse (String carro){
        System.out.println("Interesse demonstrado!");
    };

    public void fazerContato (String telefone){
        System.out.println("Contato feito!");
    }
    public void pesquisar () {
        System.out.println("Carro pesquisado!");
    };
}
