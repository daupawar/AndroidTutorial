package com.oops.asr.data

import com.oops.asr.data.respository.DataRepository
import com.oops.asr.data.source.DataStoreFactory
import io.reactivex.Single

/**
 * ༼-つ-◕_◕-༽つ
 * @author Rohan on 2019-10-14.
 */
class AppDataRepository(private val factory: DataStoreFactory) : DataRepository {
    override fun getMasjidList(params: Void): Single<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}