package br.com.eventmanager.application.domain.dataprovider.user

import br.com.eventmanager.application.app.models.UserModel
import org.springframework.stereotype.Service

@Service
interface UpdateUserDataProvider {

    fun update(newUser: UserModel)

}