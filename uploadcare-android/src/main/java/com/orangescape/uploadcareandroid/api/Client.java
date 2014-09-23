package com.orangescape.uploadcareandroid.api;

/**
 * Created by gautam on 22/9/14.
 */
public class Client {

    private final String key, secret;

    public Client(String key, String secret) {
        this.key = key;
        this.secret = secret;
    }

    public String getKey() {
        return key;
    }

    public String getSecret() {
        return secret;
    }
}
