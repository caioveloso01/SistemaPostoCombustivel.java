package postoCombustivel;

// Importando do pacote java.text o formato Decimal
import java.text.DecimalFormat;

public class BombaCombustivel {
    private Combustivel tipo1; // Representa os tipos de combustível em cada bomba
    private Combustivel tipo2; 
    private Cliente ultimoCliente; // Armazena as informações do último cliente que abasteceu

    // Getters e Setters para os combustíveis
    public Combustivel getTipo1() {
        return tipo1;
    }

    public void setTipo1(Combustivel tipo1) {
        this.tipo1 = tipo1;
    }

    public Combustivel getTipo2() {
        return tipo2;
    }

    public void setTipo2(Combustivel tipo2) {
        this.tipo2 = tipo2;
    }

    // Método para registrar o abastecimento de um cliente
    public void registrarAbastecimento(int tipoCombustivel, double valorPago) {
        Combustivel combustivel = tipoCombustivel == 1 ? tipo1 : tipo2;
        double litrosAbastecidos = valorPago / combustivel.getPrecoLitro();

        // Atualiza a quantidade disponível de combustível após o abastecimento
        if (combustivel.getQuantidadeAtual() >= litrosAbastecidos) {
            combustivel.setQuantidadeAtual(combustivel.getQuantidadeAtual() - litrosAbastecidos);

            // Atualiza o último cliente que abasteceu
            ultimoCliente = new Cliente(combustivel.getNome(), valorPago, litrosAbastecidos);
        } else {
            System.out.println("Não há combustível suficiente para completar o abastecimento.");
        }
    }

    // Exibe informações sobre o último cliente que abasteceu
    public void exibirUltimoCliente() {
        if (ultimoCliente != null) {
            System.out.println("-------------------");
            System.out.println("Último cliente:");
            System.out.println("-------------------");
            ultimoCliente.exibirInformacoesCliente();
        } else {
            System.out.println("Nenhum cliente abasteceu nesta bomba ainda.");
        }
    }

    // Método para exibir informações das duas opções de combustível
    public void exibirInformacoes() {
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("-------------------");
        System.out.println("Tipo de combustível 1: " + tipo1.getNome());
        System.out.println("Quantidade disponível: " + tipo1.getQuantidadeAtual() + " litros");
        System.out.println("Preço por litro: R$" + df.format(tipo1.getPrecoLitro()));
        System.out.println("-------------------");

        System.out.println("Tipo de combustível 2: " + tipo2.getNome());
        System.out.println("Quantidade disponível: " + tipo2.getQuantidadeAtual() + " litros");
        System.out.println("Preço por litro: R$" + df.format(tipo2.getPrecoLitro()));
        System.out.println("-------------------");
    }
}
