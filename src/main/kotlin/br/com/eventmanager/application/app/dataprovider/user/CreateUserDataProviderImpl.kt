package br.com.eventmanager.application.app.dataprovider.user

import br.com.eventmanager.application.app.repositories.UserRepository
import br.com.eventmanager.application.domain.dataprovider.user.CreateUserDataProvider
import br.com.eventmanager.application.app.models.UserModel
import br.com.eventmanager.application.app.models.UserRole
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Component

@Component
class CreateUserDataProviderImpl(
    private val userRepository: UserRepository
) : CreateUserDataProvider {

    override fun create(user: UserModel) {

        if(user.pass!=null) {
            user.pass = BCryptPasswordEncoder().encode(user.pass)
        }

        userRepository.save(user)
    }

}