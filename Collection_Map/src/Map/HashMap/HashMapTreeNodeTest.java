package Map.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wyl
 * @create 2020-09-08
 * @Description
 * @Version
 */
@SuppressWarnings("ALL")
public class HashMapTreeNodeTest {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i= 1;i<=20;i++){
            User user = new User();
            hashMap.put(user,user);
            System.out.println("i= "+i);
        }
    }
}


class  User{
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
