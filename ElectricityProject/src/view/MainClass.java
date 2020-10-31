package view;

import model.Commodity;
import model.Usre;

import java.util.*;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/30 9:05
 * lisi  123
 *
 */
public class MainClass {
    public static void main(String[] args) {
        new mainInterface().face();
    }
}

class mainInterface {
    static List<Commodity> commodityList = new ArrayList<>();

    {
        commodityList.add(new Commodity("1001", "Mate 30", 8900, 50000));
        commodityList.add(new Commodity("1002", "novo", 4500, 15000));
        commodityList.add(new Commodity("1003", "vivo", 8700, 36000));
        commodityList.add(new Commodity("1004", "oppo", 1200, 78000));
    }

    static Map<String, String> map = new HashMap<>();

    {
        Usre u1 = new Usre("lisi", "123");
        map.put(u1.getName(), u1.getPassword());
    }

    Scanner sc = new Scanner(System.in);

    public void face() {
        while (true) {
            System.out.println("============主界面============");
            System.out.println("1 浏览所有商品\t2 注册\t 3 登录\t4 退出");
            System.out.print("请选择你的操作：");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    show();
                    continue;
                case 2:
                    login();
                    continue;
                case 3:
                    landing();
                    continue;
                case 4:
                    return;
                default:
                    System.out.println("非法输入！！");
            }
        }
    }

    private void landing() {//登陆
        System.out.print("请输入名字：");
        String name = sc.next();
        System.out.print("请输入密码：");
        String password = sc.next();
        if (!map.containsKey(name) || !map.containsValue(password)){
            System.out.println("用户名或密码不正确，是否从新输入（Y/N）");
            String choose = sc.next();
            switch (choose){
                case "Y":
                landing();
                case "N": return;
                default:
                    System.out.println("非法输入！！");
                    return;
            }

        }
        System.out.println("登陆成功！！");
        Administration();
        return;
    }

    private void Administration() {//产品管理界面
        while (true) {
            System.out.println("*****************产品管理操作界面*******************");
            System.out.println("请选择： \t1 显示所有商品 \t2 添加商品 \t3 删除商品 \t4 修改商品 \t5 查询商品 \t6 退出 ");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    print();//显示
                    continue;
                case 2:
                    addItem();
                    continue;
                case 3:
                    deleteItem();
                    continue;
                case 4:
                    modifyItem();
                    continue;
                case 5:
                    findItem();
                    continue;
                case 6:
                    return;
                default:
                    System.out.println("非法输入");
            }
        }
    }

    private void findItem() {//查找商品
        boolean exist = false;  //定义标识表示是否存在,先假设不存在
        System.out.println("请输入要查找的商品的名字");
        String name = sc.next();
        System.out.println("---------------商品信息-------------");
        System.out.println("商品编号\t商品名称\t\t商品价格\t商品销量");
        for (Commodity commodity : commodityList) {
            if (commodity.getName().contains(name)){
                System.out.println(commodity.getNumber() + "\t" + commodity.getName() + "\t\t" + commodity.getPrice() +
                        "\t" + commodity.getSales());
                exist = true;//修改标志
            }
        }
        if (exist == false){
            System.out.println("\n您输入的商品不存在！！！");
        }
    }

    private void modifyItem() {//修改商品
        int counter = 0;
        System.out.println("请输入要修改的商品的编号：");
        String number = sc.next();
        for (Iterator<Commodity> iterator = commodityList.iterator(); iterator.hasNext(); ) {
            Commodity next = iterator.next();
            if (next.getNumber().equals(number)){
                break;
            }
            counter++;
        }
        if (counter != commodityList.size()){
            System.out.println("亲，请输入商品编号");
            String id = sc.next();
            System.out.println("亲，请输入商品名称");
            String name = sc.next();
            System.out.println("亲，请输入商品价格");
            int price = sc.nextInt();
            System.out.println("亲，请输入商品销量");
            int sales = sc.nextInt();
            commodityList.set(counter,new Commodity(id,name,price,sales));
        }else {
            System.out.println("不存在");
        }
        return;
    }

    private void deleteItem() {//删除商品
        boolean exist = false;  //定义标识表示是否存在,先假设不存在
        System.out.println("请输入要删除商品的编号：");
        String id = sc.next();
        for (Iterator<Commodity> iterator = commodityList.iterator(); iterator.hasNext(); ) {
            Commodity next = iterator.next();
            if (next.getNumber().equals(id)){
                iterator.remove();
                exist =true;
            }
        }
        //根据存在标志 判断
        if ( exist ){
            System.out.println("您输入的商品编号存在，已删除");
        }else {
            System.out.println("您输入的商品编号不存在！！！");
        }
        return;
    }

    private void addItem() {//添加商品
        System.out.println("亲，请输入商品编号");
        String id = sc.next();
        System.out.println("亲，请输入商品名称");
        String name = sc.next();
        System.out.println("亲，请输入商品价格");
        int price = sc.nextInt();
        System.out.println("亲，请输入商品销量");
        int sales = sc.nextInt();
        for (Iterator<Commodity> iterator = commodityList.iterator(); iterator.hasNext(); ) {
            Commodity next = iterator.next();
            if (next.getNumber().equals(id)){
                System.out.println("您输入的商品编号重复，请从新输入");
                addItem();
            }
        }
        commodityList.add(new Commodity(id,name,price,sales));
    }

    private void login() {//注册
        System.out.println("--------------用户注册---------------");
        System.out.print("请输入名字：");
        Usre u = new Usre();
        while (true) {
            String s = sc.next();
            if (map.containsKey(s)) {
                System.out.println("该用户名存在，请从新输入：");
                continue;
            }
            u.setName(s);
            System.out.print("请输入密码：");
            u.setPassword(sc.next());
            map.put(u.getName(),u.getPassword());
            System.out.println(s + "注册成功，请从新登陆");

            return;
        }
    }

    public void show() {//浏览所有商品
        print();
        System.out.println("请选择排序方式：1根据名称升序\t2价格升序\t3销量升序");

        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                commodityList.sort(new Comparator<Commodity>() {
                    @Override
                    public int compare(Commodity commodity, Commodity t1) {
                        return commodity.getName().compareTo(t1.getName());
                    }
                });
                print();
                return;
            case 2:
                commodityList.sort(new Comparator<Commodity>() {
                    @Override
                    public int compare(Commodity commodity, Commodity t1) {
                        return commodity.getPrice() - t1.getPrice();
                    }
                });
                print();
                return;
            case 3:
                commodityList.sort(new Comparator<Commodity>() {
                    @Override
                    public int compare(Commodity commodity, Commodity t1) {
                        return commodity.getSales() - t1.getSales();
                    }
                });
                print();
                return;
            default:
                System.out.println("非法输入！！！");
        }
    }

    public void print() {//打印显示商品信息
        System.out.println("---------------商品信息-------------");
        System.out.println("商品编号\t商品名称\t\t商品价格\t商品销量");
        for (Iterator<Commodity> commodityIterator = commodityList.iterator(); commodityIterator.hasNext(); ) {
            Commodity commodity = commodityIterator.next();
            System.out.println(commodity.getNumber() + "\t" + commodity.getName() + "\t\t" + commodity.getPrice() +
                    "\t" + commodity.getSales());
        }
    }

}