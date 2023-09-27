package br.com.eventmanager.application.app.dataprovider.type

import br.com.eventmanager.application.app.models.TypeModel
import br.com.eventmanager.application.app.repositories.TypeRepository
import br.com.eventmanager.application.domain.dataprovider.type.GetTypeDataProvider
import org.springframework.stereotype.Component
import java.math.BigInteger

@Component
class GetTypeDataProviderImpl(
    private val typeRepository: TypeRepository
) : GetTypeDataProvider {

    override fun get(typeId: BigInteger): TypeModel {
        val type = typeRepository.findById(typeId)

        if(type.isPresent) {
            return type.get()
        } else {
            throw Exception("O Tipo informado não existe!")
        }
    }

}