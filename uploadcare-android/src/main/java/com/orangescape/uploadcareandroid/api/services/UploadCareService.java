package com.orangescape.uploadcareandroid.api.services;

import com.orangescape.uploadcareandroid.api.File;

import retrofit.http.GET;
import retrofit.http.Part;

/**
 * Created by gautam on 23/9/14.
 */
public interface UploadCareService {

    @GET("/files/{uuid}")
    public File getFile(@Part("uuid") String uuid);
}
