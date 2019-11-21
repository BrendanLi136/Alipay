package com.test.api.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: Brendan Li
 * @description
 * @Date: 2019/11/21
 */

public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101700706985";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDIbAp5hBMjUp5a8FN2Em48Je8W30miw9QL981uX6JGIFM6WgH/JKulepW9EgfBFe7V23hbIfcrZuEBCTrhVQxVIvRp2sZ9Xmo8ZN2EFcRYSVkenuAJJBXjmaKX7t9wcaoFs3cOhwWKlroq+6V5KWb70ZWmNMWRUnhrDPthxSiTBLyXPRMeLbP/ItBA9yW77nkTjZTchA+rGptdDreLF3BG+oQWgJRR5o+s7Km+fAdBF0eEzJZgXAiT7/BNCVQfnx1BwZwzsuHDu4BjgpA6OchIH8HB1CWPSOo1yekCLHlRMsNMCZTFBme08mOf0yzcgmujQZYgS7B7dKSgqEz5jzIbAgMBAAECggEBAMUZCwwJiNCZ9UU1Rr68zU+1dnUlzUKWFrhWT96Vif4w1+hwj7ock/i+nvc6/gkyypfhp3Dn7CzwlaHxM8hZXTF0mKxpC/5KlWsjPn0g8uBn8Y6da3FR3Xzgn/eOYIoyHaRRo2nT+u0Z4adXppmKz84hhGvZRdnuIqIUODskKwy4Q4vR5eVJY2uuw76ypIAvKhBC3FST19vp38pp8vkQd806P/sd+PYZXjohisGFlN8dUA6HN9YpFdQa7MdEpRG+warGsBWlqGo2z0glusgtjBapdLb/FCHnhbIkGWwqlYqLnQk/sXx/BXyxuuNMYO/Zb5Zw1y1jXjHNo2TS4DjcVIECgYEA77C9Tn7/EFUzjOTLKFrZw2nzWV5c8v94WfkkVGiPOGohOYK1Lmswru/AFJRi8P6AuOIrQ8ZMMgK71jvsMlsSo4IzJrtLPMOyqKllqgLcPLU5S2mRj4O8xmKZHHhln+ZO3tevwQtauBVYzE979Rf9AllbdEDPQcn3bJMwiash06ECgYEA1g9FSM7BKo0UrKNRavUa/hFVWrUiLUxql40jhiH8dh9FAlPuhthk0Ibmk0sYvGCXqCDv3W2cWKPOQylAGcY/3VaAcSW7L1T+Blbk/BY8reI9fir+xTq6o3sRKslUcmS2iHMwKkCLVmlulUizizI2Xoptckhe04QGhVDE/+nL7DsCgYEAveGXtq2oxnmYww8lWizOwp4WqD+3BtIXt79FZpEGlLyO4Y6IleNYx90qn6MF1sDnnI+fkqtvBVdhEtCZxzKay2mDuDU730FxMWgxH8PwUS+H2hQhuj20uLy3avR+HXRIGwVnOFkUXyyaEhENtBZy2v+LEced6RJkrmDUXNtzisECgYBfpF8OkuKYAoU0RZyBL5ap4lDCwJ/OoZAWuscejVzh4kLRMXMn6NPSoBOxyCH7OSVJx72kr+7lY/sq4ulzGrM6UAX/iB5EnbMKXhTd1YmzH5zeHJPMx9rQZJJdDaufmQQ9n0nr9v7K0zzHkr41+W91emBAabmExD6tnlMHDQ1CNQKBgBfsBq5mKpdXxHq6WCb4BxXWinCX/gZ/AimblienhBkx4LNi81N0U+PweIDxwCDvE+GS1s1vZ9Ieupvd82Coe/yP9oJNUT9+rU9OXtWQ0EgDwTjB8Dtf15TS6N1jOkyJfaWahFcjnK9XtSBd1OlNTdibqdRjnw7iG46Me38mxO8u";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoWIL8Fe6gkI9ZoOH8W1XIu+zL2Fm+xqQaKPTnu5hKjeIHf+5XRbuCwRcSullG1eduI+ka3EYGUZYM4ev9rN/1YBpiI75H5UeU4pAAgrw+T1+xeocbzUqO9R1MO9P3z/MArsjG7AB410oga60dZGB3bZRq70TGu15xEJngdIuijKcrmiPbc8gpefOMh5fRusCk37GlbJbAp5RkpHzCmEGT7yABdu5Rww46XIn8aIHCs6lxdZDdyqBujzAQCojkLsqJPKxYPJenr6TddHNcsifdEuYZATg5fljVZQr7eAlvq4GrKVfejaTtgWtv672dAtTI+x3KI2r5xw0qsFqv+q0uwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/alipay/anotify_url";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/alipay/return_url";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关 - 注：沙箱使用 alipaydev , 非 alipay
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "D:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

