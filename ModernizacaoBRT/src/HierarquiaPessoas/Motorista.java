package HierarquiaPessoas;

public class Motorista extends Pessoa{
    private String numeroCnh;
    private String categoriaCnh;
    private String validadeCnh;//usar o local date
    private String turnoMotorista;

    public String getTurnoMotorista() {
        return turnoMotorista;
    }

    public void setTurnoMotorista(String turnoMotorista) {
        if (!turnoMotorista.equalsIgnoreCase("matutino") &&
                !turnoMotorista.equalsIgnoreCase("vespertino") &&
                !turnoMotorista.equalsIgnoreCase("noturno")) {

            throw new IllegalArgumentException("Turno inválido!");
        }
        this.turnoMotorista = turnoMotorista;
    }


    public Motorista() {
        this.numeroCnh = numeroCnh;
        this.categoriaCnh = categoriaCnh;
        this.validadeCnh = validadeCnh;
    }

    public boolean setNumeroCnh(String cnh) {
        if (cnh == null || cnh.isEmpty()) {
            throw new IllegalArgumentException("CNH não pode ser vazia!");
        }
        if (!cnh.matches("[0-9]{11}")) {
            throw new IllegalArgumentException("CNH deve possuir 11 dígitos!");
        }
        if (cnh.matches("(\\d)\\1{10}")) {
            throw new IllegalArgumentException("CNH inválida!");
        }
        int soma = 0;
        int peso = 9;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cnh.charAt(i)) * peso;
            peso--;
        }
        int primeiroDigito = soma % 11;
        if (primeiroDigito == 10) {
            primeiroDigito = 0;
        }
        soma = 0;
        peso = 1;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cnh.charAt(i)) * peso;
            peso++;
        }
        int segundoDigito = soma % 11;

        if (segundoDigito == 10) {
            segundoDigito = 0;
        }
        if (primeiroDigito != Character.getNumericValue(cnh.charAt(9))
                || segundoDigito != Character.getNumericValue(cnh.charAt(10))) {
            throw new IllegalArgumentException("CNH inválida!");
        }
        this.numeroCnh = cnh;
        return true;
    }

    public String getNumeroCnh() {
        return numeroCnh;
    }


    public String getCategoriaCnh() {
        return categoriaCnh;
    }

    public void setCategoriaCnh(String categoriaCnh) {
        if(categoriaCnh == null || categoriaCnh.isEmpty()) {
            throw new IllegalArgumentException("A categoria deve ser digitada.");
        }
        if (!categoriaCnh.equalsIgnoreCase("D")){
            throw new IllegalArgumentException("Categoria invalida.");
        }
        this.categoriaCnh = categoriaCnh;
    }

    public String getValidadeCnh() {
        return validadeCnh;
    }

    public void setValidadeCnh(String validadeCnh) {
        this.validadeCnh = validadeCnh;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Informações motorista: ");
        System.out.println();
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Número CNH: " + getNumeroCnh());
//        System.out.println("Validade CNH: " + getValidadeCnh());
        System.out.println("Categoria CNH: " + getCategoriaCnh());
        System.out.println("Turno: " + getTurnoMotorista());
    }
}
