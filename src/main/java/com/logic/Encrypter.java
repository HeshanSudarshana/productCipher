package com.logic;

public class Encrypter {

    private String key;
    private Integer permutationSize;
    private Integer shiftingAmount;

    public Encrypter(String key) {
        this.key = key;
        permutationSize = key.length();
        char tempChar;
        int tempInt = 0;
        for (int i=0; i<key.length(); i++) {
            tempChar = key.charAt(i);
            tempInt += (int) tempChar;
        }
        shiftingAmount = tempInt/permutationSize;
    }

    public String encrypt(String text) {

    }

}
