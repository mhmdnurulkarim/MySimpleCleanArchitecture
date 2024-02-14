package com.mhmdnurulkarim.mysimplecleanarchitecture.data

import com.mhmdnurulkarim.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}