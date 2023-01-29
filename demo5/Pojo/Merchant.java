package com.example.demo5.Pojo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Merchant {
    @NotEmpty
    @Min(value = 3,message = "id should be 3 or more character")
    private String merchant_id;
    @NotEmpty
    @Min(value = 3,message = "name should be 3 or more character")
    private  String name;
}
