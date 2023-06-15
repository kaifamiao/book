package chapter11.section08;

// chapter11/section08/MathComparator.java
import java.util.Comparator;

// 定义数学比较器
public class MathComparator implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        if (obj1 != null && obj2 != null) {
            if (obj1 instanceof Student s1 && obj2 instanceof Student s2) {
                return s1.getMath() - s2.getMath();
            } else {
                throw new RuntimeException("数据类型异常");
            }
        } else {
            throw new RuntimeException("空指针异常");
        }
    }
}
