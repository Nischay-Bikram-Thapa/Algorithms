package com.nischay.main;

public class Encode {

    public Encode(String str) {
    }

    public void enCoder(String str) {
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            System.out.println(count+""+str.charAt(i));
        }

    }

}
