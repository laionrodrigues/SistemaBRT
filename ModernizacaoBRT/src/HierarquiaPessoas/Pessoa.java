package HierarquiaPessoas;

public abstract class Pessoa {
    protected int id;
    protected String nome;
    protected String telefone;
    protected String cpf;

    public abstract void exibirInformacoes();

    public Pessoa() {
        this.id = (int) (Math.random() * 1000) + 1;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("O nome preciso ser digitado!");
        }
        if (nome.length() < 3){
            throw new IllegalArgumentException("O nome precisa ser maior ou igual que 3 caracteres.");
        }
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || telefone.isEmpty()){
            throw new IllegalArgumentException("O telefone precisa ser digitado!");
        }
        if (telefone.length() != 9){
            throw new IllegalArgumentException("O número precisa ter 9 dígitos.");
        }
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean setCpf(String cpf) {
        if (cpf == null) {
            return false;
        }
        cpf = cpf.replaceAll("[^0-9]", "");
        if (cpf.length() != 11) {
            return false;
        }
        boolean todosIguais = true;
        for (int i = 1; i < cpf.length(); i++) {
            if (cpf.charAt(i) != cpf.charAt(0)) {
                todosIguais = false;
                break;
            }
        }
        if (todosIguais) {
            return false;
        }
        int soma = 0;
        int resto;
        for (int i = 1; i <= 9; i++) {
            soma += Integer.parseInt(cpf.substring(i - 1, i)) * (11 - i);
        }
        resto = (soma * 10) % 11;
        if (resto == 10 || resto == 11) {
            resto = 0;
        }
        if (resto != Integer.parseInt(cpf.substring(9, 10))) {
            return false;
        }
        soma = 0;
        for (int i = 1; i <= 10; i++) {
            soma += Integer.parseInt(cpf.substring(i - 1, i)) * (12 - i);
        }
        resto = (soma * 10) % 11;
        if (resto == 10 || resto == 11) {
            resto = 0;
        }
        if (resto != Integer.parseInt(cpf.substring(10, 11))) {
            return false;
        }
        this.cpf = cpf;
        return true;
    }
}
