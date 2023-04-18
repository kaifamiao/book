package chap11.section10;

// chap11/section10/ArrayListExample.java
import chap11.section02.NewTitle;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        // 创建新闻标题对象
        NewTitle car1 = new NewTitle(1, "沃尔沃", "晁盖");
        NewTitle car2 = new NewTitle(2, "凯迪拉克", "宋江");
        //创建存储新闻标题的集合对象
        List<NewTitle> newsTitleList = new ArrayList<NewTitle>();
        // 按照顺序依次添加新闻标题
        newsTitleList.add(car1);
        newsTitleList.add(car2);
        // 获取新闻标题的总数
        System.out.println("新闻标题数目为:" + newsTitleList.size());
        // 遍历集合
        System.out.println("新闻标题名称为");
        for (NewTitle newTitle : newsTitleList) {
            System.out.println(newTitle.getTitleName());
        }
    }
}
