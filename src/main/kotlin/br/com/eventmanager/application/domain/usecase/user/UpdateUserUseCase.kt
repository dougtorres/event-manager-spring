package br.com.eventmanager.application.domain.usecase.user

import br.com.eventmanager.application.app.models.UserModel
import br.com.eventmanager.application.domain.dataprovider.user.UpdateUserDataProvider
import org.springframework.stereotype.Component

@Component
class UpdateUserUseCase(
    private val updateUserDataProvider: UpdateUserDataProvider
) {

    fun apply(user: UserModel) {

        updateUserDataProvider.update(user)

    }

}