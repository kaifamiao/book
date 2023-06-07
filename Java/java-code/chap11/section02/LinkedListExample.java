package chap11.section02;

// chap11/section02/Main.java
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        // 创建多个新闻标题对象
        NewTitle car1 = new NewTitle(1,"沃尔沃","晁盖");
        NewTitle car2 = new NewTitle(2,"甲壳虫","宋江");
        NewTitle car3 = new NewTitle(3,"MINI","扈三娘");
        NewTitle car4 = new NewTitle(4,"凯迪拉克","孙二娘");
        // 创建存储新闻标题的集合对象并添加数据
        LinkedList newsTitleList =new LinkedList();
        newsTitleList.add(car2);
        newsTitleList.add(car3);
        // 添加头条和末条新闻标题
        newsTitleList.addFirst(car1);
        newsTitleList.addLast(car4);
        System.out.println("头条和末条新闻标题已添加");
        // 获取头条和末条新闻标题
        NewTitle first = (NewTitle) newsTitleList.getFirst();
        System.out.println("头条新闻的标题是:"+first.getTitleName());
        NewTitle last = (NewTitle) newsTitleList.getLast();
        System.out.println("末条新闻的标题是:"+last.getTitleName());
        // 删除头条和末条新闻
        newsTitleList.removeFirst();
        newsTitleList.removeLast();
        System.out.println("头条和末条新闻已经删除");
        System.out.println("遍历所有的新闻标题");
        for(Object obj : newsTitleList) {
            NewTitle newTitle = (NewTitle) obj;
            System.out.println("新闻标题名称:"+newTitle.getTitleName());
        }
    }
}
