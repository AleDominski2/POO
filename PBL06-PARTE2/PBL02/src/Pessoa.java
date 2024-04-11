public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String email;
    protected String telefone;
    protected String cidade;

public Pessoa (String nome, String cpf, String email, String telefone, String cidade) {
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    this.telefone = telefone;
    this.cidade = cidade;
}
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getCidade() {
        return cidade;
    }
}