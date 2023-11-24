package com.devjeong.translator_kmm.testing

import com.devjeong.translator_kmm.core.domain.language.Language
import com.devjeong.translator_kmm.translate.domain.translate.TranslateClient

class FakeTranslateClient: TranslateClient {

    var translateText = "test translation"
    override suspend fun translate(
        fromLanguage: Language,
        fromText: String,
        toLanguage: Language
    ): String {
        return translateText
    }
}