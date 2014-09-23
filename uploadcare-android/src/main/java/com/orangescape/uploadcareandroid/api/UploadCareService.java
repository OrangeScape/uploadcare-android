package com.orangescape.uploadcareandroid.api;

import retrofit.client.Response;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.mime.TypedFile;

/**
 * Created by gautam on 22/9/14.
 */
public interface UploadCareService {
    static final String UPLOADCARE_PUB_KEY = "UPLOADCARE_PUB_KEY";
    static final String UPLOADCARE_STORE = "UPLOADCARE_STORE";
    public static final int STORE_FILES = 1, DONT_STORE_FILES = 0;


    @Multipart
    @POST("/base/")
    public File uploadfile(@Part(UPLOADCARE_PUB_KEY) String key, @Part(UPLOADCARE_STORE) int store, @Part("file") TypedFile file);
}
