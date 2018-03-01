package com.woomoon.utils;

import java.util.Date;
import java.util.UUID;

public class Generate {

    public static void main(String[] args) {
        String ip000900100 = Generate.testGenerate("IP000900100");
        System.out.println(ip000900100);
    }

    public synchronized static String testGenerate(String num) {
        String targetNum = "";
        String firstNum = num.substring(0, 2);

        num = num.substring(2);//去掉前面的两个

        String substring = num.replaceAll("^(0+)", "");//去掉前面所有的0
        int currVal = Integer.parseInt(substring);
        currVal++;
        String str = currVal + "";
        int length = str.length();
        int countZero = 9;//如果是8个0 现在的长度是length ,减去9 得到缺少的0 ,
        int c = (countZero - length);
        if (c == 1) {
            targetNum = firstNum + "0" + currVal;
        } else if (c == 2) {
            targetNum = firstNum + "00" + currVal;
        } else if (c == 3) {
            targetNum = firstNum + "000" + currVal;
        } else if (c == 4) {
            targetNum = firstNum + "0000" + currVal;
        } else if (c == 5) {
            targetNum = firstNum + "00000" + currVal;
        } else if (c == 6) {
            targetNum = firstNum + "000000" + currVal;
        } else if (c == 7) {
            targetNum = firstNum + "0000000" + currVal;
        } else if (c == 8) {
            targetNum = firstNum + "00000000" + currVal;
        }
        return targetNum;
    }

//  String str = "0000123";
//  String newStr = str.replaceAll("^(0+)", "");
//  System.out.println(newStr);

}
