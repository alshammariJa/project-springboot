package com.example.demo5.Service;

import com.example.demo5.Pojo.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Service
public class Service_Product {
    ArrayList <Product> Products= new ArrayList<>();
    public  ArrayList getProducts(){
        return Products;
    }


   public void  addProducts( Product product){
       Products.add(product);
   }

//   public boolean updateProduct(int id ,Product product){
//       for (int i = 0 ;i< Products.size();i++)
//           if (Products.get(i).getId()==id) {
//               Products.set(i, product);
//               return true;
//
//           }
//       return false;
//   }
public boolean updateProduct(int id ,Product product){
    Products.set(id,product);
    return true;
}



//    public boolean deleteProduct(int id){
//        for (int i = 0; i < Products.size(); i++) {
////            if(product.get(i).getId()==id){
//                product.remove(i);
//                return true;
////            }
//
//        }
//        return false;
//    }
    public boolean deleteProduct(int id){
        Products.remove(id);
        return true;
    }

    }
