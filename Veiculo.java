public class Veiculo {
    private String placaDoVeiculo;
    private String modeloDoVeiculo;
    private double horaDeEntrada;
    private double horaDeSaida;
    
    public Veiculo(String placaDoVeiculo, String modeloDoVeiculo, double horaDeEntrada) {
        this.placaDoVeiculo = placaDoVeiculo;
        this.modeloDoVeiculo = modeloDoVeiculo;
        this.horaDeEntrada = horaDeEntrada;
        this.horaDeSaida = 0;
    }
    public String getPlacaDoVeiculo() {
        return placaDoVeiculo;
    }
    public void setPlacaDoVeiculo(String placaDoVeiculo) {
        this.placaDoVeiculo = placaDoVeiculo;
    }
    public String getModeloDoVeiculo() {
        return modeloDoVeiculo;
    }
    public void setModeloDoVeiculo(String modeloDoVeiculo) {
        this.modeloDoVeiculo = modeloDoVeiculo;
    }
    public double getHoraDeEntrada() {
        return horaDeEntrada;
    }
    public void setHoraDeEntrada(double horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }
    public double getHoraDeSaida() {
        return horaDeSaida;
    }
    public void setHoraDeSaida(double horaDeSaida) {
        this.horaDeSaida = horaDeSaida;
    }

    @Override
    public String toString() {
        return "Placa: " + placaDoVeiculo + ", Modelo: " + modeloDoVeiculo + ", Hora da entrada: "
                + horaDeEntrada + "\n";
    }
    public double valor(){
        if (horaDeSaida == 0) {
            return 0;
        } else if (this.horaDeEntrada-this.horaDeSaida < 0) {
            return (this.horaDeEntrada-this.horaDeSaida)*-3;
        }else{
            return (24-(this.horaDeEntrada-this.horaDeSaida))*3;
        }
    }
    
}
