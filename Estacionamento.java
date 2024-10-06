public class Estacionamento {
    private String nome;
    private String endereco;
    private String proprietario;
    private int algo;
    
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getProprietario() {
        return proprietario;
    }
    public int getAlgo() {
        return algo;
    }
    public void setAlgo(int algo) {
        this.algo = algo;
    }
    public Estacionamento(String nome, String endereco, String proprietario) {
        this.nome = nome;
        this.endereco = endereco;
        this.proprietario = proprietario;
    }

    Veiculo[] estacionados = new Veiculo[50];
    private int capacidadeMaxima = 50;
    
    public void cadastrarVeiculo(String placa, String modelo, double entradaEmHoras){
        for(int i = 0; i < estacionados.length; i++){
            if (estacionados[i] == null) {
                estacionados[i] = new Veiculo(placa, modelo, entradaEmHoras);
                System.out.println("Veículo estacionado!");
                break;
            }
        }
    }
    private void reorganizarVeiculos() {
        for (int i = 0; i < estacionados.length - 1; i++) {
            if (estacionados[i] == null && estacionados[i + 1] != null) {
                estacionados[i] = estacionados[i + 1];
                estacionados[i + 1] = null;
            }
        }
    }
    public void retirarVeiculo(String placa, double saidaEmHoras){
        boolean achou = false;
        for(int i = 0; i < capacidadeMaxima; i++){
            if (estacionados[i].getPlacaDoVeiculo().equalsIgnoreCase(placa)) {
                achou = true;
                estacionados[i].setHoraDeSaida(saidaEmHoras);
                System.out.println("Valor a se pagar: $"+estacionados[i].valor());
                estacionados[i] = null;
                reorganizarVeiculos();
                break;
            }
        }
        if (achou == false) {
            System.out.println("Veículo não encontrado!");
        }
    }
    public void listaDeVeiculos(){
        int contador = 0;
        for(int i = 0; i < capacidadeMaxima; i++){
            if (estacionados[i] != null) {
                System.out.println(estacionados[i].toString());;
                contador++;
            }
        }
        System.out.println("Vagas: "+(50-contador)+"/50");
    }
    
}
