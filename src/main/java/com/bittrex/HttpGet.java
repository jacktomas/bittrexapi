package com.bittrex;

import com.bittrex.responsebody.CurrentInfo;
import com.bittrex.responsebody.GetCurrencies;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by root on 17-5-16.
 */
public class HttpGet {
    public static void main(String[] args) {
        CloseableHttpClient build = HttpClientBuilder.create().build();

        HttpPost httpPost = new HttpPost("https://bittrex.com/api/v1.1/public/getcurrencies");

        try {
            StringEntity stringEntity = new StringEntity("");

            httpPost.addHeader("content-type","application/x-www-form-urlencoded");

            httpPost.setEntity(stringEntity);

            CloseableHttpResponse httpResponse = build.execute(httpPost);

            HttpEntity entity = httpResponse.getEntity();

            String responseStr = EntityUtils.toString(entity);

            ObjectMapper mapper = new ObjectMapper();

            GetCurrencies getCurrencies = mapper.readValue(responseStr, GetCurrencies.class);

            List<CurrentInfo> result = getCurrencies.getResult();
            result.stream().forEach(row ->{
                System.out.println(row);
            });

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
