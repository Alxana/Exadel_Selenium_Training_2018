import http_client.MyHttpClientUtils;
import http_client.HttpClient_Interface;


public class HttpURLConnection_Example {
    public static void main(String[] args) throws Exception{

        MyHttpClientUtils switcher = new MyHttpClientUtils();
        HttpClient_Interface httpClient = switcher.ChooseClient();

        // GET
        String getUrl = "http://httpbin.org/get";
        String getResponse = httpClient.sendGet(getUrl);
        System.out.println(getResponse);

        //POST
        String postUrl = "http://httpbin.org/post";
        String contentType = "application/json";
        String userAgent = "Mozilla/5.0";
        String bodyPost = "hi there, I'm POST request";

        String postResponse = httpClient.sendPost(postUrl, bodyPost, contentType, userAgent);
        System.out.println(postResponse);

        //PUT
        String putUrl = "http://httpbin.org/put";
        String bodyPut = "hi there, I'm PUT request";

        String putResponse = httpClient.sendPut(putUrl, bodyPut);
        System.out.println(putResponse);
    }

}
