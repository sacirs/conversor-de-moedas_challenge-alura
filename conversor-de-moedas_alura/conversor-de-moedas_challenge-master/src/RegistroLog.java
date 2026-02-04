import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroLog {

    private static final String NOME_ARQUIVO = "conversoes.log";

    public static void registrar(String base, String destino, double valor, double resultado) {
        try {
            // Data e hora formatada
            LocalDateTime agora = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String dataHora = agora.format(formatter);

            // Linha de log
            String log = dataHora + " | " + valor + " [" + base + "] => " + resultado + " [" + destino + "]\n";

            // Grava no arquivo
            FileWriter writer = new FileWriter(NOME_ARQUIVO, true);
            writer.write(log);
            writer.close();

        } catch (IOException e) {
            System.out.println("Erro ao gravar log: " + e.getMessage());
        }
    }
}
