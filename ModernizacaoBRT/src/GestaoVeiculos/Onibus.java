package GestaoVeiculos;

public class Onibus {
    private String placa;
    private String modelo;
    private int capacidadeSentados;
    private int capacidadeEmPe;
    private int qtdSentados;
    private int qtdEmPe;

    public Onibus() {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadeSentados = capacidadeSentados;
        this.capacidadeEmPe = capacidadeEmPe;
        this.qtdSentados = qtdSentados;
        this.qtdEmPe = qtdEmPe;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.isBlank()){
            throw new IllegalArgumentException("A placa deve ser digitada.");
        }
        if (placa.length() != 7 ){
            throw new IllegalArgumentException("A placa deve ter 7 dígitos.");
        }
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()){
            throw new IllegalArgumentException("O modelo deve ser digitado.");
        }
        this.modelo = modelo;
    }

    public void setCapacidadeSentados(int capacidadeSentados) {
        if (capacidadeSentados <= 0){
            throw new IllegalArgumentException("A quantidade de passageiros sentados deve ser maior que 0!");
        }
        this.capacidadeSentados = capacidadeSentados;
    }

    public void setCapacidadeEmPe(int capacidadeEmPe) {
        if (capacidadeEmPe <= 0){
            throw new IllegalArgumentException("A quantidade de passageiros em pé deve ser maior que 0!");
        }
        this.capacidadeEmPe = capacidadeEmPe;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadeSentados() {
        return capacidadeSentados;
    }

    public int getCapacidadeEmPe() {
        return capacidadeEmPe;
    }

    public int getQtdSentados() {
        return qtdSentados;
    }

    public int getQtdEmPe() {
        return qtdEmPe;
    }

    public boolean embarcarPassageiro(Boolean sentado){
        if ((qtdSentados + qtdEmPe) == (capacidadeSentados + capacidadeEmPe) ){
            System.out.println("Erro! A capacidade máxima foi atingida!");
            return false;
        }
        if (true){
            if (qtdSentados == capacidadeSentados){
                throw new IllegalArgumentException("Nao há quantidade de cadeiras disponíveis.");
            } else if (qtdSentados < capacidadeSentados) {
                System.out.println("Passageiro ocupando cadeira.");
            }
        }
        if (false){
            if (qtdEmPe == capacidadeEmPe){
                throw new IllegalArgumentException("Não há espaço suficiente.");
            } else if (qtdEmPe < capacidadeEmPe) {
                System.out.println("Passageiro entrando");
            }
        }
        return true;
    }

    public void desembarcarPassageiros(int saindo){
        System.out.println("Desembarcando...");
        int capacidadeAtual = (qtdSentados + qtdEmPe) - saindo;
        System.out.println("Capacidade atual: " + capacidadeAtual);
    }

    public void informacoesOnibus() {
        System.out.println("Informacoes onibus");
        System.out.println();
        System.out.println("Modelo: " + getModelo());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Capacidade em pe: " + getCapacidadeEmPe());
        System.out.println("Capacidade de sentados: " + getCapacidadeSentados());

    }
}
