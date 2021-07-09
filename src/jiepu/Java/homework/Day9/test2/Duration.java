package jiepu.Java.homework.Day9.test2;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/7 21:55<br/>
 *
 * @author lnh<br />
 */
public class Duration {
    private int hours;
    private int minutes;
    private int seconds;



    public Duration(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Duration(int seconds) {
        this.hours = seconds/3600;
        this.minutes = (seconds-hours*3600)/60;
        this.seconds = (seconds-hours*3600-minutes*60);
    }


    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getTotalSeconds() {
        int second1;
        second1=hours*3600+minutes*60+seconds;
        return second1;
    }

    @Override
    public String toString() {
        return  hours + ":" + minutes + ":" + seconds;
    }
}
