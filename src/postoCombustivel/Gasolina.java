package postoCombustivel;

// Aqui estou utilizando o extends para puxar as classes de Combustivel
public class Gasolina extends Combustivel {
    
    
     //Personalizando o metodo que já consta em Combustivel
    @Override
    public void exibirInformacoes() {
        System.out.println("Informacoes de Gasolina:");
        super.exibirInformacoes(); // Chama o método da classe pai (Combustivel)
    }
}