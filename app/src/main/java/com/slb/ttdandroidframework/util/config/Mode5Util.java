package com.slb.ttdandroidframework.util.config;

import com.slb.ttdandroidframework.command.mode5.Service5Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by juan on 2018/9/16.
 */

public class Mode5Util {

    public static String getBankSensorNameForIndex(int i){
        String name = null;
        switch(i){
            case 0:
                return "Bank 1 - 传观器 1";
            case 1:
                return "Bank 1 - 传观器 2";
            case 2:
                return "Bank 2 - 传观器 1";
            case 3:
                return "Bank 3 - 传观器 2";
            case 4:
                return "Bank 3 - 传观器 1";
            case 5:
                return "Bank 3 - 传观器 2";
            case 6:
                return "Bank 4 - 传观器 1";
            case 7:
                return "Bank 4 - 传观器 2";

        }
        return name;
    }

    public static List<Service5Command> getService5CommandForIndex(int i){
        List<Service5Command> list = null;
        switch(i){
            case 0:
                list = getService5Command00();
                break;
            case 1:
                list = getService5Command01();
                break;
            case 2:
                list = getService5Command02();
                break;
            case 3:
                list = getService5Command03();
                break;
            case 4:
                list = getService5Command04();
                break;
            case 5:
                list = getService5Command05();
                break;
            case 6:
                list = getService5Command06();
                break;
            case 7:
                list = getService5Command06();
                break;
        }
        return list;
    }

    public static List<Service5Command> getService5Command00(){
        List<Service5Command> list = new ArrayList<>();
        list.add(new Service5Command("05 01 01"));
        list.add(new Service5Command("05 02 01"));
        list.add(new Service5Command("05 03 01"));
        list.add(new Service5Command("05 04 01"));
        list.add(new Service5Command("05 05 01"));
        list.add(new Service5Command("05 06 01"));
        list.add(new Service5Command("05 07 01"));
        list.add(new Service5Command("05 08 01"));
        list.add(new Service5Command("05 09 01"));
        list.add(new Service5Command("05 0a 01"));
        return list;
    }

    public static List<Service5Command> getService5Command01(){
        List<Service5Command> list = new ArrayList<>();
        list.add(new Service5Command("05 01 02"));
        list.add(new Service5Command("05 02 02"));
        list.add(new Service5Command("05 03 02"));
        list.add(new Service5Command("05 04 02"));
        list.add(new Service5Command("05 05 02"));
        list.add(new Service5Command("05 06 02"));
        list.add(new Service5Command("05 07 02"));
        list.add(new Service5Command("05 08 02"));
        list.add(new Service5Command("05 09 02"));
        list.add(new Service5Command("05 0a 02"));
        return list;
    }

    public static List<Service5Command> getService5Command02(){
        List<Service5Command> list = new ArrayList<>();
        list.add(new Service5Command("05 01 04"));
        list.add(new Service5Command("05 02 04"));
        list.add(new Service5Command("05 03 04"));
        list.add(new Service5Command("05 04 04"));
        list.add(new Service5Command("05 05 04"));
        list.add(new Service5Command("05 06 04"));
        list.add(new Service5Command("05 07 04"));
        list.add(new Service5Command("05 08 04"));
        list.add(new Service5Command("05 09 04"));
        list.add(new Service5Command("05 0a 04"));
        return list;
    }

    public static List<Service5Command> getService5Command03(){
        List<Service5Command> list = new ArrayList<>();
        list.add(new Service5Command("05 01 08"));
        list.add(new Service5Command("05 02 08"));
        list.add(new Service5Command("05 03 08"));
        list.add(new Service5Command("05 04 08"));
        list.add(new Service5Command("05 05 08"));
        list.add(new Service5Command("05 06 08"));
        list.add(new Service5Command("05 07 08"));
        list.add(new Service5Command("05 08 08"));
        list.add(new Service5Command("05 09 08"));
        list.add(new Service5Command("05 0a 08"));
        return list;
    }

    public static List<Service5Command> getService5Command04(){
        List<Service5Command> list = new ArrayList<>();
        list.add(new Service5Command("05 01 10"));
        list.add(new Service5Command("05 02 10"));
        list.add(new Service5Command("05 03 10"));
        list.add(new Service5Command("05 04 10"));
        list.add(new Service5Command("05 05 10"));
        list.add(new Service5Command("05 06 10"));
        list.add(new Service5Command("05 07 10"));
        list.add(new Service5Command("05 08 10"));
        list.add(new Service5Command("05 09 10"));
        list.add(new Service5Command("05 0a 10"));
        return list;
    }

    public static List<Service5Command> getService5Command05(){
        List<Service5Command> list = new ArrayList<>();
        list.add(new Service5Command("05 01 20"));
        list.add(new Service5Command("05 02 20"));
        list.add(new Service5Command("05 03 20"));
        list.add(new Service5Command("05 04 20"));
        list.add(new Service5Command("05 05 20"));
        list.add(new Service5Command("05 06 20"));
        list.add(new Service5Command("05 07 20"));
        list.add(new Service5Command("05 08 20"));
        list.add(new Service5Command("05 09 20"));
        list.add(new Service5Command("05 0a 20"));
        return list;
    }

    public static List<Service5Command> getService5Command06(){
        List<Service5Command> list = new ArrayList<>();
        list.add(new Service5Command("05 01 40"));
        list.add(new Service5Command("05 02 40"));
        list.add(new Service5Command("05 03 40"));
        list.add(new Service5Command("05 04 40"));
        list.add(new Service5Command("05 05 40"));
        list.add(new Service5Command("05 06 40"));
        list.add(new Service5Command("05 07 40"));
        list.add(new Service5Command("05 08 40"));
        list.add(new Service5Command("05 09 40"));
        list.add(new Service5Command("05 0a 40"));
        return list;
    }

    public static List<Service5Command> getService5Command07(){
        List<Service5Command> list = new ArrayList<>();
        list.add(new Service5Command("05 01 80"));
        list.add(new Service5Command("05 02 80"));
        list.add(new Service5Command("05 03 80"));
        list.add(new Service5Command("05 04 80"));
        list.add(new Service5Command("05 05 80"));
        list.add(new Service5Command("05 06 80"));
        list.add(new Service5Command("05 07 80"));
        list.add(new Service5Command("05 08 80"));
        list.add(new Service5Command("05 09 80"));
        list.add(new Service5Command("05 0a 80"));
        return list;
    }
}