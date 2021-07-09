package com.Day05;

import java.util.Objects;

class room{
    private Integer id;
    private  String name;
    private boolean stauts;

    @Override
    public String toString() {
        return "【" +
                "房间号=" + id +
                ", 房间类型='" + name + '\'' +
                ", 是否空闲=" + (stauts ? "空闲":"占用" )+
                '】';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        room room = (room) o;
        return stauts == room.stauts && Objects.equals(id, room.id) && Objects.equals(name, room.name);
    }

    public room() {
    }

    public boolean isStauts() {
        return stauts;
    }

    public void setStauts(boolean stauts) {
        this.stauts = stauts;
    }

    public room(Integer id, String name, boolean stauts) {
        this.id = id;
        this.name = name;
        this.stauts = stauts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
