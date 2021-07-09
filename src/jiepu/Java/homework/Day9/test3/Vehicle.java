package jiepu.Java.homework.Day9.test3;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/7 22:09<br/>
 *
 * @author lnh<br />
 */
public class Vehicle {
    private String trademark;
    private  String licenseNumber;

    public Vehicle(String trademark, String licenseNumber) {
        this.trademark = trademark;
        this.licenseNumber = licenseNumber;
    }

    public int dailyRent() {
        return 0;
    }

    public int getsumrent(int days){
        return dailyRent()*days;
    }
}
