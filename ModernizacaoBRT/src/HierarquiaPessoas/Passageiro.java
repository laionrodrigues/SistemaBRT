package HierarquiaPessoas;

public class Passageiro extends Pessoa{
    private String codigoCartao;
    private double saldo;
    private String categoria;
    private double tarifa = 5;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigoCartao() {
        return codigoCartao;
    }

    public void setCodigoCartao(String codigoCartao) {
        if (codigoCartao.length() != 10){
            throw new IllegalArgumentException("O número de dígitos precisa ser igual a 10");
        }
        this.codigoCartao = codigoCartao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0){
            throw new IllegalArgumentException("O saldo não pode ser negativo!");
        }
        this.saldo = saldo;
    }

    public double calcularValorTarifa() {
        double tarifaBase = 5;
        if (getCategoria().equalsIgnoreCase("comum")) {
            return tarifaBase;
        } else if (getCategoria().equalsIgnoreCase("estudante")) {
            return tarifaBase * 0.5;
        } else if (getCategoria().equalsIgnoreCase("idoso")) {
            return 0;
        } else {
            throw new IllegalArgumentException("Categoria inválida!");
        }
    }

    public void debitarTarifa() {

        double tarifaBase = 5;
        double valorTarifa = calcularValorTarifa();
        if (saldo >= valorTarifa) {
            saldo -= valorTarifa;
            System.out.println("Tarifa debitada com sucesso!");
            System.out.println("Valor debitado: R$ " + valorTarifa);
            System.out.println("Saldo restante: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Informações passageiro: ");
        System.out.println();
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Saldo do passageiro: R$" + getSaldo());
        System.out.println("Categoria: " + getCategoria());
    }
}
