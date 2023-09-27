package br.com.eventmanager.application.app.dataprovider.user

import br.com.eventmanager.application.app.repositories.UserRepository
import br.com.eventmanager.application.domain.dataprovider.user.ValidateDocumentUserDataProvider
import org.springframework.stereotype.Component

@Component
class ValidateDocumentUserDataProviderImpl(
    private val userRepository: UserRepository
) : ValidateDocumentUserDataProvider {

    override fun validate(document: String) {
       userRepository.findUserModelByDocument(document)?.let {
           throw Exception("O CPF informado já existe!")
       }
    }

}