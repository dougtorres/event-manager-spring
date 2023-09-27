package br.com.eventmanager.application.domain.usecase.user

import br.com.eventmanager.application.domain.dataprovider.user.DeleteUserDataProvider
import org.springframework.stereotype.Component
import java.math.BigInteger

@Component
class DeleteUserUseCase(
    private val deleteUserDataProvider: DeleteUserDataProvider
) {

    fun apply(userId: BigInteger) {

        deleteUserDataProvider.delete(userId)

    }

}