package ProjetoWebMotors;

public class Carro extends Veiculo {


    public Carro(){
        this("Audi","RS7","Preto",650,2020);

    }
    public Carro (String marca, String modelo, String cor, int cavalos, int ano) {
        super(marca,modelo,cor,cavalos,ano);
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

    public void setMarca(String marca){
        this.marca=marca;
    }

    public void desamassar (){
        System.out.println("Funilaria marcada!");
    };
    public void lavar (){
        System.out.println("Funilaria marcada!");
    };
    public void consertar (){
        System.out.println("Manutenção marcada!");
    };
}

