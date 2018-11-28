package com.mpq.demo.controller;

import com.mpq.demo.entity.Student;

/**
 * Demo class
 *
 * @author keriezhang
 * @date 2016/10/31
 */
public class TestController {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(1);
        student.setName("小孩子");
        student.setAddress("上海市浦东区");
//        System.out.println(student.toString());
//        String success = "{\"Header\":{\"errorCode\":\"0\",\"errorMsg\":\"接收成功\"}}";
//        JSONObject jaJsonObject = JSON.parseObject(success);
//        Object returnStr = jaJsonObject.get("Header");
//        System.out.println(returnStr);
//        JSONObject jaJson = JSON.parseObject(returnStr.toString());
//        System.out.println(jaJson);
//        String code = (String) jaJson.get("errorCode");
//        System.out.println(code);
    }
}
