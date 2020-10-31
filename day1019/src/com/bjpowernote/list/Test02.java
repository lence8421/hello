package com.bjpowernote.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/19 15:25
 *  LinkedList集合
 */
public class Test02 {
    public static void main(String[] args) {
        //1）创建linkedlist集合
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("xx");
        linkedList.add("aa");
        linkedList.add("zz");
        linkedList.add("hh");
        System.out.println(linkedList);//[xx, aa, zz, hh]

        linkedList.remove("aa");
        System.out.println(linkedList);

        System.out.println(linkedList.contains("aa"));
        System.out.println(linkedList.size());
        for (String s : linkedList) {
            System.out.print(s + "   ");
        }
        System.out.println();
        for (Iterator<String> iterator = linkedList.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            System.out.print(next + "   ");
        }
        System.out.println("-------------------");
        //2) 注意: LinkedList集合也有针对索引值的操作
        linkedList.add(0,"yy");
        System.out.println(linkedList);
        System.out.println(linkedList.get(linkedList.size()- 1));//返回最后一个元素

        /*3)
                LinkedList类还实现了Deque双端队列接口, Deque双端队列接口继承了Queue队列接口, Queue继承了Colleciton
                Queue接口常用 的三个方法:
                    offer(o)表示入队就是把元素o添加到链表尾部
                    poll()表示出队,就是把链表的第一个元素删除并返回, 如果集合为空则返回null
                    peek()表示返回第一个元素,不删除, 如果集合为空则返回null
                Deque双端队列继承了Queue队列中的抽象方法, 还增加了针对第一个元素/最后一个元素的操作:
                    offerFirst(o)把为元素添加到链表头部
                    offerLast(o) 把o元素添加到链表尾部
                    pollFirst()/ pollLast()
                    peekFirst()/ peekLast()
         */

        linkedList.offer("tt");//模拟入队，就把tt添加到链表的尾部
        System.out.println(linkedList);
        String polled = linkedList.poll();//模拟出队，就把链表的第一个元素删除并返回
        System.out.println(polled);
        System.out.println(linkedList);

        System.out.println(linkedList.peek());
        System.out.println(linkedList);

        linkedList.offerFirst("ff");
        linkedList.offerLast("qq");
        System.out.println(linkedList);
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.pollLast());
        System.out.println(linkedList);

        linkedList.push("aa");
        System.out.println(linkedList);
        String pop = linkedList.pop();
        System.out.println(pop);
        System.out.println(linkedList);


    }
}
