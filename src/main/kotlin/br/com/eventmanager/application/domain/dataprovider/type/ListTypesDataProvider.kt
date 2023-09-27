package br.com.eventmanager.application.domain.dataprovider.type

import br.com.eventmanager.application.app.models.TypeModel
import br.com.eventmanager.application.app.models.UserModel
import org.springframework.stereotype.Service

@Service
interface ListTypesDataProvider {

    fun getList(): List<TypeModel>

}