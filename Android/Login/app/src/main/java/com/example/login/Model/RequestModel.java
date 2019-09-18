package com.example.login.Model;

import com.example.login.Global.RequestStatus;

import java.io.Serializable;

public class RequestModel implements Serializable {

    String requestNumber;
    RequestStatus requestStatus;
    String Date;


    public String getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
