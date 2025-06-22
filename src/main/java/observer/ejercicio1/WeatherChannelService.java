package observer.ejercicio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class WeatherChannelService implements ClimaOnline {
    private String temperatura;
    private static final String API_KEY = "68edd6308c1ff9e62d3c8df9c333ba34";
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";
    private static final String CITY_COUNTRY = "Viedma,AR";
    private static final String UNITS = "metric";

    @Override
    public String temperatura() {
        try {
            String urlString = String.format("%s?q=%s&units=%s&APPID=%s", BASE_URL, CITY_COUNTRY, UNITS, API_KEY);
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            conn.disconnect();

            JSONObject jsonResponse = new JSONObject(content.toString());
            JSONObject main = jsonResponse.getJSONObject("main");
            double temperature = main.getDouble("temp");
            this.temperatura = String.valueOf(temperature);
            return temperatura + " c";

        } catch (Exception e) {
            e.printStackTrace();
            return "Error al leer temperatura";
        }
    }
}