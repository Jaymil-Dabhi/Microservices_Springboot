package com.example.productservice.dto;

import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Builder
@Data

public class ProductResponse {

    private String id;
    private String name;
    private String description;
    private BigDecimal price;


}
