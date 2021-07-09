package com.Day08.exception;
/*、
*
* 异常使程序有健壮性
*
* 异常以类在java中存在
*
* 发生异常时JVM会去创建异常对象
*编译时异常    必须预先处理
* 运行时异常    可以不预先处理
*
* 异常有两种 解决办法   一种是上抛>>>>>>可能没解决       发生错误之后，上抛之后   发生错误后面的代码是不执行的
* 另一种是使用 try () {     >>>>> 一般都是解决了  把异常捕捉了   发生错误    try中不执行       进入catch             走完之后   后面的代码会继续执行
*
* }catch(){
* }
*
*
* */
public class exception {
    public static void main(String[] args) {
        try {
            System.out.println(100 / 0);
        }catch (Exception e){
            System.out.println("除法错误");
        }
        System.out.println("hello word");
    }
}
