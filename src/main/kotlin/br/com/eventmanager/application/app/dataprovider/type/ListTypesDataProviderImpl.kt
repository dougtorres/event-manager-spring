package br.com.eventmanager.application.app.dataprovider.type

import br.com.eventmanager.application.app.models.TypeModel
import br.com.eventmanager.application.app.repositories.TypeRepository
import br.com.eventmanager.application.domain.dataprovider.type.ListTypesDataProvider
import org.springframework.stereotype.Component

@Component
class ListTypesDataProviderImpl(
    private val typeRepository: TypeRepository
) : ListTypesDataProvider {

    override fun getList(): List<TypeModel> {
        return typeRepository.findAll().toList()
    }

}