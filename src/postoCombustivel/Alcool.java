package postoCombustivel;

// Aqui estou utilizando o extends para puxar as classes de Combustivel
public class Alcool extends Combustivel {
  
    
    //Personalizando o metodo que já consta em Combustivel
    @Override
    public void exibirInformacoes() {
        System.out.println("Informacoes de Alcool:");
        super.exibirInformacoes();// Chama o método da classe pai (Combustivel)
    }
}