package http_client;

import java.io.IOException;

public interface HttpClient_Interface {

   String sendGet(String url) throws IOException;
   String sendPost(String url, String body, String contentType, String userAgent) throws IOException;
   String sendPut(String url, String body) throws IOException;

}
