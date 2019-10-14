package com.oops.asr.remote

/**
 * Wrapper around Exceptions used to manage default errors.
 */
class DefaultError(var code: Int, override var message: String?) : Throwable(message) {
    var status = false
}
