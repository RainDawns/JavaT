package systematicLearn.Java.homework.Day11.staff;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/10 18:49<br/>
 *
 * @author lnh<br />
 */
public abstract class Staff {
    private String name;
    public Staff(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void toWork(){
        System.out.println(getName()+"去上班");
    }
    public void offWork(){
        System.out.println(getName()+"下班了");
    }
}
interface  Working{
    void working();
}
class Sale extends Staff implements Working{
    public Sale(String name) {
        super(name);
    }
    @Override
    public void working() {
        System.out.println(getName()+"推销商品");
    }
}
class Administration extends Staff implements Working{

    public Administration(String name) {
        super(name);
    }

    @Override
    public void working() {
        System.out.println(getName()+"管理人员");
    }
}
class Logistics extends Staff implements Working{

    public Logistics(String name) {
        super(name);
    }

    @Override
    public void working() {
        System.out.println(getName()+"后勤保障");
    }
}
