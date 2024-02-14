package com.mhmdnurulkarim.mysimplecleanarchitecture.data

import com.mhmdnurulkarim.mysimplecleanarchitecture.domain.IMessageRepository

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}