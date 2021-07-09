package jiepu.Java.homework.Day9.test2;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/7 21:54<br/>
 *
 * @author lnh<br />
 */
public class Driver {
    public static void main(String[] args) {
        Track myTrack = new Track();
        myTrack.setTitle("Watching The Wheels");
        Duration myDuration = new Duration(234);
        //Duration myDuration = new Duration(0, 3, 48);
        myTrack.setDuration(myDuration);
        System.out.println("myTrack is: " + myTrack);
        System.out.println("Title = " + myTrack.getTitle ());
        System.out.println("Duration = " + myTrack.getDuration().toString());
    }
}
