package com.bridgelabz;

public class MoodAnalyser {

    public static String message;

    // Constructor
    public MoodAnalyser(String message) throws MoodAnalyserException {
        this.message = message;
        analyseMood();
    }

    //Getter
    public String getMessage() {
        return message;
    }

    //Setter
    public void setMessage(String message) {
        this.message = message;
    }
    public String analyseMood() throws MoodAnalyserException {

        try {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyserException("Enter Invalid Mood");
        }
    }


}

