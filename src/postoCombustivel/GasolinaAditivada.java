package postoCombustivel;

public class GasolinaAditivada extends Combustivel {
    private final double precoGasolinaComum;

    // Construtor que recebe um objeto de Gasolina Comum
    public GasolinaAditivada(Gasolina gasolinaComum) {
        super();
        // Armazena o preço da gasolina comum para uso posterior
        this.precoGasolinaComum = gasolinaComum.getPrecoLitro();
        // Calcula o aumento de 8% sobre o preço da gasolina comum
        double aumento = precoGasolinaComum * (8 / 100.0); // 8% de aumento
        // Define o preço da gasolina aditivada
        setPrecoLitro(precoGasolinaComum + aumento); // Adiciona o aumento ao preço base
    }

    // Personalizando o método que já consta em Combustível
    @Override
    public void exibirInformacoes() {
        System.out.println("Informações de Gasolina Aditivada:");
        super.exibirInformacoes(); // Chama o método da classe mãe (Combustível)
    }
}
