package jiepu.Java.homework.Day9.test3;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/7 22:31<br/>
 *
 * @author lnh<br />
 */
public class moreCars extends Vehicle{
    private int seating;

    public moreCars(String trademark, String licenseNumber,int seating) {
        super(trademark, licenseNumber);
        this.seating=seating;
    }

    public int dailyRent(){
        if (this.seating<=16) {
            return 400;
        }else {
            return 600;
        }
    }
}
