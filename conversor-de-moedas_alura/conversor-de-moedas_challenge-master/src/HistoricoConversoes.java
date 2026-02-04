import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HistoricoConversoes {

    private static final String NOME_ARQUIVO = "conversoes.log";

    public static void exibir() {
        System.out.println("\n===== Histórico de Conversões =====");
        try (BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Nenhum histórico encontrado ou erro ao ler o arquivo.");
        }
        System.out.println("===================================\n");
    }
}
