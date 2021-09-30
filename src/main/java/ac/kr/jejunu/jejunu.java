package ac.kr.jejunu;

import ac.kr.jejunu.opensource.Aes128;

public class jejunu {
    private static final String key = "1234567890123456";

    public static void main(String[] args) throws Exception {
        Aes128 aes128 = new Aes128(key);

        String enc = aes128.encrypt("0");
        System.out.println("2017108243 강성범");
        System.out.println("결과 : " + enc);

    }
}
