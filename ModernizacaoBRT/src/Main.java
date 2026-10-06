import HierarquiaPessoas.Cobrador;
import HierarquiaPessoas.Motorista;
import HierarquiaPessoas.Passageiro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


//        Motorista m1 = new Motorista();
//        m1.setNome("Adriano");
//        m1.setCpf("96384542102");
//        m1.setCategoriaCnh("C");
//        m1.setTelefone("987623223");
//        m1.setValidadeCnh("12/2033");
//        m1.exibirInformacoes();
//
//        Cobrador c1 = new Cobrador();
//        c1.setNome("Guilherme");
//        c1.setCpf("99778385181");
//        c1.setTelefone("980809090");
//        c1.setMatricula("100AA");
//        c1.exibirInformacoes();
//
//        Passageiro p1 = new Passageiro();
//        p1.setNome("Fabricio");
//        p1.setCpf("19347477184");
//        p1.setTelefone("970706060");
//        p1.setCategoria("comum");
//        p1.setCodigoCartao("1020304050");
//        p1.setSaldo(50);
//        p1.calcularValorTarifa();
//        p1.debitarTarifa();
//        p1.exibirInformacoes();
//
//        Passageiro p2 = new Passageiro();
//        p1.setNome("Fabricio");
//        p1.setCpf("02995800164");
//        p1.setTelefone("970706060");
//        p1.setCategoria("Estudante");
//        p1.setCodigoCartao("1020304050");
//        p1.setSaldo(60);
//        p1.calcularValorTarifa();
//        p1.debitarTarifa();
//        p1.exibirInformacoes();
//
//        Passageiro p3 = new Passageiro();
//        p1.setNome("Fabricio");
//        p1.setCpf("72287750150");
//        p1.setTelefone("970706060");
//        p1.setCategoria("IDOSO");
//        p1.setCodigoCartao("1020304050");
//        p1.setSaldo(40);
//        p1.calcularValorTarifa();
//        p1.debitarTarifa();
//        p1.exibirInformacoes();


        int opcao;
        do {
            System.out.println("===BEM VINDO AO SISTEMA BRT===");
            System.out.println();
            System.out.println("O que voce deseja fazer?");
            System.out.println("Opção 1 - Novo passageiro");
            System.out.println("Opção 2 - Novo motorista");
            System.out.println("Opção 3 - Novo cobrador");
            System.out.println("Opção 4 - Novo ônibus.");
            System.out.println("Opção 5 - Nova rota.");
            System.out.println("Opção 6 - Novo terminal.");
            System.out.println("Opção 7 - mais opções");
            System.out.println("Opção 8 - Sair.");

            System.out.print("Digite uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    Cadastro.novoPassageiro(entrada);
                    break;
                case 2:
                    Cadastro.novoMotorista(entrada);
                    break;
                case 3:
                    Cadastro.novoCobrador(entrada);
                    break;
                case 4:
                    Cadastro.novoOnibus(entrada);
                    break;
                case 5:
                    Cadastro.novaRota(entrada);
                    break;
                case 6:
                    Cadastro.novoTerminal(entrada);
                    break;
                case 7:
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 8);

    }
}
