package com.bencheng.learn.learn.json.inner;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * Created by Bencheng on 2018/5/7.
 */
public class Alert {

    @SerializedName("AlertType")
    private String alertType;

    @SerializedName("SourceURI")
    private String sourceURI;

    @SerializedName("TargetURI")
    private String targetURI;

    @SerializedName("Mark")
    private String mark;

    @SerializedName("DataType")
    private String dataType;

    @SerializedName("Data")
    private Map<String, String> data;

    @Override
    public String toString() {
        return "Alert{" +
                "alertType='" + alertType + '\'' +
                ", sourceURI='" + sourceURI + '\'' +
                ", targetURI='" + targetURI + '\'' +
                ", mark='" + mark + '\'' +
                ", dataType='" + dataType + '\'' +
                ", data=" + data +
                '}';
    }
}
