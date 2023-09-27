package br.com.eventmanager.application.domain.usecase.user

import br.com.eventmanager.application.domain.dataprovider.user.ValidateDocumentUserDataProvider
import org.springframework.stereotype.Component

@Component
class ValidateUserDocumentUseCase(
    private val validateDocumentUserDataProvider: ValidateDocumentUserDataProvider
) {

    fun apply(document: String) {

        validateDocumentUserDataProvider.validate(document)

    }

}