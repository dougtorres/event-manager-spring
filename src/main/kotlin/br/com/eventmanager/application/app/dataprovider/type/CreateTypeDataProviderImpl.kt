package br.com.eventmanager.application.app.dataprovider.type

import br.com.eventmanager.application.app.models.TypeModel
import br.com.eventmanager.application.app.repositories.TypeRepository
import br.com.eventmanager.application.domain.dataprovider.type.CreateTypeDataProvider
import org.springframework.stereotype.Component

@Component
class CreateTypeDataProviderImpl(
    private val typeRepository: TypeRepository
) : CreateTypeDataProvider {


    override fun create(type: TypeModel) {
        typeRepository.save(type)
    }

}