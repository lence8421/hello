package com.bjpowernote.array;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/13 15:42
 */
public class Test05 {
    public static void main(String[] args) {
        //1）定义数组。存放20个person对象
        Person [] array = new Person[20];
        int size = 0;
        Person p1 = new Person("丽丽",21);
        array[size++] = p1;
        array[size++] = new Person("小红",32);
        array[size++] = new Person("小花",22);
        array[size++] = new Person("小沫",26);
        array[size++] = new Person("小萨达",25);
        array[size++] = new Person("小淀粉",29);
        array[size++] = new Person("小鬼",30);

        for (int i = 0; i <size ; i++) {
            System.out.print(array[i].name + "  ");
        }
        System.out.println();
        //判断数组中是否存在名字为 小红 的person 的对象
        int index = -1;
        for (int i = 0; i <size ; i++) {
            if ("小红".equals(array[i].name)){
                index = i;
            }
        }
        if (index > 0){
            System.out.println("小红存在");
        }else{
            System.out.println("小红不存在");
        }
        //存在小红 就删除 小红对应的person对象

        if (index > 0){
            System.out.println("--------------------");
            System.arraycopy(array,index+1,array,index,array.length-index-1);
            array[size -1] =null;
            size--;
        }else{
            System.out.println("小红不存在");
        }

        for (int i = 0; i <size ; i++) {
            System.out.println(array[i]);
        }
    }
}
