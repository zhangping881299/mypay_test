package com.test;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.*;

/**
 * Created by Ricky on 2016/11/20.
 */
public class Utils {

    public static Map<String, String> paraFilter(Map<String, String> map) {

        Map<String, String> result = new HashMap<>();

        if (map == null || map.size() <= 0) {
            return result;
        }

        for (String key : map.keySet()) {
            String value = map.get(key);
            if (key.equalsIgnoreCase("sign") || (key.length() >= 8 && key.substring(0, 8).equalsIgnoreCase("reserved"))) {
                continue;
            }
            result.put(key, value);
        }

        return result;
    }

    public static String createLinkString(Map<String, String> map) {

        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        String prestr = "";

        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = map.get(key);

            if (i == keys.size() - 1) {
                //拼接时，不包括最后一个&字符
                prestr = prestr + key + "=" + value;
            } else {
                prestr = prestr + key + "=" + value + "&";
            }
        }

        return prestr;
    }

    public static String getSign(Map<String, String> map) throws InvalidKeySpecException, SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException {

        Map<String, String> mapNew = paraFilter(map);

        String preSignStr = createLinkString(mapNew);

        System.out.println("==============================待签名字符串==============================\r\n" + preSignStr);

        String sign = Sign.sign(preSignStr, Const.privateKey);

        sign = sign.replace("\r\n", "");

        System.out.println("==============================签名字符串==============================\r\n" + sign);

        return sign;
    }

    public static Boolean verifySign(Map<String, String> map, String sign) throws Exception {

        Map<String, String> mapNew = paraFilter(map);

        String preSignStr = createLinkString(mapNew);

        return Sign.verify(preSignStr.getBytes(), Const.publicKey, sign);
    }

}
