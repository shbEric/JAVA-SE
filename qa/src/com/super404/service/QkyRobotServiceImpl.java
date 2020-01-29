package com.super404.service;

import com.google.gson.Gson;
import com.super404.model.Response;
import com.super404.util.HttpUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class QkyRobotServiceImpl implements RobotService {

    private static final String apiTpl = "http://api.qingyunke.com/api.php?key=free&appid=0&msg=%s";
    private static final Gson gson = new Gson();

    @Override
    public Response qa(String msg) {
        String api = null;
        try {
            api = String.format(apiTpl, URLEncoder.encode(msg,"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        String result = HttpUtils.request(api);

        //todo 可以做逻辑判断，比如null的时候或者出错的时候
        Response response = gson.fromJson(result, Response.class);

        return response;
    }
}
