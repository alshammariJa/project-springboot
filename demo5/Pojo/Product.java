package com.example.demo5.Pojo;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
  @NotEmpty
  @Min(value = 3,message = "id should be 3 or more character")
    private String product_id;
  @NotEmpty
  @Min(value = 3,message = "name should be 3 or more character")
    private  String name;

  @NotNull
  @Positive
  private int price;
  @NotEmpty
  @Size(min = 3, max = 20,message ="category ID should be 3 or more character" )
  private String categoryID;


}
