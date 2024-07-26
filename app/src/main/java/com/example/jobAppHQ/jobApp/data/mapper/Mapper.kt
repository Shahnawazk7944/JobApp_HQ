package com.example.jobAppHQ.jobApp.data.mapper

import com.example.jobAppHQ.jobApp.domain.model.ApiError
import com.example.jobAppHQ.jobApp.domain.model.NetworkError
import java.io.IOException
import retrofit2.HttpException

fun Throwable.toNetworkError(): NetworkError {
    val error = when (this) {
        is IOException -> ApiError.NetworkError
        is HttpException -> ApiError.UnknownResponse
        else -> ApiError.UnknownError
    }
    return NetworkError(
        error = error,
        t = this
    )
}