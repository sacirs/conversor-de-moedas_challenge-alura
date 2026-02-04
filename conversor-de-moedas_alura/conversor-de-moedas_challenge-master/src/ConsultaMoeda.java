import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {
    public String buscaMoeda(String moedaBase) {

        String chave = "b2286d9461cb504ba19389a5";
                ;
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/" + chave + "/latest/" + moedaBase);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar a API.");
        }
    }
}


