package GestaoVeiculos;

public class Terminal {
    private int idTerminal;
    private String nomeTerminal;
    private String localizacao;

    public Terminal() {
        this.idTerminal = idTerminal;
        this.nomeTerminal = nomeTerminal;
        this.localizacao = localizacao;
    }

    public int getIdTerminal() {
        return idTerminal;
    }

    public void setIdTerminal(int idTerminal) {
        if (idTerminal <= 0) {
            throw new IllegalArgumentException("Erro! Digite novamente.");
        }
        this.idTerminal = idTerminal;
    }

    public String getNomeTerminal() {
        return nomeTerminal;
    }

    public void setNomeTerminal(String nomeTerminal) {
        if (nomeTerminal == null || nomeTerminal.isBlank()){
            throw new IllegalArgumentException("O nome preciso ser digitado!");
        }
        if (nomeTerminal.length() < 3){
            throw new IllegalArgumentException("O nome precisa ser maior ou igual que 3 caracteres.");
        }
        this.nomeTerminal = nomeTerminal;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        if (localizacao == null || localizacao.isBlank()){
            throw new IllegalArgumentException("A localização deve ser digitada.");
        }
        this.localizacao = localizacao;
    }


    public void informacoesTerminal() {
        System.out.println("Informacoes terminal:");
        System.out.println("ID: " + getIdTerminal());
        System.out.println("Nome: " + getNomeTerminal());
        System.out.println("Localizacao: " + getLocalizacao());
    }
}
