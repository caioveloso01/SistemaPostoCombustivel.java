package postoCombustivel;

import java.text.DecimalFormat;

public class Cliente {
    private String nomeCombustivel;
    private double valorPago;
    private double litrosAbastecidos;

    // Construtor para inicializar os atributos do cliente
    public Cliente(String nomeCombustivel, double valorPago, double litrosAbastecidos) {
        this.nomeCombustivel = nomeCombustivel;
        this.valorPago = valorPago;
        this.litrosAbastecidos = litrosAbastecidos;
    }

    // Getters e Setters
    public String getNomeCombustivel() {
        return nomeCombustivel;
    }

    public void setNomeCombustivel(String nomeCombustivel) {
        this.nomeCombustivel = nomeCombustivel;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getLitrosAbastecidos() {
        return litrosAbastecidos;
    }

    public void setLitrosAbastecidos(double litrosAbastecidos) {
        this.litrosAbastecidos = litrosAbastecidos;
    }

    // Método para exibir as informações do último cliente
    public void exibirInformacoesCliente() {
        DecimalFormat df = new DecimalFormat("#.000"); // Formato para 3 casas decimais
        
        System.out.println("-------------------");        
        System.out.println("Combustível: " + nomeCombustivel);
        System.out.println("Valor pago: R$ " + valorPago);
        System.out.println("Litros abastecidos: " + df.format(litrosAbastecidos) + " L");
        System.out.println("-------------------");
        
    }
}
