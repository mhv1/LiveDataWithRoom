/*
 * Copyright (C) 2018 Milan Herrera
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mhv.livedatawithroomsample.viewmodels

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.mhv.livedatawithroomsample.data.MessageRepository
import com.mhv.livedatawithroomsample.models.Message

class MessageListViewModel internal constructor(
        private val messageRepository: MessageRepository) : ViewModel() {

    fun getAllMessages(): LiveData<List<Message>> = messageRepository.getAllMessages()

    fun insertMessage(message: Message) {
        messageRepository.insert(message)
    }

    fun deleteAllMessages() {
        messageRepository.deleteAllMessages()
    }

    fun deleteMessage(message: Message) {
        messageRepository.deleteMessage(message)
    }
}