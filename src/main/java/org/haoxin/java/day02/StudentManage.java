package org.haoxin.java.day02;

/**
 * @author huolibin@haoxin.cn
 * @date Created by sheting on 2019/12/3 16:34
 */
public class StudentManage {
    public static void main(String[] args) {
        Student stu1 = new Student("小米1",1,33,523.6f);
        Student stu2 = new Student("小米2",2,43,234.6f);
        Student stu3 = new Student("小米3",3,19,343.6f);
        Student stu4 = new Student("小米4",4,23,765.6f);

        Student[] students = new Student[4];
        students[0] =stu1;
        students[1] =stu2;
        students[2] =stu3;
        students[3] =stu4;

        //根据成绩排序
        for (int i = 0; i < students.length-1; i++) {
            for (int j = 0; j < students.length-1-i; j++) {
                if (students[j].score < students[j+1].score){
                    Student tmp = students[j];
                    students[j] =students[j+1];
                    students[j+1] = tmp;
                }
            }
        }


        //打印
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
