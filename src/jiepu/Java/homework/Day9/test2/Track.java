package jiepu.Java.homework.Day9.test2;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/7 22:03<br/>
 *
 * @author lnh<br />
 */
public class Track {
    private String title;
    private  Duration duration;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "my Track address is "+title + " duration is" + duration;
    }
}
