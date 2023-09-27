package br.com.eventmanager.application.app.dataprovider.user

import br.com.eventmanager.application.app.models.UserModel
import br.com.eventmanager.application.app.repositories.UserRepository
import br.com.eventmanager.application.domain.dataprovider.user.GetUserByDocumentDataProvider
import org.springframework.stereotype.Component

@Component
class GetUserByDocumentDataProviderImpl(
    private val userRepository: UserRepository
) : GetUserByDocumentDataProvider {

    override fun get(userDocument: String): UserModel {
        val user = userRepository.findUserModelByDocument(userDocument)

        user?.let {
            return it
        }?: run {
            throw Exception("O Usuário informado não existe!")
        }
    }

}