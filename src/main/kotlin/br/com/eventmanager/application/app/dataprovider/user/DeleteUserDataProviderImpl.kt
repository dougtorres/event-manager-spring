package br.com.eventmanager.application.app.dataprovider.user

import br.com.eventmanager.application.app.repositories.UserRepository
import br.com.eventmanager.application.domain.dataprovider.user.DeleteUserDataProvider
import org.springframework.stereotype.Component
import java.math.BigInteger

@Component
class DeleteUserDataProviderImpl(
    private val userRepository: UserRepository
) : DeleteUserDataProvider {

    override fun delete(userId: BigInteger) {
        val user = userRepository.findById(userId)

        if(user.isPresent) {
            userRepository.deleteById(userId)
        } else {
            throw Exception("O Usuário informado não existe!")
        }
    }

}