package com.java.ProjectDay9_Nov17;

public class Clock {
    public int hours;
    public int minutes;
    public int seconds;

    public Clock() {
        // TODO implement no args constructor
        System.out.println("12:00:00");
    }

    public Clock(int seconds) {
        // TODO implement one arg constructor
        this.hours = seconds / 3600;
        this.minutes = (seconds % 3600) / 60;
        this.seconds = (seconds % 3600) % 60;
    }

    public Clock(int hours, int minutes, int seconds) {
        //TODO implement all args constructor
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setClock(int seconds) {
        //TODO implement this method
        this.seconds = seconds;
    }

    public int getHours() {
        //TODO implement this method
        return hours;
    }

    public void setHours(int hours) {
        //TODO implement this method
        this.hours = hours;
    }

    public int getMinutes() {
        //TODO implement this method
        return minutes;
    }

    public void setMinutes(int minutes) {
        //TODO implement this method
        this.minutes = minutes;
    }

    public int getSeconds() {
        //TODO implement this method
        return seconds;
    }

    public void setSeconds(int seconds) {
        //TODO implement this method
        this.seconds = seconds;
    }

    public void tick() {
        //TODO implement this method
        seconds++;
    }


    public void tickDown() {
        //TODO implement this method
        seconds--;
    }

    public void addClock(Clock clock) {
        //TODO implement this method
        this.hours = this.hours + clock.hours;
        this.minutes = this.minutes + clock.minutes;
        this.seconds = this.seconds + clock.seconds;
        if(this.seconds == 60){
            this.minutes++;
            this.seconds = 0;
        }
        if (this.minutes == 60){
            this.hours++;
            this.minutes = 0;
        }
    }

    public Clock subtractClock(Clock clock) {
        //TODO implement this method
        this.hours = this.hours - clock.hours;
        this.minutes = this.minutes - clock.minutes;
        this.seconds = this.seconds-clock.seconds;
        if(this.seconds - clock.seconds < 0){
            this.seconds = this.seconds + 60;
            this.minutes--;
        }
        if (this.minutes - clock.minutes < 0){
            this.minutes = this.minutes + 60;
            this.hours--;
        }
        return clock;
    }

    @Override
    public String toString() {
        return "(" + String.format("%02d:%02d:%02d", this.getHours(), this.getMinutes(), this.getSeconds()) + ")";
    }
}
