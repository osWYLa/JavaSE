package MianArgs;

/**
 * @author wyl
 * @create 2020-08-18
 * @Description
 *              可以在Run中的 Edit Configuration 中的 Program arguments中设置
 * @Version
 */
public class MainArgsTest {
    public static void main(String[] args) {
        for (String string: args) {
            System.out.println(string);
        }
    }
}
