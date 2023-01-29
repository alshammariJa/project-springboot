package com.example.demo5.Service;

import com.example.demo5.Pojo.Merchant;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Service_Merchant {
ArrayList <Merchant> Merchants =new ArrayList<>();


public ArrayList getMerchant(){
    return Merchants;
}

    public void  addMerchant( Merchant merchant){
        Merchants.add(merchant);
    }

    public boolean updateMerchant(int id ,Merchant merchant){
        Merchants.set(id,merchant);
        return true;
    }

    public boolean deleteMerchant(int id){
        Merchants.remove(id);
        return true;
    }

}
