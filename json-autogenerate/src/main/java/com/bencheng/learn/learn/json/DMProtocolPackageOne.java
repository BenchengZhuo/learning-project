package com.bencheng.learn.learn.json;

import com.bencheng.learn.learn.json.inner.Alert;
import com.bencheng.learn.learn.json.inner.ManagementObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Bencheng on 2018/5/7.
 */
public class DMProtocolPackageOne {

    @SerializedName("MOS")
    private List<ManagementObject> mos;

    @SerializedName("Alert")
    private List<Alert> alertList;

    public List<ManagementObject> getMos() {
        return mos;
    }

    public void setMos(List<ManagementObject> mos) {
        this.mos = mos;
    }

    public List<Alert> getAlertList() {
        return alertList;
    }

    public void setAlertList(List<Alert> alertList) {
        this.alertList = alertList;
    }

    @Override
    public String toString() {
        return "DMProtocolPackageOne{" +
                "mos=" + mos +
                ", alertList=" + alertList +
                '}';
    }
}
