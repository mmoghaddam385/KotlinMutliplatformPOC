package com.moghies.domain

expect fun getPlatformName(): String

fun getSentence() = "What in tarnartion is an ${getPlatformName()}"
