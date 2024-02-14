package com.mhmdnurulkarim.mysimplecleanarchitecture.di

import com.mhmdnurulkarim.mysimplecleanarchitecture.data.IMessageDataSource
import com.mhmdnurulkarim.mysimplecleanarchitecture.data.MessageDataSource
import com.mhmdnurulkarim.mysimplecleanarchitecture.data.MessageRepository
import com.mhmdnurulkarim.mysimplecleanarchitecture.domain.IMessageRepository
import com.mhmdnurulkarim.mysimplecleanarchitecture.domain.MessageInteractor
import com.mhmdnurulkarim.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}