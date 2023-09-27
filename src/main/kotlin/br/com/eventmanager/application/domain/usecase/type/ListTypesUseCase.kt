package br.com.eventmanager.application.domain.usecase.type

import br.com.eventmanager.application.app.models.TypeModel
import br.com.eventmanager.application.domain.dataprovider.type.ListTypesDataProvider
import org.springframework.stereotype.Component

@Component
class ListTypesUseCase(
    private val listTypesDataProvider: ListTypesDataProvider
) {

    fun apply(): List<TypeModel> {

        return listTypesDataProvider.getList()

    }
}