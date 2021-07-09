package com.Day05;

public class hotel {
    private room[][] rooms;

    public hotel() {
        this.rooms = new room[3][4];

        for (int i = 0; i < this.rooms.length; i++) {
            if(i==0) {
                for (int j = 0; j < this.rooms[i].length; j++) {
                    rooms[i][j] = new room((i+1)*100+j+1,"普通房",true);
                }
            }
            if(i==1) {
                for (int j = 0; j < this.rooms[i].length; j++) {
                    rooms[i][j] = new room((i+1)*100+j+1,"天字房",true);
                }
            }
            if(i==2) {
                for (int j = 0; j < this.rooms[i].length; j++) {
                    rooms[i][j] = new room((i+1)*100+j+1,"豪华房",true);
                }
            }

        }
    }

    public hotel(room[][] rooms) {
        this.rooms = rooms;
    }

    public room[][] getRooms() {
        return rooms;
    }

    public void setRooms(room[][] rooms) {
        this.rooms = rooms;
    }

    public void print() {
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.println(rooms[i][j]);
            }
        }
    }
    public void order(int id){
        room a=rooms[id/100-1][id%100-1];
        a.setStauts(false);
        System.out.println("\n 房号"+a.getId()+"       订房成功");
    }
    public void tuifang(int id){
        room a=rooms[id/100-1][id%100-1];
        a.setStauts(true);
        System.out.println("\n 房号"+a.getId()+"       退房成功");
    }

}


