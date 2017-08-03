package com.example.codetribe.arraylist;

import java.util.ArrayList;

/**
 * Created by CODETRIBE on 2017/07/19.
 */

public class MyArray {

    public static ArrayList myArray = new ArrayList();

   public void saveArray(String x){
        myArray.add(x);
    }

    public ArrayList<String> getMyArray() {
        return myArray;
    }
}
