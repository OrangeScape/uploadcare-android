package com.orangescape.uploadcareandroid.api;

import java.util.Date;

/**
 * Created by gautam on 23/9/14.
 */
public class File {
    String original_file_url;
    String mime_type;
    String url;
    String uuid;
    String original_filename;
    String source;
    Date datetime_uploaded, datetime_stored, datetime_removed;
    long size;
    boolean is_ready, is_image;

    public String getOriginal_file_url() {
        return original_file_url;
    }

    public void setOriginal_file_url(String original_file_url) {
        this.original_file_url = original_file_url;
    }

    public String getMime_type() {
        return mime_type;
    }

    public void setMime_type(String mime_type) {
        this.mime_type = mime_type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOriginal_filename() {
        return original_filename;
    }

    public void setOriginal_filename(String original_filename) {
        this.original_filename = original_filename;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getDatetime_uploaded() {
        return datetime_uploaded;
    }

    public void setDatetime_uploaded(Date datetime_uploaded) {
        this.datetime_uploaded = datetime_uploaded;
    }

    public Date getDatetime_stored() {
        return datetime_stored;
    }

    public void setDatetime_stored(Date datetime_stored) {
        this.datetime_stored = datetime_stored;
    }

    public Date getDatetime_removed() {
        return datetime_removed;
    }

    public void setDatetime_removed(Date datetime_removed) {
        this.datetime_removed = datetime_removed;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public boolean isIs_ready() {
        return is_ready;
    }

    public void setIs_ready(boolean is_ready) {
        this.is_ready = is_ready;
    }

    public boolean isIs_image() {
        return is_image;
    }

    public void setIs_image(boolean is_image) {
        this.is_image = is_image;
    }

}
