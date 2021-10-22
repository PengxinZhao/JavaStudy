/**
 * 关于字面值：
 *      * 字面值：
 *          - 10/100
 *          - "abc"
 *          - 'a'
 *          - true/false
 *      * 字面值就是数据
 *      * 字面值是java源程序的组成部分之一，包括标识符和关键字他们都是java源程序的组成部分
 *      * 数据再显示世界当中是分门别类的，所以数据在计算机编程语言中也是有类型的：【数据类型】
 *          - 10、100 属于整数型字面值
 *          - 3.14 属于浮点型字面值
 *          - true、flase 属于布尔型字面值
 *          - "abc" 属于字符串型字面值
 *          - 'A'、'人'属于字符型字面值
 *      * 注意：
 *          java语言当中所有的字符串型字面值必须使用双引号括起来
 *          java语言当中所有的字符型字面值都必须使用单引号括起来
 *
 * 总结：
 *      - classpath
 *      - 注释
 *      - public class和class的区别
 *      - 字面值
 *      - 关键字
 *      - 标识符
 */
public class ConstTest01 {

    public static void main(String[] args) {

        System.out.println("abc");

        System.out.println("最近过得怎样？");

        System.out.println(10);

        System.out.println(false);

        System.out.println('A');

        //编译报错。因为单引号中只能存放单个字符
//        System.out.println('ABC');

    }
}
