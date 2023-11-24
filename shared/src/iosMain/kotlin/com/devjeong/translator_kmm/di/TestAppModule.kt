package com.devjeong.translator_kmm.di

import com.devjeong.translator_kmm.testing.FakeHistoryDataSource
import com.devjeong.translator_kmm.testing.FakeTranslateClient
import com.devjeong.translator_kmm.testing.FakeVoiceToTextParser
import com.devjeong.translator_kmm.translate.domain.history.HistoryDataSource
import com.devjeong.translator_kmm.translate.domain.translate.Translate
import com.devjeong.translator_kmm.translate.domain.translate.TranslateClient
import com.devjeong.translator_kmm.voice_to_text.domain.VoiceToTextParser

class TestAppModule: AppModule {
    override val historyDataSource = FakeHistoryDataSource()
    override val client = FakeTranslateClient()
    override val translateUseCase = Translate(client, historyDataSource)
    override val voiceParser = FakeVoiceToTextParser()
}