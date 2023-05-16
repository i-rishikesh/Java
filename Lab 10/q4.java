
// Write a program to create user defined exceptions called HrsException, MinException and SecException.
// Create a class Time which contains data members hours,
// minutes, seconds and throw the user defined exceptions if hours (>24 & <0),minutes(>60 & <0),seconds(>60 & <0).
// Write a main method to accept the time from the user and display the time.
import java.util.*;

class HrsException extends Exception {
    HrsException(String s) {
        super(s);
    }
}

class MinException extends Exception {
    MinException(String s) {
        super(s);
    }
}

class SecException extends Exception {
    SecException(String s) {
        super(s);
    }
}

class Time {
    int hours, minutes, seconds;

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void display() {
        System.out.println("Time is " + hours + ":" + minutes + ":" + seconds);
    }
}

class q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in hours, minutes and seconds");
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        int seconds = sc.nextInt();
        try {
            if (hours > 24 || hours < 0) {
                throw new HrsException("Hours should be between 0 and 24");
            } else if (minutes > 60 || minutes < 0) {
                throw new MinException("Minutes should be between 0 and 60");
            } else if (seconds > 60 || seconds < 0) {
                throw new SecException("Seconds should be between 0 and 60");
            } else {
                Time t = new Time(hours, minutes, seconds);
                t.display();
            }
        } catch (HrsException e) {
            System.out.println(e);
        } catch (MinException e) {
            System.out.println(e);
        } catch (SecException e) {
            System.out.println(e);
        }
    }
}
