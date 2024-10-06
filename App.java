import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Estacionamento lugar = new Estacionamento("Gimarans", "WE alguma coisa", "Carlinhos");
        Scanner sc = new Scanner(System.in);
        while (lugar.getAlgo() != 745674984) {
            System.out.println("Estacionamento "+lugar.getNome()+"!!!\n\n[1]Cadastrar Veículo\n[2]Retirar Veículo\n[3]Lista de Veículos estacionados\n\nEscolha:");
            String x = sc.nextLine().trim();
            if(x.equals("1")){
                System.out.println("Placa do carro:");
                String placa = sc.nextLine();
                System.out.println("Modelo do carro:");
                String modelo = sc.nextLine();
                System.out.println("Horario da entrada(Apenas em horas):");
                double horas = sc.nextDouble();
                sc.nextLine();
                lugar.cadastrarVeiculo(placa, modelo, horas);
            }else if(x.equals("2")){
                System.out.println("Placa do carro:");
                String placa = sc.nextLine();
                System.out.println("Horario da saida(Apenas em horas):");
                double horas = sc.nextDouble();
                sc.nextLine();
                lugar.retirarVeiculo(placa, horas);
            }else if(x.equals("3")){
                lugar.listaDeVeiculos();
            }else {
                System.out.println("Invalido!");
                break;
            }
            
            

        }
    }
}
