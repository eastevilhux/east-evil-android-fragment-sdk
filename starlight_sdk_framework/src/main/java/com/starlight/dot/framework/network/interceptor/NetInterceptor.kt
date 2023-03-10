package com.starlight.dot.framework.network.interceptor

import com.starlight.dot.framework.network.NetworkHelper
import okhttp3.Interceptor
import okhttp3.Response

class NetInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {

        val request = chain.request()
        val response = chain.proceed(request)


        return response.newBuilder()
            .removeHeader("Pragma") // 清除头信息，因为服务器如果不支持，会返回一些干扰信息，不清除下面无法生效
            .removeHeader("Cache-Control")
            .header("Cache-Control", "public, max-age=" + NetworkHelper.instance().httpConfig().maxAge())
            .build()
    }

}
