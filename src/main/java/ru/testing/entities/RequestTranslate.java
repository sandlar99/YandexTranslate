package ru.testing.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class RequestTranslate {
    public RequestTranslate(){
    }

    @SerializedName("folderId")
    public String folderId;
    @SerializedName("texts")
    public String[] texts;
    @SerializedName("targetLanguageCode")
    public String targetLanguageCode;
}
