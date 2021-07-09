package com.Day11;

import java.util.Properties;

/*
* 设计理念： 将程序中需要经常变动的数据通过IO+properties 方式存放在文件中
*   然后需要改动的时候就直接去文件中改动即可
* 类似于以上文件叫做配置文件    配置文件格式   为 key和values    一般都为属性配置文件    一般以properties结尾
* Properties.load  >>>>重载
*
* spring :
* 配置文件中最好不要加多余的空格
* 不建议使用冒号   建议使用等号
*
* */
public class IOProperties {
    public static void main(String[] args) {

    }
}
