package com.tma.speechtotext;

public class Data {

    private  int IDDATA;
    private String DATA;


    public Data(int IDDATA, String DATA) {
        this.IDDATA = IDDATA;
        this.DATA = DATA;
    }

    public int getIDDATA() {
        return IDDATA;
    }

    public void setIDDATA(int IDDATA) {
        this.IDDATA = IDDATA;
    }

    public String getDATA() {
        return DATA;
    }

    public void setDATA(String DATA) {
        this.DATA = DATA;
    }



}
