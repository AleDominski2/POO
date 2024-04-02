package ProjetoWebMotors;

public class Pagamento {
    private String banco;
    private int parcelas;
    private String formaDePagamento;

    public Pagamento(String banco, int parcelas, String formaDePagamento){
        this.banco = banco;
        this.parcelas = parcelas;
        this.formaDePagamento = formaDePagamento;
    }

    public Pagamento(){
        this("Santander", 12, "Financiado");
    }

    public String getBanco() {
        return banco;
    }

    public int getParcelas() {
        return parcelas;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento (int parcelas){
        if (parcelas == 0){
            formaDePagamento= "A vista";
        }
    }

    public void financiar(int parcelas){
        System.out.println("Seu financiamento vai ser de "+ parcelas+" parcelas");}
    public void pagarAVista(){
        System.out.println("Pagamento a vista");
    }
    public void trocarDeCarro (){
        System.out.println("Carro trocado");
    }
};
