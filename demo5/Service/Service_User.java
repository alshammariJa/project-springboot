package com.example.demo5.Service;

import com.example.demo5.Pojo.MerchantStock;
import com.example.demo5.Pojo.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Service_User {
    ArrayList<User> users =new ArrayList<>();
     private Service_MerchantStock Service_MerchantStock;
     public ArrayList getUser(){
         return  users;
     }

     public void  addUser(User user){
         users.add(user);

     }
     public boolean updateUser(int id ,User user){
         users.set(id,user);
         return true;
     }

     public boolean deleteUser(int id){
         users.remove(id);
         return true;

     }

     public  void userAddProduct( String product_id, String merchant_id,String stock ){
         MerchantStock merchantStock =new MerchantStock( "1",product_id,merchant_id,stock);
         Service_MerchantStock.MerchantStocks.add(merchantStock);




     }

     public  void buyProduct(String user_id,String product_id , String merchant_id){



     }


}
