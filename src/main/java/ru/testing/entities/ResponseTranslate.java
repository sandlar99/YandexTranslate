package ru.testing.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class ResponseTranslate {
    @SerializedName("translations")
    public ResponseTranslateElement[] translations;
}
