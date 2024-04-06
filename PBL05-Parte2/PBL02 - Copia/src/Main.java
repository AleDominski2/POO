
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        ArrayList<Comprador> compradores = new ArrayList<>();
        ArrayList<Carro> carros = new ArrayList<>();
        ArrayList<Moto> motos = new ArrayList<>();
        int i;
        do {
            System.out.println("- - - - - Bem Vindo!! - - - - -\n O que deseja fazer?\n 1. Cadastrar Usuário\n 2. Cadastrar Veiculo\n 0. Sair\n - - - - - - - - - - - - - - - ");
            i = scanner.nextInt();
            switch (i) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("Que tipo de usuário deseja Cadastrar? \n 1. Cadastro Vendedor\n 2. Cadastro Comprador\n 0. Sair");
                    i = scanner.nextInt();
                    cadastroUsuario(i, vendedores, compradores);
                    break;
                case 2:
                    System.out.println("Que veiculo deseja Cadastrar? \n 1. Cadastrar carro\n 2.Cadastrar moto\n 0. Sair");
                    i = scanner.nextInt();
                    cadastroVeiculo(i, carros, motos);
                    break;
            }

        } while (i != 0);
        scanner.close();

     if (!vendedores.isEmpty()){
         System.out.println("Informações dos vendedores:");
         for (Vendedor vendedor: vendedores){
             System.out.println("Nome: "+ vendedor.getNome() +"\nCPF: "+ vendedor.getCpf()+"\nE-mail: "+ vendedor.getEmail() +"\nTelefone: "+ vendedor.getTelefone() +"\nCidade: "+ vendedor.getCidade());
         }
     }else {
         System.out.println("Nenhum vendedor criado");}

     if (!compradores.isEmpty()){
         System.out.println("Informações dos compradores:");
         for (Comprador comprador: compradores){
             System.out.println("Nome: "+ comprador.getNome() +"\nCPF: "+ comprador.getCpf()+"\nE-mail: "+ comprador.getEmail() +"\nTelefone: "+ comprador.getTelefone() +"\nCidade: "+ comprador.getCidade());
            }
        }else{
            System.out.println("Nenhum comprador criado");}

     if (!carros.isEmpty()){
            System.out.println("Informações dos carros:");
            for (Carro carro: carros){
                System.out.println("Marca: "+ carro.getMarca() +"\nModelo: "+ carro.getModelo()+"\nCor: "+ carro.getCor() +"\nCavalos: "+ carro.getCavalos() +"\nAno: "+ carro.getAno());
            }
        }else{
            System.out.println("Nenhum carro criado");}
     if (!motos.isEmpty()){
         System.out.println("Informações das motos:");
         for (Moto moto: motos){
             System.out.println("Marca: "+ moto.getMarca() +"\nModelo: "+ moto.getModelo()+"\nCor: "+ moto.getCor() +"\nCavalos: "+ moto.getCavalos() +"\nAno: "+ moto.getAno()+"\nCilindradas: "+ moto.getCilindradas());
            }
        }else{
         System.out.println("Nenhuma moto criada");}
    }public static void cadastroUsuario(int i, ArrayList<Vendedor> vendedores, ArrayList<Comprador> compradores){
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

                Vendedor vendedor = new Vendedor(nome,cpf,email,telefone,cidade);
                vendedores.add(vendedor);
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

                Comprador comprador = new Comprador (nome,cpf,email,telefone,cidade);
                compradores.add(comprador);
                break;
        }

    }
    public static void cadastroVeiculo(int i, ArrayList<Carro> carros, ArrayList<Moto> motos) {
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

                Carro carro = new Carro(marca, modelo, cor, cavalos,ano);
                carros.add(carro);
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

                Moto moto = new Moto(marca, modelo, cor, cavalos,ano,cilindradas);
                motos.add(moto);
                break;

        }
    }

}