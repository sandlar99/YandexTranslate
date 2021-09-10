package ru.testing.gateway;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import ru.testing.entities.RequestTranslate;
import ru.testing.entities.ResponseTranslate;

@Slf4j
public class YandexTranslateGateway {
    private static final String URL = "https://translate.api.cloud.yandex.net/translate/v2/translate";
    //Срок годности token истечет 10.09.2021 00:00
    private static final String TOKEN = "t1.9euelZqdzJWbmpzPlciMmY2MlMqPjO3rnpWajcmexp2Ki5WbmZfJmJaamMfl8_duNBR2-e8sNFdn_t3z9y5jEXb57yw0V2f-.tr6FedPqtcVt9_M9nhweBXTIATwbXXH8v8RRxfuTSLI1RnNE4LVHIvyVuNjmJjCMkqgCKpjx170YuY_5zMgaBA";
    private static final String FOLDERID = "b1gq90jkvjv404p0gd7t";
    @SneakyThrows
    public ResponseTranslate getTranslate(String[] str, String language) {
        Gson gson = new Gson();
        RequestTranslate requestBody = new RequestTranslate();
        requestBody.folderId = FOLDERID;
        requestBody.texts = str;
        requestBody.targetLanguageCode = language;

        HttpResponse<String> response = Unirest.post(URL)
                .header("Accept", "*/*")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+TOKEN)
                .body(gson.toJson(requestBody))
                .asString();
        String strResponse = response.getBody();
        log.info("response: "+strResponse);
        return gson.fromJson(strResponse, ResponseTranslate.class);
    }


}