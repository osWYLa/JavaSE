package IO.Decorator;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description
 * @Version
 */
public class AWorker implements Worker{
    //不使用继承
    private Worker worker;

    public AWorker(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void doSomework() {
        System.out.println("先说你好");
        worker.doSomework();
    }
}
