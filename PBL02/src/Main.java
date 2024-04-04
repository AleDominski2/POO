import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scannermenu = new Scanner(System.in);

//        Carro audi = new Carro();
//        Carro hb20 = new Carro();
//        Moto pcx = new Moto();
//        Comprador julio = new Comprador();
//        Vendedor joao = new Vendedor();
//        Pagamento pagamento1 = new Pagamento();
//        Pagamento pagamento2 = new Pagamento();
//
//        hb20.setMarca("hb20");
//        pagamento2.setFormaDePagamento(0);
//
//        System.out.println(audi.getMarca());
//        System.out.println(hb20.getMarca());
//        System.out.println(pcx.getCilindradas());
//        System.out.println(julio.getRegiao());
//        System.out.println(joao.getEmail());
//        System.out.println(pagamento1.getFormaDePagamento());
//        System.out.println(pagamento2.getFormaDePagamento());
        while (true){
            System.out.println("Bem Vindo!!\n O que deseja fazer?\n 1 Cadastro Usuário\n 2 Cadastro Veiculo\n 0 Sair");
            int i=scannermenu.nextInt();
            switch (i) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("Que usuário deseja Cadastrar? \n 1 Cadastro Vendedor\n 2 Cadastro Comprador\n 0 Sair");
                    i=scannermenu.nextInt();
                    cadastroUsuario(i);
                    continue;
                case 2:
                    System.out.println("Que veiculo deseja Cadastrar? \n 1 Cadastro carro\n 2 Cadastro moto\n 0 Sair");
                    i=scannermenu.nextInt();
                    cadastroVeiculo(i);
                    continue;

            }
        }
        public void cadastroUsuario(int i){
                switch(i){
                    case 0:
                        System.out.println("Sair");
                        break;
                    case 1:
                        System.out.println("cadastrar vendedor");

                        continue;
                    case 2:
                        System.out.println("cadastrar comprador");
                        continue;
                }
        }
        public void cadastroVeiculo( int i){
                switch(i){
                    case 0:
                        System.out.println("Sair");
                        break;
                    case 1:
                        System.out.println("cadastrar carro");

                        continue;
                    case 2:
                        System.out.println("cadastrar moto");
                        continue;
                }
        }
    }
}