package com.oops.asr.remote

/**
 * ༼-つ-◕_◕-༽つ
 * @author Rohan on 27/02/19.
 */
object RemoteUtil {

    internal fun convertToError(code: String, message: String): DefaultError {
        return DefaultError(code.toInt(), message)
    }

    internal fun mapToken(token: String?): HashMap<String, String> {
        val map = HashMap<String, String>()
        if (!token.isNullOrEmpty()) {
            map["token"] = token
        }
        return map
    }

}