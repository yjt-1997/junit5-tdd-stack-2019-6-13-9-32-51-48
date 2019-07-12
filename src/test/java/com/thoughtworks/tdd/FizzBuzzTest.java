package com.thoughtworks.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {

    @Test
    @DisplayName("try display name")
    public void should_return_FizzBuzz_when_convert_given_15(){
        //GivenS
        int input = 15;
        //When
        String result = new FizzBuzz().convert(input);
        //Then
        assertThat(result, is("FizzBuzz"));
    }

}
