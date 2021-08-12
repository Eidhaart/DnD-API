import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException, InterruptedException, NullPointerException {
        CharRaces response = callApi();
        System.out.println(response.getName());
        System.out.println(response.getAge());
        System.out.println(response.getAbility_bonuses()); //print out some standard info

    }

    private static CharRaces callApi() throws IOException, InterruptedException {

        System.out.println("What race do you choose?");
        String index = scanner.nextLine().toLowerCase();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.dnd5eapi.co/api/races/" + index)) //Only race data as for now.
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        int responseCode = response.statusCode();
        String body = response.body();
        ObjectMapper objectMapper = new ObjectMapper();
        CharRaces charRaces = objectMapper.readValue(body, CharRaces.class);

        System.out.printf("Response code: %d%n", responseCode);
        if (responseCode == 404) {
            System.out.println("Not Found");
        }
        return charRaces;
    }
}

