package com.tobeto.bootcampProject.core.model_mapper;

import org.modelmapper.ModelMapper;


public interface ModelMapperService {

    ModelMapper forRequest();
    ModelMapper forResponse();
}
