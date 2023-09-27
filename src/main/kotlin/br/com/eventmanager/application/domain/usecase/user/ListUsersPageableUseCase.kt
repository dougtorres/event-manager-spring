package br.com.eventmanager.application.domain.usecase.user

import br.com.eventmanager.application.app.models.UserModel
import br.com.eventmanager.application.domain.dataprovider.user.ListUsersPageableDataProvider
import org.springframework.data.domain.Page
import org.springframework.stereotype.Component

@Component
class ListUsersPageableUseCase(
    private val listUsersPageableDataProvider: ListUsersPageableDataProvider
) {

    fun apply(page: Int, perPage: Int): Page<UserModel> {

        return listUsersPageableDataProvider.get(page, perPage)

    }

}