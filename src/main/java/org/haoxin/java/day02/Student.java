package org.haoxin.java.day02;

/**
 * @author huolibin@haoxin.cn
 * @date Created by sheting on 2019/12/3 16:02
 */
public class Student {
    String name;
    int id;
    int age;
    float score;

    public Student(String name, int id, int age, float score) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }


    @Override
    public String toString() {
        return this.name+","+this.id+","+this.age+","+this.score;
    }
}
