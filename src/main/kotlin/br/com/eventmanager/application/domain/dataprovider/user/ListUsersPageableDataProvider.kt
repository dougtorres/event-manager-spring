package br.com.eventmanager.application.domain.dataprovider.user

import br.com.eventmanager.application.app.models.UserModel
import org.springframework.data.domain.Page
import org.springframework.stereotype.Service

@Service
interface ListUsersPageableDataProvider {

    fun get(page: Int, perPage: Int): Page<UserModel>

}