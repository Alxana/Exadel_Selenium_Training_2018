package http_client;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.http.entity.StringEntity;

public class ApacheHttpClient implements HttpClient_Interface {
    @Override
    public String sendGet(String url) throws IOException {
       // HttpClient client = HttpClientBuilder.create().build();

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = httpclient.execute(httpGet);

        System.out.println("------ GET ------");
        System.out.println(response.getStatusLine());
        HttpEntity entity = response.getEntity();
        String responseString = EntityUtils.toString(entity, "UTF-8");
        EntityUtils.consume(entity);
        response.close();

        return responseString;
    }

    @Override
    public String sendPost(String url, String data, String contentType, String userAgent) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);

        httpPost.setHeader("Content-Type", contentType);
        httpPost.setHeader("User-Agent", userAgent);
        httpPost.setEntity(new StringEntity(data));

        CloseableHttpResponse response = httpclient.execute(httpPost);

        System.out.println("------ POST ------");
        System.out.println(response.getStatusLine());
        HttpEntity entity = response.getEntity();

        String responseString = EntityUtils.toString(entity, "UTF-8");
        EntityUtils.consume(entity);
        response.close();

        return responseString;
    }

    @Override
    public String sendPut(String url, String body) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPut httpPut = new HttpPut(url);
        httpPut.setEntity(new StringEntity(body));

        CloseableHttpResponse response = httpclient.execute(httpPut);

        System.out.println("------ PUT ------");
        System.out.println(response.getStatusLine());
        HttpEntity entity = response.getEntity();

        String responseString = EntityUtils.toString(entity, "UTF-8");
        EntityUtils.consume(entity);
        response.close();

        return responseString;
    }
}
