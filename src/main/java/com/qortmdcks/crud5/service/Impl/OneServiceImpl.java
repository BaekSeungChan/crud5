package com.qortmdcks.crud5.service.Impl;

import com.qortmdcks.crud5.entity.One;
import com.qortmdcks.crud5.payload.OneDto;
import com.qortmdcks.crud5.repository.OneRepository;
import com.qortmdcks.crud5.service.OneService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OneServiceImpl implements OneService {

    private OneRepository oneRepository;
    private ModelMapper modelMapper;

    public OneServiceImpl(OneRepository oneRepository, ModelMapper modelMapper){
        this.oneRepository = oneRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public OneDto createOne(OneDto oneDto){
        One one = modelMapper.map(oneDto, One.class);
        One saveOne = oneRepository.save(one);

        return modelMapper.map(saveOne, OneDto.class);
    }

    @Override
    public List<OneDto> getAllOne(){
        List<One> ones = oneRepository.findAll();

        return ones.stream().map((one) -> modelMapper.map(one, OneDto.class)).collect(Collectors.toList());
    }

    @Override
    public OneDto getOneById(long id){
        One one = oneRepository.findById(id).orElseThrow(()-> new RuntimeException("No id"));

        return modelMapper.map(one, OneDto.class);

    }

    @Override
    public void deleteOneById(long id){
        One one = oneRepository.findById(id).orElseThrow(() -> new RuntimeException("No id"));
        oneRepository.delete(one);
    }
}
