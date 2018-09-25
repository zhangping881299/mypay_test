package com.test;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main
{
    public static void main( String[] args ) throws InvalidKeySpecException, SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException {

        //2.1	统一下单
        run(Builder.buildFuiou21(), Const.fuiou_21_url);
//        //2.2	条码支付
//        run(Builder.buildFuiou22(), Const.fuiou_22_url);
    }

    public static void run(Map<String, String> map, String url) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException, SignatureException {
        Map<String, String> reqs = new HashMap<>();
        Map<String, String> nvs = new HashMap<>();

        reqs.putAll(map);

        String sign = Utils.getSign(reqs);
        reqs.put("sign", sign);

        Document doc = DocumentHelper.createDocument();
        Element root = doc.addElement("xml");

        Iterator it=reqs.keySet().iterator();
        while(it.hasNext()){
            String key = it.next().toString();
            String value = reqs.get(key);

            root.addElement(key).addText(value);
        }

        String reqBody = "<?xml version=\"1.0\" encoding=\"GBK\" standalone=\"yes\"?>" + doc.getRootElement().asXML();

        System.out.println("==============================待编码字符串==============================\r\n" + reqBody);

        reqBody = URLEncoder.encode(reqBody, Const.charset);

        System.out.println("==============================编码后字符串==============================\r\n" + reqBody);

        nvs.put("req", reqBody);

        StringBuffer result = new StringBuffer("");

        HttpUtils httpUtils = new HttpUtils();
        httpUtils.post(url, nvs, result);

        System.out.println("==============================输出字符串==============================\r\n" + URLDecoder.decode(result.toString(), Const.charset));

    }
}
