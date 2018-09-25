package com.test;

/**
 * Created by Ricky on 2016/11/19.
 */
public class Const {

    //编码
    public static String charset = "GBK";

    //公钥
    public static String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCYAMw/HxLwR0E8sVBHivet5o84jFhu58aYvqQzHbVompHOsVYYW2oqS2h6OMFSPdgNsK96bRkNf2LAEhB5t5tsBjqU9r629i5/0u5c9UoY0ymk/FOqyoAnaUDR1Li4QUJaSXq9pnGBMxv5xs3MmpTgoFwv+gskoiQliZj8keOWyQIDAQAB";

    //私钥
    public static String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJgAzD8fEvBHQTyxUEeK963mjziM" +
            "WG7nxpi+pDMdtWiakc6xVhhbaipLaHo4wVI92A2wr3ptGQ1/YsASEHm3m2wGOpT2vrb2Ln/S7lz1" +
            "ShjTKaT8U6rKgCdpQNHUuLhBQlpJer2mcYEzG/nGzcyalOCgXC/6CySiJCWJmPyR45bJAgMBAAEC" +
            "gYBHFfBvAKBBwIEQ2jeaDbKBIFcQcgoVa81jt5xgz178WXUg/awu3emLeBKXPh2i0YtN87hM/+J8" +
            "fnt3KbuMwMItCsTD72XFXLM4FgzJ4555CUCXBf5/tcKpS2xT8qV8QDr8oLKA18sQxWp8BMPrNp0e" +
            "pmwun/gwgxoyQrJUB5YgZQJBAOiVXHiTnc3KwvIkdOEPmlfePFnkD4zzcv2UwTlHWgCyM/L8SCAF" +
            "clXmSiJfKSZZS7o0kIeJJ6xe3Mf4/HSlhdMCQQCnTow+TnlEhDTPtWa+TUgzOys83Q/VLikqKmDz" +
            "kWJ7I12+WX6AbxxEHLD+THn0JGrlvzTEIZyCe0sjQy4LzQNzAkEAr2SjfVJkuGJlrNENSwPHMugm" +
            "vusbRwH3/38ET7udBdVdE6poga1Z0al+0njMwVypnNwy+eLWhkhrWmpLh3OjfQJAI3BV8JS6xzKh" +
            "5SVtn/3Kv19XJ0tEIUnn2lCjvLQdAixZnQpj61ydxie1rggRBQ/5vLSlvq3H8zOelNeUF1fT1QJA" +
            "DNo+tkHVXLY9H2kdWFoYTvuLexHAgrsnHxONOlSA5hcVLd1B3p9utOt3QeDf6x2i1lqhTH2w8gzj" +
            "vsnx13tWqg==" ;

    //机构号
    public static String ins_cd = "08A9999999";

    //商户号
    public static String mchnt_cd = "0002900F0370588";

    //终端号
    public static String term_id = "";

    //终端IP
    public static String term_ip = "127.0.0.1";

    //异步通知
    public static String notify_url = "http://www.wrx.cn";

    //下单
    public static String fuiou_21_url = "http://116.239.4.195:28164/preCreate";
    //扫码
    public static String fuiou_22_url = "http://116.239.4.195:28164/micropay";
    //查询
    public static String fuiou_23_url = "http://116.239.4.195:28164/commonQuery";
    //退款
    public static String fuiou_24_url = "http://116.239.4.195:28164/commonRefund";
    //资金划拨信息
//    public static String fuiou_xx_url = "http://116.239.4.195:28164/queryChnlPayAmt";
    //查询可提现资金
    public static String fuiou_27_url = "http://116.239.4.195:28164/queryWithdrawAmt";
    //查询手续费
    public static String fuiou_28_url = "http://116.239.4.195:28164/queryFeeAmt";
    //提现
    public static String fuiou_29_url = "http://116.239.4.195:28164/withdraw";

}
