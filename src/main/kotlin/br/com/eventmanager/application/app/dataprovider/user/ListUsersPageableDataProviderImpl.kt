package br.com.eventmanager.application.app.dataprovider.user

import br.com.eventmanager.application.app.models.UserModel
import br.com.eventmanager.application.app.repositories.UserRepository
import br.com.eventmanager.application.domain.dataprovider.user.ListUsersPageableDataProvider
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Component

@Component
class ListUsersPageableDataProviderImpl(
    private val userRepository: UserRepository
) : ListUsersPageableDataProvider {

    override fun get(page: Int, perPage: Int): Page<UserModel> {
        val user = userRepository.findAll(PageRequest.of(page, perPage, Sort.by("name")))

        user.let {
            return it
        }
    }

}