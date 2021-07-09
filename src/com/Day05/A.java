package com.Day05;

public class A {
    public static void main(String[] args) {
        room a=new room();
        room b=new room();
        room c=new room();
        room d=new room();
        room[][] rooms={{a,b},
                {c,d}};
        for(int i=0;i<rooms.length;i++){
            for(int j=0;j<rooms[i].length;j++){
                System.out.println(rooms[i][j]);
            }
        }
    }

}
