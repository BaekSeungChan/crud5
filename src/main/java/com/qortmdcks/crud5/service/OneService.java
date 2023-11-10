package com.qortmdcks.crud5.service;

import com.qortmdcks.crud5.entity.One;
import com.qortmdcks.crud5.payload.OneDto;
import com.qortmdcks.crud5.repository.OneRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class OneService {

    private OneRepository oneRepository;
    private ModelMapper modelMapper;

    public OneService(OneRepository oneRepository, ModelMapper modelMapper){
        this.oneRepository = oneRepository;
        this.modelMapper = modelMapper;
    }

    public OneDto createOne(OneDto oneDto){
        One one = modelMapper.map(oneDto, One.class);
        One saveOne = oneRepository.save(one);

        return modelMapper.map(saveOne, OneDto.class);
    }
}
