package com.example.demo5.Pojo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MerchantStock {
    @NotEmpty
    @Min(value = 3,message = "id should be 3 or more character")
    private String id;

    @NotEmpty
    @Min(value = 3,message = "id should be 3 or more character")
    private String productID ;

    @NotEmpty
    @Min(value = 3,message = "id should be 3 or more character")
    private String merchantID ;

    @NotEmpty
    @Size(min = 10, max = 220,message =" stock have to be more than 10 at start" )
    private String stock ;



}
