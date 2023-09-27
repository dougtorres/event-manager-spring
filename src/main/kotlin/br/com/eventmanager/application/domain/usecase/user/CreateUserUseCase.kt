package br.com.eventmanager.application.domain.usecase.user

import br.com.eventmanager.application.app.models.UserModel
import br.com.eventmanager.application.domain.dataprovider.user.CreateUserDataProvider
import org.springframework.stereotype.Component

@Component
class CreateUserUseCase(
    private val createUserDataProvider: CreateUserDataProvider,
    private val validateUserDocumentUseCase: ValidateUserDocumentUseCase
) {

    fun apply(user: UserModel) {

        validateUserDocumentUseCase.apply(user.document)
        createUserDataProvider.create(user)

    }

}