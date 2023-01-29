package com.example.demo5.Service;

import com.example.demo5.Pojo.MerchantStock;
import org.springframework.stereotype.Service;


import java.util.ArrayList;

@Service
public class Service_MerchantStock {
    ArrayList<MerchantStock> MerchantStocks =new ArrayList<>();


    public ArrayList getService_MerchantStock(){
        return MerchantStocks;
    }

    public void addService_MerchantStock( MerchantStock merchantStock){
        MerchantStocks.add(merchantStock);
    }
    public boolean updateService_MerchantStock( int id,MerchantStock merchantStock){
        MerchantStocks.set(id,merchantStock);
        return true;
    }

    public boolean deleteService_MerchantStock(int id){
        MerchantStocks.remove(id);
        return true;
    }
}
