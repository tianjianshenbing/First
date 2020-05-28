package com.example.common.util.Lambda.lumbdTest.lambdaTestDemo_02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoTest {
    public static void main(String[] args) {
        List<StudentInfo> studentList = new ArrayList<>();
        studentList.add(new StudentInfo("李小明",true,18,1.76, LocalDate.of(2001,3,23)));
        studentList.add(new StudentInfo("张小丽",false,18,1.61,LocalDate.of(2001,6,3)));
        studentList.add(new StudentInfo("王大朋",true,19,1.82,LocalDate.of(2000,3,11)));
        studentList.add(new StudentInfo("陈小跑",false,17,1.67,LocalDate.of(2002,10,18)));

        StudentInfo.printStudents(studentList);
        //从对象列表中提取一列(以name为例)
        List<String> nameList = studentList.stream()
                .map(StudentInfo::getName)
                .collect(Collectors.toList());
        //提取后输出name
        nameList.forEach(s-> System.out.println(s));
    }
}
