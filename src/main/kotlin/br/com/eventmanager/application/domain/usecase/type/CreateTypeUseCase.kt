package br.com.eventmanager.application.domain.usecase.type

import br.com.eventmanager.application.app.models.TypeModel
import br.com.eventmanager.application.domain.dataprovider.type.CreateTypeDataProvider
import org.springframework.stereotype.Component

@Component
class CreateTypeUseCase(
    private val createTypeDataProvider: CreateTypeDataProvider
) {

    fun apply(type: TypeModel) {

        createTypeDataProvider.create(type)

    }

}