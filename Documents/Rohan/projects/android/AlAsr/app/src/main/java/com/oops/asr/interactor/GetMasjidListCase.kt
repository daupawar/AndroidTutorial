package com.oops.asr.interactor

import com.oops.asr.data.respository.DataRepository
import com.oops.asr.executor.PostExecutionThread
import com.oops.asr.executor.ThreadExecutor
import com.oops.asr.interactor.base.SingleUseCase
import io.reactivex.Single

/**
 * ༼-つ-◕_◕-༽つ
 * @author Rohan on 2019-05-02.
 */
open class GetMasjidListCase(private val repository: DataRepository,
                            threadExecutor: ThreadExecutor,
                            postExecutionThread: PostExecutionThread) :
        SingleUseCase<String, Void>(threadExecutor, postExecutionThread) {

    public override fun buildUseCaseObservable(params: Void?): Single<String> {
        return if (params == null) {
            Single.error(IllegalArgumentException())
        } else {
            return repository.getMasjidList(params)
        }

    }
}