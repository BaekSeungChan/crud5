package com.qortmdcks.crud5.payload;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class TwoDto {
    private Long id;

    private String name;

    private String age;

    private int number;
}
