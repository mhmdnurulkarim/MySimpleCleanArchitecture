package com.mhmdnurulkarim.mysimplecleanarchitecture.data

import com.mhmdnurulkarim.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) = MessageEntity("Hello $name! Welcome to Clean Architecture")
}