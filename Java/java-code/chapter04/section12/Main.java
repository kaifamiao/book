package chapter04.section12;

// chapter04/section12
public class Main {

    public static void main(String[] args) {
        /*
         * 定义3个班级，第1个班级2名学生，第2个班级3名学生，第3个班级2名学生
         * 初始化3个班级所有的学生成绩
         */
        int[][] scores = {
                {67, 75},
                {78, 82, 93},
                {71, 72}
        };

        // 遍历二维数组，计算每个班的总成绩
        for (int i = 0; i < scores.length; i++) {
            // 定义保存总成绩的变量total
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            System.out.println((i + 1) + "班" + "总成绩" + total);
        }
    }
}
