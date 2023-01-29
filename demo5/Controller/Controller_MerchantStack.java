package com.example.demo5.Controller;

import com.example.demo5.Pojo.MerchantStock;
import com.example.demo5.Service.Service_MerchantStock;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/merchantStack")
public class Controller_MerchantStack {
    private final Service_MerchantStock  Service_MerchantStock;
    @GetMapping("/add")
    public ResponseEntity getMerchantStack(){
        ArrayList<MerchantStock> MerchantStocks= Service_MerchantStock.getService_MerchantStock();
        return ResponseEntity.status(200).body(MerchantStocks);
    }
    @PostMapping("/add")
    public ResponseEntity addMerchantStack( @Valid @RequestBody MerchantStock merchantStock, Errors errors){
        if(errors.hasErrors()) {
            String msg=errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(msg);
        }
        Service_MerchantStock.addService_MerchantStock(merchantStock);
        return ResponseEntity.status(200).body("added done!");


    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateMerchantStack(@Valid @PathVariable int id, MerchantStock merchantStock, Errors errors){
        if ( errors.hasErrors()){
            String msg= errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(msg);


        }
        Service_MerchantStock.updateService_MerchantStock(id,merchantStock);
        return ResponseEntity.status(200).body("updated done!");
    }
    @DeleteMapping("delete/{id}")
    public  ResponseEntity deleteMerchantStack(@PathVariable int id){
        Service_MerchantStock.deleteService_MerchantStock(id);
        return ResponseEntity.status(200).body("deleted done !");

    }


}
