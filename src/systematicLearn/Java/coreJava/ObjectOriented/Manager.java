package systematicLearn.Java.coreJava.ObjectOriented;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/7 14:25<br/>
 * @author lnh<br />
 */

/*
* 属性和方法可以继承    能不能继承和访问是两回事
* 构造器方法是不能继承的
*
* 子类构造器一定要调用父类的构造器
*       1.隐式调用
*               子类构造器隐式的调用父类无参的构造器
*       2.显式调用
*               如果父类无无参构造器，就必须显示的调用父类的其他的构造器
*               super(......);
*       3.调用父类的构造器时，super必须放在第一行
*
*
*
* ***************   this 不能调用本类的构造器   >>>>>>>  super  this  不同时出现     因为每一个都调用过父类构造器  **********
*
* 类单继承
*
* 根据范围大小继承      单继承
*/
public class Manager extends Employee{
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public  void  work(String msg){
        super.work(msg);
        System.out.println("管理项目");
    }

    public Manager(String title) {
        super();
        this.title = title;
    }

    public Manager(int id, String name, String gender, int age, String iphone, String salary, String title) {
        super(id, name, gender, age, iphone, salary);
        this.title = title;
    }
}
