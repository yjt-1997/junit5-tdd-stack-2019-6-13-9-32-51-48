package com.thoughtworks.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_return_FizzBuzz_when_convert_given_15(){
        //GivenS
        int input = 15;
        //When
        String result = new FizzBuzz().convert(input);
        //Then
        assertThat(result, is("FizzBuzz"));
    }

    @Test
    public void should_return_FizzBuzz_when_convert_given_30(){
        //GivenS
        int input = 30;
        //When
        String result = new FizzBuzz().convert(input);
        //Then
        assertThat(result, is("FizzBuzz"));
    }

    @Test
    public void should_return_16_when_convert_given_16(){
        //GivenS
        int input = 16;
        //When
        String result = new FizzBuzz().convert(input);
        //Then
        assertThat(result, is("16"));
    }
}
