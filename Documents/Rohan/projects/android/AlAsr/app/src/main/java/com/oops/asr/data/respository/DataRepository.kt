package com.oops.asr.data.respository

import io.reactivex.Single

/**
 * ༼-つ-◕_◕-༽つ
 * @author Rohan on 2019-10-14.
 */
interface DataRepository {
    fun getMasjidList(params: Void): Single<String>
}