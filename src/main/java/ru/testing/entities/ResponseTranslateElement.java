package ru.testing.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class ResponseTranslateElement {
    @SerializedName("text")
    public String text;
    @SerializedName("detectedLanguageCode")
    public String detectedLanguageCode;
}
