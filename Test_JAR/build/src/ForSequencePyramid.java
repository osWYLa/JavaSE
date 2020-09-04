/**
 * @author wyl
 * @create 2020-08-05
 * @Description
 * @Version
 */
public class ForSequencePyramid {
    public static void main(String[] args) {
        for (int i=1;i<5;i++)
        {
            for(int j=0;j<4-i;j++)
            {
                System.out.printf(" ");
            }
            for (int k =0;k<i;k++)
            {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
