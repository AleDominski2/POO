
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> usuarios = new ArrayList<>();
        ArrayList<Veiculo> automoveis = new ArrayList<>();
        int i;
        do {
            System.out.println("- - - - - Bem Vindo!! - - - - -\n O que deseja fazer?\n 1. Cadastrar Usuário\n 2. Cadastrar Veiculo\n 3. Ver Registros\n 0. Sair\n - - - - - - - - - - - - - - - ");
            i = scanner.nextInt();
            switch (i) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("Que tipo de usuário deseja Cadastrar? \n 1. Cadastro Vendedor\n 2. Cadastro Comprador\n 0. Sair");
                    i = scanner.nextInt();
                    cadastroUsuario(i, usuarios);
                    break;
                case 2:
                    System.out.println("Que veiculo deseja Cadastrar? \n 1. Cadastrar carro\n 2.Cadastrar moto\n 0. Sair");
                    i = scanner.nextInt();
                    cadastroVeiculo(i, automoveis);
                    break;
                case 3:
                    if (!usuarios.isEmpty()){
                        System.out.println("Informações dos usuarios:");
                        for (Pessoa vendedor: usuarios){
                            if(vendedor instanceof Vendedor){
                                Vendedor v = (Vendedor) vendedor;
                                System.out.println("VENDEDOR:Nome: "+ v.getNome() +",CPF: "+ v.getCpf()+",E-mail: "+ v.getEmail() +",Telefone: "+ v.getTelefone() +",Cidade: "+ v.getCidade());}
                        }
                        for (Pessoa comprador: usuarios){
                            if (comprador instanceof Comprador){
                                Comprador co = (Comprador) comprador;
                                System.out.println("COMPRADOR:Nome: " + co.getNome() + ",CPF: " + co.getCpf() + ",E-mail: " + co.getEmail() + ",Telefone: " + co.getTelefone() + ",Cidade: " + co.getCidade());}
                        }}else{
                        System.out.println("Nenhum usuario criado");}
                    if (!automoveis.isEmpty()){
                        System.out.println("Informações dos veículos:");
                        for (Veiculo carro: automoveis) {
                            if (carro instanceof Carro) {
                                Carro ca = (Carro) carro;
                                System.out.println("CARRO: Marca: " + ca.getMarca() + ",Modelo: " + ca.getModelo() + ",Cor: " + ca.getCor() + ",Cavalos: " + ca.getCavalos() + ",Ano: " + ca.getAno());
                            }
                        }for (Veiculo moto: automoveis){
                            if(moto instanceof Moto) {
                                Moto m = (Moto)moto;
                                System.out.println("MOTO: Marca: "+ m.getMarca() +",Modelo: "+ m.getModelo()+",Cor: "+ m.getCor() +",Cavalos: "+ m.getCavalos() +",Ano: "+ m.getAno()+",Cilindradas: "+ m.getCilindradas());
                            }}}else{System.out.println("Nenhum veiculo criado");}}

        } while (i != 0);
        scanner.close();

    }public static void cadastroUsuario(int i, ArrayList<Pessoa> usuarios){
        Scanner scannerUsuario = new Scanner(System.in);
        switch(i){
            case 0:
                System.out.println("Saindo...");
                break;

            case 1:
                System.out.println("CADASTRO DE VENDEDOR");
                System.out.println("Digite o seu nome:");
                String nome = scannerUsuario.nextLine();
                System.out.println("Digite o seu cpf:");
                String cpf = scannerUsuario.nextLine();
                System.out.println("Digite o seu email:");
                String email = scannerUsuario.nextLine();
                System.out.println("Digite o seu telefone:");
                String telefone = scannerUsuario.nextLine();
                System.out.println("Digite o seu cidade:");
                String cidade = scannerUsuario.nextLine();
                System.out.println("VENDEDOR CADASTRADO!\n RETORNANDO PARA O MENU...");

                Pessoa vendedor = new Vendedor(nome,cpf,email,telefone,cidade);
                usuarios.add(vendedor);
                break;

            case 2:
                System.out.println("CADASTRO DE COMPRADOR");
                System.out.println("Digite o seu nome:");
                nome = scannerUsuario.nextLine();
                System.out.println("Digite o seu cpf:");
                cpf = scannerUsuario.nextLine();
                System.out.println("Digite o seu email:");
                email = scannerUsuario.nextLine();
                System.out.println("Digite o seu telefone:");
                telefone = scannerUsuario.nextLine();
                System.out.println("Digite o seu cidade:");
                cidade = scannerUsuario.nextLine();
                System.out.println("COMPRADOR CADASTRADO! \n RETORNANDO PARA O MENU...");

                Pessoa comprador = new Comprador (nome,cpf,email,telefone,cidade);
                usuarios.add(comprador);
                break;
        }

    }
    public static void cadastroVeiculo(int i, ArrayList<Veiculo> automoveis) {
        Scanner scannerVeiculo = new Scanner(System.in);
        switch (i) {
            case 0:
                System.out.println("Saindo...");
                break;
            case 1:
                System.out.println("CADASTRO DE CARRO");
                System.out.println("Digite a marca:");
                String marca = scannerVeiculo.nextLine();
                System.out.println("Digite o modelo:");
                String modelo = scannerVeiculo.nextLine();
                System.out.println("Digite a cor:");
                String cor = scannerVeiculo.nextLine();
                System.out.println("Digite quantos cavalos:");
                int cavalos = scannerVeiculo.nextInt();
                System.out.println("Digite o ano:");
                int ano = scannerVeiculo.nextInt();
                System.out.println("CARRO CADASTRADO! \n RETORNANDO PARA O MENU...");

                Veiculo carro = new Carro(marca, modelo, cor, cavalos,ano);
                automoveis.add(carro);
                break;

            case 2:
                System.out.println("CADASTRO DE MOTO");
                System.out.println("Digite a marca:");
                marca = scannerVeiculo.nextLine();
                System.out.println("Digite o modelo:");
                modelo = scannerVeiculo.nextLine();
                System.out.println("Digite a cor:");
                cor = scannerVeiculo.nextLine();
                System.out.println("Digite quantos cavalos:");
                cavalos = scannerVeiculo.nextInt();
                System.out.println("Digite o ano:");
                ano = scannerVeiculo.nextInt();
                System.out.println("Digite quantas cilindradas:");
                int cilindradas = scannerVeiculo.nextInt();
                System.out.println("MOTO CADASTRADA! \n RETORNANDO PARA O MENU...");

                Veiculo moto = new Moto (marca, modelo, cor, cavalos,ano,cilindradas);
                automoveis.add(moto);
                break;

        }
    }

}