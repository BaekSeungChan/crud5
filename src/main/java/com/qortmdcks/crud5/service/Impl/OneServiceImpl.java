package com.qortmdcks.crud5.service.Impl;

import com.qortmdcks.crud5.payload.OneDto;

import java.util.List;

public interface OneServiceImpl {

    OneDto createOne(OneDto oneDto);

    List<OneDto> getAllOne();
}
