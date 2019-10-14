package app.mobi.getassist.v2.remote.model

/**
 * ༼-つ-◕_◕-༽つ
 * @author Rohan on 27/02/19.
 */
data class ApiResponse<T>(
        var success: Boolean,

        var code: String,

        var message: String,

        var data: T
        )
