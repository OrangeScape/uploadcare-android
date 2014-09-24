package com.orangescape.uploadcareandroid.api.services;

import com.orangescape.uploadcareandroid.api.UploadedFile;

import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.mime.TypedFile;

/**
 * Created by gautam on 22/9/14.
 */
public interface FileUploadService {
    static final String UPLOADCARE_PUB_KEY = "UPLOADCARE_PUB_KEY";
    static final String UPLOADCARE_STORE = "UPLOADCARE_STORE";
    public static final int STORE_FILES = 1, DONT_STORE_FILES = 0;


    @Multipart
    @POST("/base/")
    public UploadedFile uploadFile(
            @Part(UPLOADCARE_PUB_KEY) String key,
            @Part(UPLOADCARE_STORE) int store,
            @Part("file") TypedFile file
    );
}
