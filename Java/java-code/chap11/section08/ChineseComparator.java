package chap11.section08;

// chap11/section08/ChineseComparator.java
import java.util.Comparator;

// 定义语文比较器
class ChineseComparator implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        if (obj1 != null && obj2 != null) {
            if (obj1 instanceof Student s1 && obj2 instanceof Student s2) {
                return s1.getChinese() - s2.getChinese();
            } else {
                throw new RuntimeException("数据类型异常");
            }
        } else {
            throw new RuntimeException("空指针异常");
        }
    }
}
