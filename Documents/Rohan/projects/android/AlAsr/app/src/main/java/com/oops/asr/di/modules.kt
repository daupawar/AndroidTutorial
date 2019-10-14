package com.oops.asr.di

import app.mobi.getassist.v2.remote.RestServiceFactory
import com.oops.asr.data.AppDataRepository
import com.oops.asr.data.respository.DataRepository
import com.oops.asr.data.source.DataStoreFactory
import com.oops.asr.data.source.DataStoreRemote
import com.oops.asr.executor.JobExecutor
import com.oops.asr.executor.PostExecutionThread
import com.oops.asr.executor.ThreadExecutor
import com.oops.asr.interactor.GetMasjidListCase
import com.oops.asr.remote.RemoteImpl
import com.oops.asr.ui.UiThread
import com.oops.asr.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


/**
 * ༼-つ-◕_◕-༽つ
 * @author Rohan on 14/10/19.
 */
val applicationModule = module(override = true) {

    single { JobExecutor() as ThreadExecutor }
    single { UiThread() as PostExecutionThread }

    factory { RestServiceFactory.makeRestService() }

    /**
     * user injection
     */
    factory<DataStoreRemote> { RemoteImpl(get()) }
    factory { DataStoreFactory(get(), get()) }
    factory<DataRepository> { AppDataRepository(get()) }
}

val interactors = module(override = true) {
    factory { GetMasjidListCase(get(), get(), get()) }
}

val viewModels = module(override = true) {

    viewModel { HomeViewModel(get()) }
}

