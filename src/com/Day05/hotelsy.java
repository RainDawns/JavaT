package com.Day05;

import java.util.Scanner;

public class hotelsy {
    public static void main(String[] args) {
        hotel h = new hotel();
        System.out.println("欢迎请输入功能编号");
        System.out.println("1.查看房间信息\n"+"2.订房\n"+"3.退房\n"+"4.退出\n");
        Scanner s =new Scanner(System.in);
        while (true) {
            System.out.println("请输入功能编号");

            int i = s.nextInt();
            if (i == 1) {
                h.print();
            }
            else if (i == 2) {
                System.out.println("请输入房号");
                int a = s.nextInt();
                h.order(a);

            }
            else if (i == 3) {
                System.out.println("请输入房号");
                int id = s.nextInt();
                h.tuifang(id);
            }
            else if (i == 4) {
                System.out.println("退出成功");
                return;
            }
        }
    }
}
