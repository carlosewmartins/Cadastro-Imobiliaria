import java.util.ArrayList;
import java.util.Scanner;

// Classe principal
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Corretor> corretores = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Imovel> imoveis = new ArrayList<>();

        int opcao;

        System.out.println("---- BEM VINDO ----");
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar corretor.");
            System.out.println("2. Cadastrar cliente.");
            System.out.println("3. Cadastrar imóvel.");
            System.out.println("4. Listar corretores.");
            System.out.println("5. Listar clientes.");
            System.out.println("6. Listar imóveis.");
            System.out.println("7. Sair.");
            System.out.println("Digite uma opção: ");


            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrando corretor");

                    System.out.println("Digite o nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o CRECI: ");
                    String creci = sc.nextLine();

                    System.out.println("Digite o email:");
                    String email = sc.nextLine();

                    System.out.println("Digite o telefone: ");
                    String telefone = sc.nextLine();

                    // Cadastro do corretor
                    corretores.add(new Corretor(nome, creci, email, telefone));

                    System.out.println(nome + " cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Cadastrando cliente");

                    System.out.println("Digite o nome do cliente:");
                    String nomeCliente = sc.nextLine();

                    System.out.println("Digite o CPF:");
                    String cpf = sc.nextLine();

                    System.out.println("Digite o email:");
                    String emailCliente = sc.nextLine();

                    System.out.println("Digite o telefone:");
                    String telefoneCliente = sc.nextLine();

                    // Cadastro do cliente
                    clientes.add(new Cliente(nomeCliente, cpf, emailCliente, telefoneCliente));
                    System.out.println(nomeCliente + " cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("Cadastrando imóvel");

                    System.out.println("Digite o endereço:");
                    String endereco = sc.nextLine();

                    System.out.println("Digite o valor:");
                    double valor = sc.nextDouble();
                    sc.nextLine(); // Limpar o buffer

                    System.out.println("Digite o tipo (apartamento, casa, etc.):");
                    String tipo = sc.nextLine();

                    // Cadastro do imóvel
                    imoveis.add(new Imovel(endereco, valor, tipo));
                    System.out.println("Imóvel cadastrado com sucesso!");
                    break;

                case 4:
                    System.out.println("Lista de corretores:");
                    for (Corretor corretor : corretores) {
                        System.out.println("Nome: " + corretor.getNome());
                        System.out.println("CRECI: " + corretor.getCreci());
                        System.out.println("Email: " + corretor.getEmail());
                        System.out.println("Telefone: " + corretor.getTelefone());
                        System.out.println("-----------");
                    }
                    break;

                case 5:
                    System.out.println("Lista de clientes:");
                    for (Cliente cliente : clientes) {
                        System.out.println("Nome: " + cliente.getNome());
                        System.out.println("CPF: " + cliente.getCpf());
                        System.out.println("Email: " + cliente.getEmail());
                        System.out.println("Telefone: " + cliente.getTelefone());
                        System.out.println("-----------");
                    }
                    break;

                case 6:
                    System.out.println("Lista de imóveis:");
                    for (Imovel imovel : imoveis) {
                        System.out.println("Endereço: " + imovel.getEndereco());
                        System.out.println("Valor: R$ " + imovel.getValor());
                        System.out.println("Tipo: " + imovel.getTipo());
                        System.out.println("-----------");
                    }
                    break;

                case 7:
                    System.out.println("Obrigada por usar nosso software!");
                    break;

                default:
                    System.out.println("Opção inválida. Digite um número entre 1 e 7.");
                    break;
            }
        } while (opcao != 7);
    }
}
