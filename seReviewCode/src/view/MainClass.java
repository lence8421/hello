package view;

import model.User;

import java.util.Scanner;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/27 21:34
 */
public class MainClass {
    public static void main(String[] args) {
        new MainInterface().show();
    }
}

class MainInterface{
    public  void show(){
          System.out.println("==================图书管理系统===============");
        System.out.print("\t1 图书查询\n\t2 读者登录\n\t3 管理员登录\n\n请输入你的操作：");
        int counter = 0; //计数器

        Scanner sc = new Scanner(System.in);

        while (true) {
            if (counter == 5){
                System.out.println("程序结束！！！");
                return;
            }
            //获取用户输入
            int choise = sc.nextInt();
            switch (choise){
                case 1:
                    //System.out.print("图书查询：");
                  //  new Books().findBooks();
                    return;
                case 2:
                    System.out.print("读者登录：");
                    new User();
                    return;
                case 3:
                    System.out.print("管理员登录：");
                    return;
                default: System.out.print("非法输入请从新输入:" );
                    counter++;
                    continue;
            }
        }
    }
}