package br.com.eventmanager.application.app.dataprovider.user

import br.com.eventmanager.application.app.models.UserModel
import br.com.eventmanager.application.app.repositories.UserRepository
import br.com.eventmanager.application.domain.dataprovider.user.UpdateUserDataProvider
import br.com.eventmanager.application.domain.dataprovider.user.ValidateDocumentUserDataProvider
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class UpdateUserDataProviderImpl(
    private val userRepository: UserRepository,
    private val validateDocumentUserDataProvider: ValidateDocumentUserDataProvider
) : UpdateUserDataProvider {

    override fun update(newUser: UserModel) {
        val userOptional = newUser.userId?.let { userRepository.findById(it) }

        userOptional?.let {
            val user = it.get()
            validateNewDocument(newUser.document, user.document)
            user.document = newUser.document
            user.email= newUser.email
            user.phone = newUser.phone
            user.pass= newUser.pass
            user.isAdmin = newUser.isAdmin
            user.updatedDate = LocalDateTime.now()

            userRepository.save(user)
        }
    }

    fun validateNewDocument(newDocument: String, oldDocument: String) {
        if(newDocument != oldDocument) {
            validateDocumentUserDataProvider.validate(newDocument)
        }
    }

}