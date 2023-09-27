package br.com.eventmanager.application.app.dataprovider.type

import br.com.eventmanager.application.app.repositories.TypeRepository
import br.com.eventmanager.application.domain.dataprovider.type.DeleteTypeDataProvider
import org.springframework.stereotype.Component
import java.math.BigInteger

@Component
class DeleteTypeDataProviderImpl(
    private val typeRepository: TypeRepository
) : DeleteTypeDataProvider {

    override fun delete(typeId: BigInteger) {
        val type = typeRepository.findById(typeId)

        if (type.isPresent) {
            typeRepository.deleteById(typeId)
        } else {
            throw Exception("O Tipo informado não existe!")
        }
    }

}