package com.lucas.pojo;

public class Users {
    private String name;
    private int no;

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Users() {
    }

    public Users(String name, int no) {
        this.name = name;
        this.no = no;
    }
}
