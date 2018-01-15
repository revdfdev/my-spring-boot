package com.merkmod.kotlindemo.kotlindemo.models

import com.google.gson.annotations.SerializedName


open class Articles(
        @SerializedName("status")
        var status: String? = null,
        @SerializedName("totalResults")
        var totalResults: Int? = null,
        @SerializedName("articles")
        var articles: List<Article>? = null)


open class Article(
        @SerializedName("source")
        var source: Source? = null,
        @SerializedName("author")
        var author: String? = null,
        @SerializedName("title")
        var title: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("url")
        var url: String? = null,
        @SerializedName("urlToImage")
        var urlToImage: String? = null,
        @SerializedName("publishedAt")
        var publishedAt: String? = null)

open class Source(
        @SerializedName("id")
        var id: String? = null,
        @SerializedName("name")
        var name: String? = null
)


open class ErrorHandler(
		@SerializedName("status") var status: String? = null, //error
		@SerializedName("code") var code: String? = null, //apiKeyMissing
		@SerializedName("message") var message: String? = null //Your API key is missing. Append this to the URL with the apiKey param or use the x-api-key HTTP header.
)