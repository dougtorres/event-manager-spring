package br.com.eventmanager.application.domain.usecase.user

import br.com.eventmanager.application.app.models.UserModel
import br.com.eventmanager.application.domain.dataprovider.user.GetUserByDocumentDataProvider
import org.springframework.stereotype.Component

@Component
class GetUserByDocumentUseCase(
    private val getUserByDocumentDataProvider: GetUserByDocumentDataProvider,
    private val validateUserDocumentUseCase: ValidateUserDocumentUseCase
) {

    fun apply(userDocument: String): UserModel {
        validateUserDocumentUseCase.apply(userDocument)
        return getUserByDocumentDataProvider.get(userDocument)

    }

}