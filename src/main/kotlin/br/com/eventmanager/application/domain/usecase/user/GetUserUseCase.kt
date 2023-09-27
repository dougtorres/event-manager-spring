package br.com.eventmanager.application.domain.usecase.user

import br.com.eventmanager.application.app.models.UserModel
import br.com.eventmanager.application.domain.dataprovider.user.GetUserDataProvider
import org.springframework.stereotype.Component
import java.math.BigInteger

@Component
class GetUserUseCase(
    private val getUserDataProvider: GetUserDataProvider
) {

    fun apply(userId: BigInteger): UserModel {

        return getUserDataProvider.get(userId)

    }

}