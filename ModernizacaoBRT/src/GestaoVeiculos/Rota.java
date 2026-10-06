package GestaoVeiculos;

import java.util.ArrayList;

public class Rota {
    private int codigoLinha;
    private String nomeLinha;
    private ArrayList<Terminal> terminais;

    public Rota() {
        this.terminais = new ArrayList<>();
    }

    public void adicionarTerminal(Terminal terminal){
        terminais.add(terminal);
        System.out.println("Terminal adicionado com sucesso!");
    }

    public void removerTerminal(int idTerminal){
        for (int i = 0; i < terminais.size(); i++){
            if (terminais.get(i).getIdTerminal() == idTerminal){
                terminais.remove(i);
                System.out.println("Terminal removido!");
                return;
            }
        }

        System.out.println("Terminal não encontrado.");
    }

    public void imprimirItinerario(){
        System.out.println("Linha: " + nomeLinha);
        System.out.println("Código: " + codigoLinha);
        System.out.println("Itinerário: ");
        for (int i = 0; i < terminais.size(); i++){
            System.out.println((i + 1) + "º - " + terminais.get(i));
        }
    }

    public int getCodigoLinha() {
        return codigoLinha;
    }

    public void setCodigoLinha(int codigoLinha) {
        if (codigoLinha <= 0){
            throw new IllegalArgumentException("Linha invalida! Tente novamente!");
        }
        this.codigoLinha = codigoLinha;
    }

    public String getNomeLinha() {
        return nomeLinha;
    }

    public void setNomeLinha(String nomeLinha) {
        if (nomeLinha == null || nomeLinha.isBlank()){
            throw new IllegalArgumentException("O nome da linha deve ser digitada!");
        }
        this.nomeLinha = nomeLinha;
    }
}
