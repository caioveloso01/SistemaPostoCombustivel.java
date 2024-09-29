package postoCombustivel;

// Aqui estou utilizando o extends para puxar as classes de Combustivel
public class Diesel extends Combustivel {

    
     //Personalizando o metodo que já consta em Combustivel
    @Override
    public void exibirInformacoes() {
        System.out.println("Informações de Diesel:");
        super.exibirInformacoes();// Chama o método da classe pai (Combustivel)
    }
}