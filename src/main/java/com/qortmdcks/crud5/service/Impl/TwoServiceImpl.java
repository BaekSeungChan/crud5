package com.qortmdcks.crud5.service.Impl;

import com.qortmdcks.crud5.entity.Two;
import com.qortmdcks.crud5.payload.TwoDto;
import com.qortmdcks.crud5.repository.TwoRepository;
import com.qortmdcks.crud5.service.TwoService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class TwoServiceImpl implements TwoService {

    private TwoRepository twoRepository;
    private ModelMapper modelMapper;

    public TwoServiceImpl(TwoRepository twoRepository, ModelMapper modelMapper){
        this.twoRepository = twoRepository;
        this.modelMapper = modelMapper;
    }

    public TwoDto createTwo(TwoDto twoDto){
        Two two = modelMapper.map(twoDto, Two.class);
        Two saveTwo = twoRepository.save(two);

        return modelMapper.map(saveTwo, TwoDto.class);
    }
}
