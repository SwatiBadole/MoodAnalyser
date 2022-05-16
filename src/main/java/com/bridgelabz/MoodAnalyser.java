package com.bridgelabz;

public class MoodAnalyser {

    public static String message;

    // Constructor
    public MoodAnalyser(String message) {
        this.message = message;
        analyseMood("User is Sad");
    }

    //Getter
    public String getMessage() {
        return message;
    }

    //Setter
    public void setMessage(String message) {
        this.message = message;
    }
    public String analyseMood(String user_is_sad) {

        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else if (message.toLowerCase().contains("happy")) {
        }
        return "Happy";
    }
}

