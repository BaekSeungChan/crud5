package com.qortmdcks.crud5.service;

import com.qortmdcks.crud5.payload.OneDto;

import java.util.List;

public interface OneService {

    OneDto createOne(OneDto oneDto);

    List<OneDto> getAllOne();

    OneDto getOneById(long id);

    void deleteOneById(long id);
}
