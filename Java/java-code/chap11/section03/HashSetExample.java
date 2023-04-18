package chap11.section03;

// chap11/section03/HashSetExample.java
import chap11.section02.NewTitle;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        // 创建多个新闻标题对象
        NewTitle car1 = new NewTitle(1, "沃尔沃", "晁盖");
        NewTitle car2 = new NewTitle(2, "凯迪拉克", "宋江");
        NewTitle car3 = new NewTitle(3, "甲壳虫", "扈三娘");
        NewTitle car4 = new NewTitle(4, "MINI", "孙二娘");
        // 创建存储新闻标题的集合对象并添加数据
        Set newsTitleList = new HashSet();
        // 按照顺序依次添加新闻标题
        newsTitleList.add(car1);
        newsTitleList.add(car2);
        newsTitleList.add(car3);
        newsTitleList.add(car4);
        // 获取新闻标题总数
        System.out.println("新闻标题数目为：" + newsTitleList.size() + "条");
        // 判断集合中是否包含甲壳虫新闻标题
        System.out.println("甲壳虫新闻是否存在：" + newsTitleList.contains(car3));
        // 移除甲壳虫
        newsTitleList.remove(car3);
        System.out.println("甲壳虫对象已经删除");
        System.out.println("集合是否为空：" + newsTitleList.isEmpty());
        System.out.println("遍历所有的新闻标题");
        for (Object obj : newsTitleList) {
            NewTitle newTitle = (NewTitle) obj;
            System.out.println("新闻标题名称:" + newTitle.getTitleName());
        }
    }
}
