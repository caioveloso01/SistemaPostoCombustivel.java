package postoCombustivel;

public class TestaPostoCombustivel {
    public static void main(String[] args) {
        // Criando uma instância do PostoCombustivel
        PostoCombustivel posto = new PostoCombustivel();

        // Exibe as informações das bombas
        System.out.println("-------------------");
        System.out.println("Informações das Bombas:");
        posto.exibirInformacoesBomba();
        System.out.println("-------------------");

        // Simulando um cliente abastecendo com 70 reais de gasolina na bomba 1
        BombaCombustivel bomba1 = posto.getBombas()[0]; // Acessa a primeira bomba
        bomba1.registrarAbastecimento(1, 200); // Tipo 1 é gasolina, e o 70 é o valor pago

        // Exibindo o último cliente que abasteceu
        System.out.println("Informações do último cliente que abasteceu na bomba 1:");
        bomba1.exibirUltimoCliente();

        // Simulando outro cliente abastecendo com 200 reais de diesel na bomba 2
        BombaCombustivel bomba2 = posto.getBombas()[1]; // Acessa a segunda bomba
        bomba2.registrarAbastecimento(2, 200); // Tipo 2 é diesel, 200 é o valor pago
        
        // Exibindo o último cliente que abasteceu
        System.out.println("Informações do último cliente que abasteceu na bomba 2:");
        bomba2.exibirUltimoCliente();
    }
}
