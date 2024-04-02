package ProjetoWebMotors;


public class Main {
    public static void main(String[] args) {
        Carro audi = new Carro();
        Carro hb20 = new Carro();
        Moto pcx = new Moto();
        Comprador julio = new Comprador();
        Vendedor joao = new Vendedor();
        Pagamento pagamento1 = new Pagamento();
        Pagamento pagamento2 = new Pagamento();

        hb20.setMarca("hb20");
        pagamento2.setFormaDePagamento(0);

        System.out.println(audi.getMarca());
        System.out.println(hb20.getMarca());
        System.out.println(pcx.getCilindradas());
        System.out.println(julio.getRegiao());
        System.out.println(joao.getEmail());
        System.out.println(pagamento1.getFormaDePagamento());
        System.out.println(pagamento2.getFormaDePagamento());
//
    }
}