package VarArgs;

/**
 * @author wyl
 * @create 2020-08-10
 * @Description
 *              可变参数演示：
 *              ①类型+...
 *              ②sum中的args叫可变形参
 *              ③args可变形参的本质就是数组
 *              ④实参可以传递数组，但是需要通过数组名传递，直接传递不行；
 *              ⑤不能再定义sum(double[] args),会认为重复定义
 *
 *              关于可变形参：
 *              可变形参的实参个数可以是0或任意多个；
 *              可变参数的实参可以是数组，但需要使用数组名传递；
 *              可变参数的本质是数组；
 *              可变参数和普通类型的参数一起放在形参列表，但是必须要保证可变参数在最后；
 *              一个形参列表中只能出现一个可变参数。
 *
 * @Version
 */
public class VarArgs {
    public static void main(String[] args) {
        VarArgs varArgs = new VarArgs();

        double sum = varArgs.sum(1, 2, 3, 7); //不可以直接传递数组
        System.out.println(sum);

        //虽然可变形参不可以直接传递一个数组，但是可以传递一个数组对象的引用
        double arr[] = {1,2,3,7};
        double res = varArgs.sum(arr);
        System.out.println(res);

    }


    public double sum(double...args){
        double totalSum =0.0;
        for (int i=0;i<args.length;i++){
            totalSum+=args[i];
        }
        return totalSum;
    }
    //注意不能再这么写,重复定义了
    /*public double sum(double[] args){
        double totalSum =0.0;
        for (int i=0;i<args.length;i++){
            totalSum+=args[i];
        }
        return totalSum;
    }*/

}
