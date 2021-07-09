package jiepu.Java.homework.Day15;

/**
 * @author lnh
 * @date 2021年06月20日 12:59
 */
class User{
    protected int id;//id号
    public String name; //用户名
    private String password;//密码

    boolean checkName(String name){
        if (name.equals(this.name)){
            return true;
        }
        return false;
    }
    public User getName(String name){
        if (name.equals(this.name)){
            return this;
        }
        return null;
    }
    public void doSomething(){
        System.out.println("nothing");
    }
    public void doSomething(String name,String password){
        System.out.println("name="+name+"\tpassword="+password);
    }
    public void doSomething(int id,String name,String password){
        System.out.println("id="+id+"\tname="+name+"\tpassword="+password);
    }
}
