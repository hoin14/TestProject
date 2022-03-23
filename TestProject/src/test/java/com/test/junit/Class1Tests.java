package com.test.junit;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.junit.ScoreCollection;

@SpringBootTest
public class Class1Tests {

    @Test
    public void averageTest() {
    //given
        ScoreCollection scoreCollection = new ScoreCollection();
        scoreCollection.add(() -> 5);
        scoreCollection.add(() -> 7);
        
    //when
        int average = scoreCollection.getAverage();

    //then
        assertThat(average).isEqualTo(6);
        assertThat(average, equalTo(6));
    }
}