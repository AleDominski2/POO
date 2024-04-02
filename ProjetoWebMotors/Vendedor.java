package ProjetoWebMotors;

public class Vendedor extends Pessoa{
    public Vendedor (String nome,String cpf,String cnpj,String email,String telefone,String regiao){
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone = telefone;
        this.regiao = regiao;
    }
    public Vendedor(){
        this("Joao","989443984","94934839","joaoemail@gmail.com","9988776755","Curitiba , PR");
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
    public void criarAnuncio (){
        System.out.println("Anúncio criado!!");
    };
    public void editarAnuncio () {
        System.out.println("Anuncio editado!!");
    }
}
