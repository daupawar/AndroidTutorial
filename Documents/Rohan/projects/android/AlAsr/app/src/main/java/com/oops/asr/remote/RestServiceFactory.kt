package app.mobi.getassist.v2.remote

import app.mobi.getassist.BuildConfig
import app.mobi.getassist.remote.ApiConstants
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.oops.asr.remote.RestService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 *
 * ༼-つ-◕_◕-༽つ
 * @author Rohan
 * Provide "make" methods to create instances of [RestService]
 * and its related dependencies, such as OkHttpClient, Gson, etc.
 */
object RestServiceFactory {

    /**
     * makeRestService
     */
    fun makeRestService(): RestService {
        val okHttpClient = makeOkHttpClient(
                makeLoggingInterceptor(BuildConfig.DEBUG))

        return makeUserService(okHttpClient, makeGson())
    }

    fun makeChatService(): RestChatService {
        val okHttpClient = makeOkHttpClient(
                makeLoggingInterceptor(BuildConfig.DEBUG))

        return makeChatService(okHttpClient, makeGson())
    }

    /**
     * makeUserService
     */
    private fun makeUserService(okHttpClient: OkHttpClient, gson: Gson): RestService {
        val retrofit = Retrofit.Builder()
                .baseUrl(ApiConstants.DEFAULT_MONGO_URL)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
        return retrofit.create(RestService::class.java)
    }

    private fun makeChatService(okHttpClient: OkHttpClient, gson: Gson): RestChatService {
        val retrofit = Retrofit.Builder()
                .baseUrl(ApiConstants.DEFAULT_CHAT_URL)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
        return retrofit.create(RestChatService::class.java)
    }

    /**
     * makeOkHttpClient
     */
    private fun makeOkHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.MINUTES)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .addInterceptor(httpLoggingInterceptor)
                .build()
    }

    private fun makeGson(): Gson {
        return GsonBuilder().serializeNulls().setPrettyPrinting().create()
    }

    /**
     * makeLoggingInterceptor
     */
    private fun makeLoggingInterceptor(isDebug: Boolean): HttpLoggingInterceptor {
        val logging = HttpLoggingInterceptor()
        logging.level = if (isDebug)
            HttpLoggingInterceptor.Level.BODY
        else
            HttpLoggingInterceptor.Level.NONE
        return logging
    }


}