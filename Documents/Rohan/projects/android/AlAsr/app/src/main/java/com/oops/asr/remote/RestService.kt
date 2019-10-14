package com.oops.asr.remote

import app.mobi.getassist.v2.remote.model.ApiResponse
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.HeaderMap
import retrofit2.http.POST

/**
 * ༼-つ-◕_◕-༽つ
 * @author Rohan on 18/02/19.
 */
interface RestService {

    @POST("mobile/classified/insertClassified")
    fun createUpdateBuySellPost(@HeaderMap mapToken: HashMap<String, String>, @Body params: HashMap<String, String>): Single<ApiResponse<Boolean>>


}