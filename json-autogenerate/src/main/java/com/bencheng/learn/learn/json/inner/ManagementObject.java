package com.bencheng.learn.learn.json.inner;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Bencheng on 2018/5/7.
 */
public class ManagementObject {
    @SerializedName("DDF")
    private String ddf;

    @SerializedName("MOID")
    private String moId;

    @SerializedName("MIID")
    private List<String> miId;

    public String getDdf() {
        return ddf;
    }

    public void setDdf(String ddf) {
        this.ddf = ddf;
    }

    public String getMoId() {
        return moId;
    }

    public void setMoId(String moId) {
        this.moId = moId;
    }

    public List<String> getMiId() {
        return miId;
    }

    public void setMiId(List<String> miId) {
        this.miId = miId;
    }

    @Override
    public String toString() {
        return "ManagementObject{" +
                "ddf='" + ddf + '\'' +
                ", moId='" + moId + '\'' +
                ", miId=" + miId +
                '}';
    }
}
