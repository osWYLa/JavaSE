package Collection.Set.HashSet.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author wyl
 * @create 2020-09-08
 * @Description
 * @Version
 */
@SuppressWarnings("ALL")
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        Set linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奇瑞",10000.53f));
        linkedHashSet.add(new Car("奥迪",20000.53f)); //String 已经重写了hashCode 和equals
        linkedHashSet.add(new Car("奔驰",30000.53f));
        linkedHashSet.add(new Car("奇瑞",10000.53f));

        System.out.println(linkedHashSet);
    }
}
class Car{
    private String name;
    private float price;

    public Car(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Float.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
