public class Moto extends Veiculo {
    private int cilindradas;


    public Moto(String marca, String modelo, String cor, int cavalos,int ano, int cilindradas) {
        super(marca, modelo,cor, cavalos, ano);
        this.cilindradas = cilindradas;

    }
    public Moto() {
        this("Honda", "PCX", "azul", 25, 160, 2023);
    }
    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }
    public String getCor(){
        return cor;
    }
    public int getCavalos() {
        return cavalos;
    }
    public int getCilindradas() {
        return cilindradas;
    }
    public int getAno(){
        return ano;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }
}
