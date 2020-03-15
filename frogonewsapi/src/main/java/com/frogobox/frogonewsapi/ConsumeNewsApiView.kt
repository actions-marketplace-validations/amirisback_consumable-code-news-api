package com.frogobox.frogonewsapi

import android.content.Context
import com.frogobox.frogonewsapi.callback.NewsResultCallback
import com.frogobox.frogonewsapi.data.response.ArticleResponse

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * consumable-code-news-api
 * Copyright (C) 15/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogonewsapi
 *
 */
interface ConsumeNewsApiView {

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

    // Get Top Headline From Country
    fun getTopHeadlineByCountry(
        apiKey: String,
        country: String,
        callback: NewsResultCallback<ArticleResponse>
    )

    // Get Top Headline From Country and Category
    fun getTopHeadlineByCountry(
        apiKey: String,
        country: String,
        category: String,
        callback: NewsResultCallback<ArticleResponse>
    )

    // Get Top Headline From Source
    fun getTopHeadlineBySource(
        apiKey: String,
        sources: String,
        callback: NewsResultCallback<ArticleResponse>
    )

    // Get Top Headline From Source and Category
    fun getTopHeadlineBySource(
        apiKey: String,
        sources: String,
        category: String,
        callback: NewsResultCallback<ArticleResponse>
    )

    // Get Top Headline From q
    fun getTopHeadlineByQ(apiKey: String, q: String, callback: NewsResultCallback<ArticleResponse>)

    // Get Top Headline From q
    fun getTopHeadlineByQ(
        apiKey: String,
        q: String,
        category: String,
        callback: NewsResultCallback<ArticleResponse>
    )

    // Get Top Headline From Category
    fun getTopHeadlineByCategory(
        apiKey: String,
        category: String,
        callback: NewsResultCallback<ArticleResponse>
    )

    // Get Top Headline
    fun getTopHeadline(
        apiKey: String,
        q: String?,
        sources: String?,
        category: String?,
        country: String?,
        callback: NewsResultCallback<ArticleResponse>
    )

}