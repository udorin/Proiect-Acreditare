package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class Utils {



     public static final String email = "udorin73@gmail.com";
     public static final String password = "nokia1234567890!";


    public  static String generateRandomString(int  length){
        String generateString;
         generateString = RandomStringUtils.random(length,true,true);

        return generateString;
    }









}
