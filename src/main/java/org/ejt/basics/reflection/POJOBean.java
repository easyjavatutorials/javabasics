package org.ejt.basics.reflection;

import java.util.HashMap;

/**
 * Created by http://easyjavatutorials.in on 1/2/17.
 * <p>
 * A place to find easy java tutorials written by developers for developers.
 * <p>
 * Released under :
 * <p>
 * Apache License 2.0: http://www.apache.org/licenses/LICENSE-2.0.txt
 *
 * @Intent
 */
public class POJOBean {
    private String id;
    private Long token;
    private Integer responseCode;
    private HashMap<String,Object> data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getToken() {
        return token;
    }

    public void setToken(Long token) {
        this.token = token;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }
}
