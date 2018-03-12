package http_client;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyHttpClientUtils {

    public HttpClient_Interface ChooseClient() throws IOException {
        Properties prop;
        InputStream isPP = getClass().getClassLoader().getResourceAsStream("httpClientProperties");
        prop = new Properties();
        prop.load(isPP);
        String client = prop.getProperty("httpClientCurrent");


        if (client.equals("ApacheHttpClient")){
            System.out.println("------ ApacheHttpClient is used -------");
            return new ApacheHttpClient();
        }
        else {
            System.out.println("------ HttpUrlConnection is used -------");
            return new HttpURLConnectionClient();
        }
    }
}
