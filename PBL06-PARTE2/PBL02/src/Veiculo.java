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
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getCor(){
        return cor;
    }
    public int getCavalos(){
        return cavalos;
    }
    public int getAno() {
        return ano;
    }
}
