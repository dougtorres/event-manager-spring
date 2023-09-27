package br.com.eventmanager.application.domain.usecase.type

import br.com.eventmanager.application.domain.dataprovider.type.DeleteTypeDataProvider
import org.springframework.stereotype.Component
import java.math.BigInteger

@Component
class DeleteTypeUseCase(
    private val deleteTypeDataProvider: DeleteTypeDataProvider
) {

    fun apply(typeId: BigInteger) {

        deleteTypeDataProvider.delete(typeId)

    }

}