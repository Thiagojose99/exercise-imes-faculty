//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Producao p = new Producao();
    int estoqueInicial = p.getEstoqueInicial();
    int previsaoDemanda = p.getPrevisaoDemanda();
    int producaoNormal = p.getProducaoNormal();
    int estoqueFinal = p.estoqueFinal(estoqueInicial, producaoNormal, previsaoDemanda);

        System.out.println( "O estoque final previsto para o mês é de: " + estoqueFinal + " Unidades");
    }
}