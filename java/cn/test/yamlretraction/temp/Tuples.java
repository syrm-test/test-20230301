package cn.test.yamlretraction.temp;

/**
 * A
 *
 * @author 冰凝
 * @date 2023-03-01 17:21
 */
@SuppressWarnings("unused")
public record Tuples<A, B>(A a, B b) {

    public static void m() {
        System.out.println("m");
    }

    public static void m2() {
        System.out.println("m");
    }

}
