package com.orangescape.uploadcareandroid;

import com.orangescape.uploadcareandroid.api.UploadedFile;
import com.orangescape.uploadcareandroid.api.services.FileUploadService;
import java.text.SimpleDateFormat;
import java.util.Date;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.mime.TypedFile;

/**
 * Created by gautam on 22/9/14.
 */
public class Client {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z");
    private final String key, secret;
    private final RestAdapter restAdapter;

    private final RequestInterceptor requestInterceptor = new RequestInterceptor() {
        private final String HEADER_ACCEPT = "application/vnd.uploadcare-v0.3+json";

        private String getDate() {
            return DATE_FORMAT.format(new Date());
        }

        @Override
        public void intercept(RequestFacade request) {
            request.addHeader("Accept", HEADER_ACCEPT);
            request.addHeader("Date", getDate());
            request.addHeader("Authorization", "Uploadcare.Simple " + key + ":" + secret);
        }
    };

    public Client(String key, String secret) {
        this.key = key;
        this.secret = secret;
        this.restAdapter = new RestAdapter.Builder()
                .setRequestInterceptor(requestInterceptor)
                .setLogLevel(RestAdapter.LogLevel.HEADERS)
                .setEndpoint("https://upload.uploadcare.com/")
                .build();
    }

    public UploadedFile uploadFile(TypedFile file){
        FileUploadService fileUploadService = restAdapter.create(FileUploadService.class);
        return fileUploadService.uploadFile(key, FileUploadService.STORE_FILES , file );
    }


}
