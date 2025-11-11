package modelo;

public class Modelo {

    private String  placaVeiculo;
    private String modelo;
    private int anoVeiculo;
    private String  fabricanteVeiculo;
    private String corVeiculo;

    public Modelo(String  placaVeiculo, String modelo, int anoVeiculo, String fabricanteVeiculo, String corVeiculo) {
        this.placaVeiculo = placaVeiculo;
        this.modelo = modelo;
        this.anoVeiculo = anoVeiculo;
        this.fabricanteVeiculo = fabricanteVeiculo;
        this.corVeiculo = corVeiculo;
    }

    @Override
    public String toString() {
        return "===Modelo do Carro===" + "\n"+
                " Placa do Veiculo: " + placaVeiculo +"\n"+
                " Modelo: " + modelo + "\n" +
                " Ano do Veiculo: " + anoVeiculo + "\n"+
                " Fabricante do Veiculo: " + fabricanteVeiculo + "\n" +
                " Cor Veiculo: " + corVeiculo ;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(int anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    public String getFabricanteVeiculo() {
        return fabricanteVeiculo;
    }

    public void setFabricanteVeiculo(String fabricanteVeiculo) {
        this.fabricanteVeiculo = fabricanteVeiculo;
    }

    public String getCorVeiculo() {
        return corVeiculo;
    }

    public void setCorVeiculo(String corVeiculo) {
        this.corVeiculo = corVeiculo;
    }
}
