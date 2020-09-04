package IO.Decorator;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description  使用装饰者模式，避免了继承结构越来越复杂
 *               AWorker 为装饰者，plumber 为被装饰者
 * @Version
 */
public class Test {
    public static void main(String[] args) {
        //A公司水管工
        Plumber plumber = new Plumber();
        AWorker aWorker = new AWorker(plumber);//plumber向上转型为worker；
        aWorker.doSomework();

        //A公司木匠
        Carpenter carpenter = new Carpenter();
        AWorker aWorker1 = new AWorker(carpenter);
        aWorker1.doSomework();


    }
}
