package br.com.eventmanager.application.app.dataprovider.user

import br.com.eventmanager.application.app.models.UserModel
import br.com.eventmanager.application.app.repositories.UserRepository
import br.com.eventmanager.application.domain.dataprovider.user.GetUserDataProvider
import org.springframework.stereotype.Component
import java.math.BigInteger

@Component
class GetUserDataProviderImpl(
    private val userRepository: UserRepository
) : GetUserDataProvider {

    override fun get(userId: BigInteger): UserModel {
        val user = userRepository.findById(userId)

        if(user.isPresent) {
            return user.get()
        } else {
            throw Exception("O Usuário informado não existe!")
        }
    }

}