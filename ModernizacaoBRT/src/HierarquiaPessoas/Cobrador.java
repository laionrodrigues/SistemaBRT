package HierarquiaPessoas;

public class Cobrador extends Pessoa{
    private String matricula;
    private String turno;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        if (!turno.equalsIgnoreCase("matutino") &&
                !turno.equalsIgnoreCase("vespertino") &&
                !turno.equalsIgnoreCase("noturno")) {

            throw new IllegalArgumentException("Turno inválido!");
        }
        this.turno = turno;
    }

    public Cobrador() {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || matricula.isBlank()){
            throw new IllegalArgumentException("A matrícula tem que ser digitada!");
        }
        this.matricula = matricula;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Informações cobrador: ");
        System.out.println();
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Turno: " + getTurno());
    }
}
