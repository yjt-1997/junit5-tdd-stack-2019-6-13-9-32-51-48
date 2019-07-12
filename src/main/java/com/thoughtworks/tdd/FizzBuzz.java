package com.thoughtworks.tdd;

public class FizzBuzz {

    public String convert(int input){
        if (input % 15 == 0){
            return "FizzBuzz";
        }else if (input % 5 == 0){
            return "Buzz";
        }
        else {
            return String.valueOf(input);
        }
    }
}
