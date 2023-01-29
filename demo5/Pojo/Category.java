package com.example.demo5.Pojo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Category {
    @NotEmpty
    @Min(value = 3,message = "id should be 3 or more character")
    private String id;
    @NotEmpty
    @Min(value = 3,message = "name should be 3 or more character")
    private  String name;
}
