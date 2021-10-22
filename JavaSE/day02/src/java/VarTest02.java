/**
 *  关于java语言的变量：
 *      1、在方法体中的java代码，是遵守自上而下的顺序依次执行的，逐行执行
 *          第一行；
 *          第二行；
 *          第三行；
 *          特点：第二行的代码必须完整的结束之后，第三行才会执行
 *      2、在同一个作用域当中，变量名不能重名，但变量可以重新赋值
 *
 */
public class VarTest02 {

    public static void main(String[] args) {

        int i = 100;

        System.out.println(i);

        //以下代码顺序有错误，先声明再赋值访问
        /*System.out.println(k);

        int k = 100;*/


    }
}
