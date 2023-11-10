package com.qortmdcks.crud5.service;

import com.qortmdcks.crud5.payload.TwoDto;

import java.util.List;

public interface TwoService {

    TwoDto createTwo(TwoDto twoDto);

    List<TwoDto> getAllTwo();
}
