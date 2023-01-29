package com.example.demo5.Service;

import com.example.demo5.Pojo.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Service_Category {
    ArrayList<Category> Categories =new ArrayList<>();

    public ArrayList<Category> getCategory(){
        return Categories;
    }
    public void addCategory(Category category){
        Categories.add(category);
    }


    public boolean updateCategory(int id,Category category){
//        for (int i = 0; i < Categories.size(); i++) {
//            if(Categories.get(i).getId()==id){
//                blogs.set(i,blog);
//                return true;
//            }
//        }
//        return false;
        Categories.set(id,category);
        return true;
    }

    public boolean deleteCategory(int id) {

        Categories.remove(id);
        return true;

    }
}
