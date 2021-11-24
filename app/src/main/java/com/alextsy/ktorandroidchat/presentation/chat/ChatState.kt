package com.alextsy.ktorandroidchat.presentation.chat

import com.alextsy.ktorandroidchat.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
)