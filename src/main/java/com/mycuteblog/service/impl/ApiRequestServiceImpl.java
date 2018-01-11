package com.mycuteblog.service.impl;

import com.mycuteblog.dao.ApiRequestDao;
import com.mycuteblog.model.ApiRequest;
import com.mycuteblog.model.Parents;
import com.mycuteblog.repository.ParentRepository;
import com.mycuteblog.service.ApiRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ApiRequestServiceImpl implements ApiRequestService {

    @Autowired
    private ApiRequestDao apiRequestDao;
    
    @Autowired
    private ParentRepository parentRepository;


    @Override
    public void create(ApiRequest apiRequest) {
        apiRequestDao.create(apiRequest);
    }
    
    public Parents save(Parents parents){
    	return parentRepository.save(parents);
    }
}
