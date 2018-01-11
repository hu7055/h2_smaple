package com.mycuteblog.service;

import com.mycuteblog.model.ApiRequest;
import com.mycuteblog.model.Parents;

public interface ApiRequestService {
    void create(ApiRequest apiRequest);
    
    Parents save(Parents parents);
}
