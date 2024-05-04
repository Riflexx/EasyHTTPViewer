import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Viewer {
    public static List<String> getLinesFromUrl(String stringUrl) {
        List<String> lines = new ArrayList<>();
        try {
            URL url = new URL(stringUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }
    public static boolean containsValueInUrl(String stringUrl, String value) {
        List<String> lines = new ArrayList<>();
        try {
            URL url = new URL(stringUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines.contains(value);
    }
}
