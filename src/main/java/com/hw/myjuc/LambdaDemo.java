package com.hw.myjuc;



/**
 * ClassName: LambdaDemo
 * Package: com.hw.myjuc
 * Description:
 *
 * @Author Hacker by HW
 * @Create 2024/8/5 19:42
 * @Version 1.0
 *
 *
 *      copy小括号 写死右箭头 落地大括号
 */
interface Test1
{
//    void test1();
    int add(int a, int b);
}
public class LambdaDemo {
    public static void main(String[] args) {
//        Test1 t1 = new Test1() {
//            @Override
//            public void test1() {
//                System.out.println("---Test1");
//            }
//        };
//        t1.test1();
//    }
//        Test1 t2 = () -> System.out.println("---Test2");
//        t2.test1();
//    }
        Test1 t3 = (a, b) -> {
            int result = a + b;
            return result;
        };
        System.out.println(t3.add(1, 2));
    }
}