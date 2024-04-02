package ProjetoWebMotors;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected String cor;
    protected int cavalos;
    protected int ano;

    public Veiculo (String marca, String modelo, String cor, int cavalos, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.cavalos = cavalos;
        this.ano = ano;
    }
}
