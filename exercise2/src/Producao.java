public class Producao {

        private int previsaoDemanda = 200;
        private int producaoNormal = 250;
        private int estoqueInicial = 50;


    public int getPrevisaoDemanda() {

        return previsaoDemanda;
    }

    public int getProducaoNormal() {
        return producaoNormal;
    }

    public int getEstoqueInicial() {
        return estoqueInicial;
    }
    public static int estoqueFinal (int estoqueInicial, int producaoNormal, int previsaoDemanda){
        return (estoqueInicial + producaoNormal) - previsaoDemanda;
    }


}


