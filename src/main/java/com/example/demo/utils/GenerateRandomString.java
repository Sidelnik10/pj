package com.example.demo.utils;

import java.util.Random;

public interface GenerateRandomString {

    static String generateRandomHexString(int length){
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        while(sb.length() < length){
            sb.append(Integer.toHexString(r.nextInt()));
        }
        return sb.toString().substring(0, length);
    }
}
