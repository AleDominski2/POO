public class Moto extends Veiculo {
    private int cilindradas;
    public Moto(String marca, String modelo, String cor, int cavalos,int ano, int cilindradas) {
        super(marca, modelo,cor, cavalos, ano);
        this.cilindradas = cilindradas;

    }
    public Moto() {
        this("Honda", "PCX", "azul", 25, 160, 2023);
    }
    public int getCilindradas() {
        return cilindradas;
    }


    public void setMarca(String marca){
        this.marca=marca;
    }
}
