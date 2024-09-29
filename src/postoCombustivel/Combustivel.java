package postoCombustivel;

// Começamos adicionando as classes que vão ser herdadas em todos os combustiveis
public class Combustivel {
    private String Nome; //Nome do combustivel 
    private double quantidadeAtual; // A quantidade que tem do combustivel na bomba
    private double precoLitro; // Valor do litro do combustivel
    
    //Getter e setters 
    // Obtendo o nome do combustivel com o Getter
    public String getNome() {
        return Nome;
    }
    //Definindo o nome do combustivel com o Setter
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(double quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    public double getPrecoLitro() {
        return precoLitro;
    }

    public void setPrecoLitro(double precoLitro) {
        this.precoLitro = precoLitro;
    }
    
    // Método para exibir as informações do combustível (nome, quantidade e preço por litro)
    public void exibirInformacoes() {
        System.out.println("Nome: " + Nome);
        System.out.println("Preço por litro: " + precoLitro);
        System.out.println("Quantidade disponível: " + quantidadeAtual);
    }
}
    