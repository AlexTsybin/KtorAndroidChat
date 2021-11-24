package com.alextsy.ktorandroidchat.data.remote

import com.alextsy.ktorandroidchat.data.remote.dto.MessageDto
import com.alextsy.ktorandroidchat.domain.model.Message
import io.ktor.client.*
import io.ktor.client.request.*

class MessageServiceImpl(
    private val client: HttpClient
) : MessageService {

    override suspend fun getAllMessages(): List<Message> {
        return try {
            client.get<List<MessageDto>>(MessageService.Endpoints.GetAllMessages.url)
                .map { it.toMesssage() }
        } catch (e: Exception) {
            emptyList()
        }
    }
}