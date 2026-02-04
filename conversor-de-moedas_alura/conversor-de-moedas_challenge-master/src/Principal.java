import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaMoeda consulta = new ConsultaMoeda();
        int opcao ;
        String continuar = "s";

        while (continuar.equalsIgnoreCase("S")) {
            System.out.println("************************************************");
            System.out.println("Seja bem-vindo(a) ao Conversor de Moeda! \n");
            System.out.println("1) Real Brasileiro (BRL) =>> Dólar (USD)");
            System.out.println("2) Dólar (USD) =>> Real Brasileiro (BRL)");
            System.out.println("3) Real Brasileiro (BRL) =>> Euro (EUR)");
            System.out.println("4) Euro (EUR) =>> Real Brasileiro (BRL)");
            System.out.println("5) Real Brasileiro (BRL) =>> Rublo (RUB)");
            System.out.println("6) Rublo (RUB) =>> Real Brasileiro (BRL)");
            System.out.println("7) Historico de conversões");
            System.out.println("8) Sair");
            System.out.println("************************************************");

            opcao = leitura.nextInt();

            if (opcao == 8) {
                System.out.println("Finalizando o programa...");
                break;
            }

            if (opcao < 1 || opcao > 8) {
                System.out.println("Opção inválida! Tente novamente.");
                continue;
            }
            if (opcao == 7) {
                HistoricoConversoes.exibir();
                break;
            }

            System.out.println("Digite o valor que deseja converter:");
            double valorParaConverter = leitura.nextDouble();

            try {
                switch (opcao) {
                    case 1 -> exibirConversao("BRL", "USD", valorParaConverter, consulta);
                    case 2 -> exibirConversao("USD", "BRL", valorParaConverter, consulta);
                    case 3 -> exibirConversao("BRL", "EUR", valorParaConverter, consulta);
                    case 4 -> exibirConversao("EUR", "BRL", valorParaConverter, consulta);
                    case 5 -> exibirConversao("BRL", "RUB", valorParaConverter, consulta);
                    case 6 -> exibirConversao("RUB", "BRL", valorParaConverter, consulta);
                    case 7 -> HistoricoConversoes.exibir();
                }
            } catch (Exception e) {
                System.out.println("Erro ao processar conversão: " + e.getMessage());
            }
            System.out.println("Deseja fazer outra conversão? (S/N)"); continuar = leitura.next();
        }
        leitura.close();
    }

    public static void exibirConversao(String base, String destino, double valor, ConsultaMoeda consulta) {

        String json = consulta.buscaMoeda(base);
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();


        JsonObject taxas = jsonObject.get("conversion_rates").getAsJsonObject();
        double taxa = taxas.get(destino).getAsDouble();


        double resultado = valor * taxa;

        System.out.println("O valor " + valor + " [" + base + "] equivale a: =>>> "
                + resultado + " [" + destino + "]\n");

        RegistroLog.registrar(base, destino, valor, resultado);
    }

}
