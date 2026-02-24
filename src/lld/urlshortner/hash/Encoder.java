package lld.urlshortner.hash;

import java.util.Base64;

public class Encoder {
    private final String CHAR_SET="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public String encode(long input) {
        if(input < 0){
            throw new IllegalArgumentException("Input cannot be negative");
        }
        StringBuilder encoded=new StringBuilder();
        while(input > 0){
            encoded.append(CHAR_SET.charAt((int) (input%CHAR_SET.length())));
            input /= CHAR_SET.length();
        }

        System.out.println(encoded.reverse());
        return encoded.reverse().toString();
    }

}
