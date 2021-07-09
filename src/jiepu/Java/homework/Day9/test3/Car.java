package jiepu.Java.homework.Day9.test3;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/7 22:13<br/>
 *
 * @author lnh<br />
 */
public class Car extends Vehicle{
    private String vehiclemodel;

    public Car(String trademark, String licenseNumber, String vehiclemodel) {
        super(trademark,licenseNumber);
        this.vehiclemodel = vehiclemodel;
    }


    public int dailyRent(){
        if (this.vehiclemodel.equals("两厢")) {
            return 300;
        }else if (this.vehiclemodel.equals("三厢")) {
            return 350;
        }else {
            return 500;
        }
    }

}
