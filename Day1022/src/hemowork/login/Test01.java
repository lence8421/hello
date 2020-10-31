package hemowork.login;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/22 9:24
 * 1 定义Map保存<用户名,密码>,模拟用户注册与登录.
 * --------------------------主界面----------------------------------
 * 1 注册	2登录	3退出
 * 请输入你的操作: 1
 * ================用户注册====================
 * 请输入用户名: lisi
 * 该用户名已存在,请重新输入:wangwu
 * 该用户名已存在,请重新输入:feifei
 * 请输入密码: 666
 * 用户注册成功
 * --------------------------主界面----------------------------------
 * 1 注册	2登录	3退出
 * 请输入你的操作: 2
 * =============== 用户登录 ==================
 * 请输入用户名: lisi
 * 请输入密码: 666
 * 用户名或密码不正确,是否重新登录(Y/N)?
 * y
 * 请输入用户名: lisi
 * 请输入密码: 123
 * 登录成功
 * --------------------------主界面----------------------------------
 * 1 注册	2登录	3退出
 * 请输入你的操作:3
 * 程序退出
 */
public class Test01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=============主界面==============");
            System.out.println("1.注册  2.登录 3.退出");
            System.out.println("请输入你的操作：");
            int anInt = sc.nextInt();

            if(anInt == 1) {
                System.out.println("==================用户注册===========================");
                System.out.println("请输入用户名：");
                String name = sc.next();
                while (map.containsKey(name)){
                    System.out.println("该用户名已经存在，请重新输入：");
                     name = sc.next();
                }
                System.out.println("请输入密码：");
                String pass = sc.next();
                map.put(name,pass);
                System.out.println("用户注册成功！！！");
            }else if (anInt == 2){
                System.out.println("===================用户登录===========================");
                System.out.println("请输入用户名：");
                String name = sc.next();
                System.out.println("请输入密码：");
                String pass = sc.next();
                if (pass.equals(map.get(name))){
                    System.out.println("合法用户，登录成功！！！");
                }else {
                    System.out.println("用户名或密码错误！！！");
                }
            }else {
                return;
            }
        }
    }
}
