package mediator.SmartHouseController.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@SuppressWarnings("Duplicates")
public class WebService {
    private static final String TARGET_URL = "https://weather.com/ru-RU/weather/today/l/96f2f84af9a5f5d452eb0574d4e4d8a840c71b05e22264ebdc0056433a642c84";

    private HttpURLConnection connection;

    public WebService() throws IOException {
        URL url = new URL(TARGET_URL);
        this.connection = (HttpURLConnection) url.openConnection();
        this.connection.setRequestMethod("GET");
        this.connection.setDoOutput(true);
    }

    public int getForecastDaytimeTemperature() throws IOException {
        InputStream is = connection.getInputStream();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
        StringBuffer response = new StringBuffer();
        String line;
        while ((line = rd.readLine()) != null) {
            if(line.contains("<div data-testid=\"wxData\" class=\"WeatherDetailsListItem--wxData--2bzvn\"><span data-testid=\"TemperatureValue\">")) {
                String temperature = line.substring(line.indexOf("<span data-testid=\"TemperatureValue\">",
                        line.indexOf("°</span>")));
                response.append(temperature);
                response.append('\r');
            }
        }
        String r = response.toString();
        rd.close();
        is.close();
        return Integer.valueOf(r.substring(r.indexOf(">") + 1, r.indexOf("°")));
    }

    public int getForecastNighttimeTemperature() throws IOException {
        InputStream is = connection.getInputStream();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
        StringBuffer response = new StringBuffer();
        String line;
        while ((line = rd.readLine()) != null) {
            if(line.contains("<div data-testid=\"wxData\" class=\"WeatherDetailsListItem--wxData--2bzvn\"><span data-testid=\"TemperatureValue\">")) {
                String temperature = line.substring(line.indexOf("<span data-testid=\"TemperatureValue\">",
                        line.indexOf("°</span>")));
                response.append(temperature);
                response.append('\r');
            }
        }
        String r = response.toString();
        rd.close();
        is.close();
        String subMinTempString = r.substring(r.indexOf("/<span data-testid=\"TemperatureValue\">"));
        return Integer.valueOf(subMinTempString.substring(subMinTempString.indexOf(">") + 1, subMinTempString.indexOf("°")));
    }
}
