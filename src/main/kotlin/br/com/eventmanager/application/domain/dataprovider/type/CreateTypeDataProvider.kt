package br.com.eventmanager.application.domain.dataprovider.type

import br.com.eventmanager.application.app.models.TypeModel
import org.springframework.stereotype.Service

@Service
interface CreateTypeDataProvider {

    fun create(type: TypeModel)

}