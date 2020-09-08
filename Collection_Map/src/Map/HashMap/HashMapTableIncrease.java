package Map.HashMap;

import java.util.HashMap;

/**
 * @author wyl
 * @create 2020-09-08
 * @Description
 * @Version
 */
@SuppressWarnings("ALL")
public class HashMapTableIncrease {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        for (int i = 0; i < 16; i++) {
            hashMap.put(i, "A" + i);
        }
        for (int i = 16; i < 33; i++) {
            hashMap.put(i, "B" + i);
        }
    }
}
