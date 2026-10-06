
import GestaoVeiculos.Onibus;
import GestaoVeiculos.Rota;
import GestaoVeiculos.Terminal;
import HierarquiaPessoas.Cobrador;
import HierarquiaPessoas.Motorista;
import HierarquiaPessoas.Passageiro;

import java.util.Scanner;


public class Cadastro {
    public static void novoPassageiro(Scanner entrada) {
        Passageiro passageiro = new Passageiro();

        System.out.println("Digite o nome do Passageiro: ");
        while (true) {
            try {
                passageiro.setNome(entrada.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Nome inválido! Tente novamente:");
            }
        }

        System.out.println("Digite o CPF do Passageiro: ");
        while (true) {
            try {
                passageiro.setCpf(entrada.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("CPF inválido! Tente novamente:");
            }
        }

        System.out.println("Digite a categoria do Passageiro: ");
        while (true) {
            try {
                passageiro.setCategoria(entrada.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Nome inválido! Tente novamente:");
            }
        }

        System.out.println("Digite o telefone do Passageiro: ");
        while (true) {
            try {
                passageiro.setTelefone(entrada.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Nome inválido! Tente novamente:");
            }
        }

        System.out.println("Digite o saldo do Passageiro: ");
        while (true) {
            try {
                passageiro.setSaldo(entrada.nextDouble());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Nome inválido! Tente novamente:");
            }
        }

        System.out.println("Passageiro adicionado!");
        passageiro.exibirInformacoes();
        

    }

    public static void novoCobrador(Scanner entrada) {
        Cobrador cobrador = new Cobrador();

        System.out.println("Digite o nome do Cobrador: ");
        while (true) {
            try {
                cobrador.setNome(entrada.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Nome invalido! Tente novamente:");
            }
        }

        System.out.println("Digite o CPF do Cobrador: ");
        while (true) {
            try {
                cobrador.setCpf(entrada.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("CPF invalido! Tente novamente:");
            }
        }

        System.out.println("Digite o telefone do Cobrador: ");
        while (true) {
            try {
                cobrador.setTelefone(entrada.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Telefone invalido! Tente novamente:");
            }
        }

        System.out.println("Digite a matricula do Cobrador: ");
        while (true) {
            try {
                cobrador.setMatricula(entrada.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Matricula invalido! Tente novamente:");
            }
        }

        System.out.println("Digite o turno do  Cobrador: ");
        while (true) {
            try {
                cobrador.setTurno(entrada.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Turno invalido! Tente novamente:");
            }
        }

        System.out.println("Cobrador adicionado!");
        cobrador.exibirInformacoes();
       
    }

    public static void novoOnibus(Scanner entrada) {
        Onibus onibus = new Onibus();

        System.out.println("Digite a placa do onibus:");
        while (true) {
            try {
                onibus.setPlaca(entrada.nextLine());
                break;
            }  catch (IllegalArgumentException e) {
                System.out.println("Placa invalida! Tente novamente:");
            }
        }

        System.out.println("Digite o modelo do onibus:");
        while (true) {
            try {
                onibus.setModelo(entrada.nextLine());
                break;
            }  catch (IllegalArgumentException e) {
                System.out.println("Modelo invalido! Tente novamente:");
            }
        }

        System.out.println("Digite a capacidade de passageiros em pe: ");
        while (true) {
            try{
                onibus.setCapacidadeEmPe(entrada.nextInt());
                break;
            } catch(IllegalArgumentException e){
                System.out.println("Capacidade invalida! Tente novamente:");
            }
        }

        System.out.println("Digite a capacidade de passageiros sentados: ");
        while (true) {
            try {
                onibus.setCapacidadeSentados(entrada.nextInt());
                break;
            } catch(IllegalArgumentException e){
                System.out.println("Capacidade invalida! Tente novamente:");
            }
        }

        System.out.println("Onibus adicionado!");
        onibus.informacoesOnibus();
        
    }

    public static void novoMotorista(Scanner entrada) {
        Motorista motorista = new Motorista();

        System.out.println("Digite o nome do motorista: ");
        while (true) {
            try {
                motorista.setNome(entrada.nextLine());
                break;
            }  catch (IllegalArgumentException e) {
                System.out.println("Nome invalido! Tente novamente:");
            }
        }

        System.out.println("Digite o CPF do motorista: ");
        while (true) {
            try {
                motorista.setCpf(entrada.nextLine());
                break;
            }   catch (IllegalArgumentException e) {
                System.out.println("CPF invalido! Tente novamente:");
            }
        }

        System.out.println("Digite o telefone do motorista: ");
        while (true) {
            try {
                motorista.setTelefone(entrada.nextLine());
                break;
            }   catch (IllegalArgumentException e) {
                System.out.println("Telefone invalido! Tente novamente:");
            }
        }

        System.out.println("Digite o numero da CNH do motorista: ");
        while (true) {
            try {
                motorista.setNumeroCnh(entrada.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("CNH invalida! Tente novamente:");
            }
        }

        System.out.println("Digite a categoria da CNH do motorista: ");
        while (true) {
            try {
                motorista.setCategoriaCnh(entrada.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Categoria invalida! Tente novamente:");
            }
        }

        System.out.println("Digite o turno do motorista: ");
        while (true) {
            try {
                motorista.setTurnoMotorista(entrada.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Turno invalido! Tente novamente:");
            }
        }

        System.out.println("Motorista adicionado!");
        motorista.exibirInformacoes();
       
    }

    public static void novaRota(Scanner entrada) {
        Rota rota = new Rota();

        System.out.println("Digite o nome da rota: ");
        while (true) {
            try {
                rota.setNomeLinha(entrada.nextLine());
                break;
            }   catch (IllegalArgumentException e) {
                System.out.println("Nome invalido! Tente novamente:");
            }
        }

        System.out.println("Digite o codigo da rota: ");
        while (true) {
            try {
                rota.setCodigoLinha(entrada.nextInt());
                break;
            }   catch (IllegalArgumentException e) {
                System.out.println("Codigo invalido! Tente novamente:");
            }
        }

        System.out.println("Informacoes da linha: ");
        rota.imprimirItinerario();
        
    }

    public static void novoTerminal(Scanner entrada) {
        Terminal terminal = new Terminal();

        System.out.println("Digite o nome do terminal: ");
        while (true) {
            try {
                terminal.setNomeTerminal(entrada.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Nome invalido! Tente novamente:");
            }
        }

        System.out.println("Digite o ID do terminal: ");
        while (true) {
            try {
                terminal.setIdTerminal(entrada.nextInt());
                break;
            }  catch (IllegalArgumentException e) {
                System.out.println("ID invalido! Tente novamente:");
            }
        }

        System.out.println("Digite a localizacao do Terminal ");
        while (true) {
            try {
                terminal.setLocalizacao(entrada.nextLine());
                break;
            }   catch (IllegalArgumentException e) {
                System.out.println("Localizacao invalida! Tente novamente:");
            }
        }
        System.out.println("Terminal adicionado.");
        terminal.toString();
        
    }
}
