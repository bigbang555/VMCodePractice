package com.zy.methodarea;

public class RuntimeConstantPoolOOM1 {

    public static void main(String[] args) {
        String str1 = new StringBuffer("计算机").append("软件").toString();
        String intern = str1.intern();

        System.out.println(intern == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        String intern1 = str2.intern();
        System.out.println(intern1 == str2);
    }

}
