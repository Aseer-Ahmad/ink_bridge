package com.example.newu.exa_ui.Pending;

/**
 * Created by nEW u on 11/04/2018.
 */

public class PendingDetails {
    String consignment;
    String date;
    String dedicated;
    String keywords;

    public PendingDetails(String consignment, String date, String dedicated, String keywords) {
        this.consignment = consignment;
        this.date = date;
        this.dedicated = dedicated;
        this.keywords = keywords;
    }

    public String getConsignment() {
        return consignment;
    }

    public void setConsignment(String consignment) {
        this.consignment = consignment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDedicated() {
        return dedicated;
    }

    public void setDedicated(String dedicated) {
        this.dedicated = dedicated;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
