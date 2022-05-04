package com.saucedemo.www.pages;

import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {
    By productList=By.className("inventory_item");

    public int getproductList(){
        return  printSizeOfList(productList);




    }}
