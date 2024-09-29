package postoCombustivel;

public class PostoCombustivel {
    private final BombaCombustivel[] bomba;

    public PostoCombustivel() {
        bomba = new BombaCombustivel[2]; // Definindo o array para duas bombas

        // Criando combustíveis e definindo valores
        Gasolina gasolinaComum = new Gasolina();
        gasolinaComum.setNome("Gasolina Comum");
        gasolinaComum.setPrecoLitro(5.89);
        gasolinaComum.setQuantidadeAtual(1000);

        Alcool alcool = new Alcool();
        alcool.setNome("Álcool");
        alcool.setPrecoLitro(4.79);
        alcool.setQuantidadeAtual(3000);

        Diesel diesel = new Diesel();
        diesel.setNome("Diesel");
        diesel.setPrecoLitro(4.89);
        diesel.setQuantidadeAtual(6000);

        GasolinaAditivada gasolinaAditivada = new GasolinaAditivada(gasolinaComum);
        gasolinaAditivada.setNome("Gasolina Aditivada");
        gasolinaAditivada.setQuantidadeAtual(4000);

        // Configurando as bombas
        bomba[0] = new BombaCombustivel();
        bomba[0].setTipo1(gasolinaComum);
        bomba[0].setTipo2(alcool);

        bomba[1] = new BombaCombustivel();
        bomba[1].setTipo1(gasolinaAditivada);
        bomba[1].setTipo2(diesel);
    }

    public void exibirInformacoesBomba() {
        for (int i = 0; i < bomba.length; i++) {
            System.out.println((i + 1) + "Bomba " + ":");
            bomba[i].exibirInformacoes();
            System.out.println("------------------");
        }
    }
    // Método para acessar o array de bombas
    public BombaCombustivel[] getBombas() {
        return bomba;
}
}
