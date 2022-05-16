package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    /* @Test
     public void givenMessage_WhenProper_ShouldReturnSad() throws MoodAnalyserException {
         MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
         String result = moodAnalyser.analyseMood();
         Assertions.assertEquals(result, "SAD");
     }
     @Test
     public void givenMessage_WhenProper_ShouldReturnHappy() throws MoodAnalyserException {
         MoodAnalyser moodAnalyser=new MoodAnalyser("I am in Happy Mood");
         String result=moodAnalyser.analyseMood();
         Assertions.assertEquals(result,"HAPPY");
     }*/
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() throws MoodAnalyserException {
        try {
            MoodAnalyser moodanalyser = new MoodAnalyser("Sad");
            String actualResult = moodanalyser.analyseMood();
            Assertions.assertEquals("Sad", actualResult);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodanalyser = new MoodAnalyser("I am in happy Mood");
        String actualResult = moodanalyser.analyseMood();
        Assertions.assertEquals("Happy", actualResult);
    }

    @Test
    public void givenMessage_Null_ShouldReturnExceptionHandled() throws MoodAnalyserException {
        MoodAnalyser moodanalyser = new MoodAnalyser(null);
        String actualResult = moodanalyser.analyseMood();
        Assertions.assertEquals("Sad", actualResult);
    }

}