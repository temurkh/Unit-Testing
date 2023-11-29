
/**
 * Name: Temur Khusanboev (khusanbo)
 * Course: CSCI 241 - Computer Science I
 * Section: 001 <-- choose your section
 * Assignment: 9
 *
 * Project/Class Description:
 * (This class keeps track of information for a clock time.)
 *
 * Known bugs:
 * (write the word none, or describe)
 */

public class ClockTime {
    
    //intance variables
    private int hour;
    private int minute;
    private int second;

    //default constructor
    public ClockTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    //parameterized constructor with error checking
    public ClockTime(int x, int y, int z) {
        hour = x;
        minute = y;
        second = z;

        // Error checking for seconds
        if (second >= 60) {
            minute += second / 60;
            second %= 60;
        } else if (second < 0) {
            second = 0;
        }

        // Error checking for minutes
        if (minute >= 60) {
            minute += minute / 60;
            minute %= 60;
        } else if (minute < 0) {
            minute = 0;
        }

        //error checking for hours
        //hour %= 24;
        if (hour >= 24) {
            hour += hour / 24;
            hour %= 24;
        } else if (hour < 0) {
            hour = 0;
        }
    }

    //setter methods for instance variables
    public void setHour(int x){
        hour = x;
    }
    
    public void setMinute(int x){
        minute = x;
    }
    
    public void setSecond(int x){
        second = x;
    }

    //getter methods for instance variables
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    //toString method to display the time
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
    //toString12 method to display the time
    public String toString12() {
        int hour12 = hour % 12 == 0 ? 12 : hour % 12; // Convert 0 to 12 for 12-hour format
        String period = hour < 12 ? "A.M." : "P.M.";

        return String.format("%02d:%02d:%02d %s", hour12, minute, second, period);
    }
    
    //advance method takes a positive integer as input and advances the ClockTime object by that many seconds
    public void advance(int secondsToAdd) {
        //calculate total seconds after advancing
        int totalSeconds = hour * 3600 + minute * 60 + second + secondsToAdd;

        //update hours, minutes, and seconds
        hour = (totalSeconds / 3600) % 24;
        minute = (totalSeconds % 3600) / 60;
        second = totalSeconds % 60;
    }

    //example main method for testing
    public static void main(String[] args) {
        //testing the default constructor
        ClockTime defaultTime = new ClockTime();
        System.out.println("Default Time: " + defaultTime);

        //testing the parameterized constructor
        ClockTime customTime = new ClockTime(23, 75, 80);
        System.out.println("Custom Time: " + customTime);
    }
    
    public boolean equals(ClockTime Clock) {
        boolean isEqual = false;
        if(hour == Clock.hour && minute == Clock.minute && second == Clock.second){
            isEqual = true;
        }
        return isEqual;
    }
}
