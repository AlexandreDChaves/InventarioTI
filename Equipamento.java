package InventarioTI;

public class Equipamento {
    private String nome;
    private String tipo;
    private String numeroSerie;
    private String status;

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Numero de Série: " + numeroSerie);
        System.out.println("Status: " + status);
    }
}
