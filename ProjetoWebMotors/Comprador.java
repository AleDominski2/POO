package ProjetoWebMotors;

public class Comprador extends Pessoa{


    public Comprador (String nome,String cpf,String cnpj,String email,String telefone,String regiao){
    super(nome, cpf, cnpj, email, telefone, regiao);
    }
    public Comprador(){
        this("Julio","989483984","98934839","julioemail@gmail.com","9988776655","Jenipapo de Minas, MG");
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getCnpj() {
        return cnpj;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao){
        this.regiao=regiao;
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

