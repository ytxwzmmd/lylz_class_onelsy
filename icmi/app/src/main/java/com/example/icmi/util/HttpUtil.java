package com.example.icmi.util;
import okhttp3.OkHttpClient;
import okhttp3.Request;
/**
 * 发送网络请求获取到接口的数据并且接收返回数据
 */
public class HttpUtil {
    /**
     * 发送请求
     */
    public static void sendOkHttpRequest(
            String address,
            okhttp3.Callback callback){
        //实例化客户端对象
        OkHttpClient client = new OkHttpClient();
        //发起请求
        Request request = new Request.Builder().url(address).build();
        //处理回调
        client.newCall(request).enqueue(callback);
    }

}
