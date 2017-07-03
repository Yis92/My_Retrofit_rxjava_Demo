package com.sunny.rx.http;


import com.sunny.rx.entity.CommonResponse;
import com.sunny.rx.entity.StartResp;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by sunny on 16/3/9.
 */
public interface MovieService {

    @GET("index/index.php?c=index&m=other&a=web_data")
    Observable<CommonResponse<StartResp>> getTopMovie();

}
