package com.sunny.rx.http;

import android.util.Log;

import com.google.gson.Gson;
import com.sunny.rx.entity.CommonResponse;

import java.io.IOException;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * Created by sunny on 2016/3/17.
 */
class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final Gson gson;
    private final Type type;

    GsonResponseBodyConverter(Gson gson, Type type) {
        this.gson = gson;
        this.type = type;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        String response = value.string();
            Log.d("Network", "response>>" + response);
            //httpResult 只解析result字段
            CommonResponse httpResult = gson.fromJson(response, CommonResponse.class);
            //
            if (httpResult.getStatus() != 200) {
                throw new ApiException(100);
            }
            return gson.fromJson(response, type);
    }
}
