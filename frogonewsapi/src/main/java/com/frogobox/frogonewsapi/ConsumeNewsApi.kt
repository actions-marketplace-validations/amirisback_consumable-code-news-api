package com.frogobox.frogonewsapi

import android.content.Context
import com.frogobox.frogonewsapi.data.source.NewsRemoteDataSource
import com.frogobox.frogonewsapi.data.source.NewsRepository

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
class ConsumeNewsApi(private val apiKey: String) : ConsumeNewsApiView {

    private val newsRepository = NewsRepository(NewsRemoteDataSource)

    override fun usingChuckInterceptor(context: Context) {
        newsRepository.usingChuckInterceptor(context)
    }
}