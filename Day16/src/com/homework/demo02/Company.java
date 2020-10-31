package com.homework.demo02;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/14 21:01
 */
public class Company {
    //1)使用数组来保存员工信息
    Employee [] data;
    //2)一般情况下,会定义一个变量记录数组中元素的数量
    int size;

    //3)一般情况下在构造方法中对数组初始化
    public  Company(){
        data = new Employee[100];       //数组初始化的容量需要估算
        size = 0;
    }
    //4)也可以在构造方法中指定数组的容量
    public Company(int capacity ){
        data = new Employee[capacity];
        size = 0;
    }

    //5)定义方法,添加新员工, 需要通过参数来接收一个员工对象.
    public void add( Employee employee){
        //把参数employee接收的员工对象添加到数组中
        //一般情况下,在向数组中添加元素前,会判断数组是否已满
        if (size >= data.length ){
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size] = employee;      //把员工对象保存到数组中
        size++;                     //数组元素的数量加1
    }

    //6)显示公司中的员工信息
    public void showAll(){
        System.out.println("-----------------------");
        //遍历数组中已添加的员工对象, 不需要遍历数组中所有的元素,只需要遍历前size个员工对象
        for( int i = 0 ; i < size; i++){
            System.out.println( data[i]);
        }
    }

    //7)查找公司中是否存在指定姓名的员工
    public boolean containsByName( String  name ){
       /* //遍历data数组中存储的Employee员工对象,如果有某个员工对象的姓名与参数指定的name一样就返回true
        if (name != null) {
            for (int i = 0; i < size; i++) {
                if (name.equals(data[i].getName())) {   //数组保存员工对象姓名与参数name一样
                    return true;
                }
            }
        }else {
            for (int i = 0; i < size; i++) {
                if (data[i].getName() == null ) {       //数组保存员工对象的姓名也是null
                    return true;
                }
            }
        }
        return false;*/

        return  indexOf(name) >= 0;
    }

    //8)删除公司中指定姓名的员工
    public void deleteByName(String name){
        //返回指定姓名的员工在数组中的索引值
        int index = indexOf(name);

        if (index < 0 ){
            System.out.println("公司中没有该员工");
            return;
        }

        while ( index >= 0 ) {
            //把数组中index+1开始的元素依次向前移动
            for (int i = index; i < size - 1; i++) {
                data[i] = data[i + 1];
            }
            //把最后一个元素设置 为null
            data[size - 1] = null;
            //元素数量减1
            size--;

            //再次查看数组中是否存在指定姓名的员工
            index = indexOf(name);
        }

    }

    //定义方法返回指定员工姓名在数组中的索引值
    private int indexOf(String name) {
        //遍历数组,如果有数组存储的员工对象的姓名与参数name一样就返回该元素的下标
        if (name != null ) {
            for (int i = 0; i < size; i++) {
                if (name.equals(data[i].getName())) {
                    return i;
                }
            }
        }else {
            for (int i = 0; i < size; i++) {
                if (data[i].getName() == null) {
                    return i;
                }
            }
        }
        return -1;
    }

    //9)对员工按照年龄升序排序
    public void  sortByAge(){
        //当前数组数组中存储的Employee对象,不能像整数一样比较大小
//        Arrays.sort(对象数组, 起始索引值, 终止索引值, Comparator比较器);
        //把对象数组中[ 起始索引值, 终止索引值 ) 范围的元素进行排序, 根据Comparator比较大小
        Arrays.sort(data, 0, size, new Comparator<Employee>() {
            //在匿名内部类中重写Comparator接口的抽象方法,定义一个比较规则
            //注意: 如果第一个对象o1比第二个对象o2大, compare方法返回正数 , 对应升序排序
            //  如果第二个对象o1比第一个对象o1大, compare方法返回正数 , 对应降排序
            //只需要记住该规则即可,具体o1是哪个对象,o2是哪个对象不需要关心, 也千万别去对应具体对象
            @Override
            public int compare(Employee o1, Employee o2) {
                //o1员工的年龄大返回正数, 对应升序排序
                return o1.getAge() - o2.getAge();
            }
        });
    }

    //10)根据工资降序排序
    public void sortBySalaryDesc(){
        Arrays.sort(data, 0, size, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //如果o2的工资高返回正数
                if (o2.getSalary() > o1.getSalary() ){
                    return  1;
                }else if ( o2.getSalary() == o1.getSalary() ){
                    return  0;      //相等返回0
                }
                return -1;          //o2工资低返回负数
            }
        });
    }

}

