package br.com.eventmanager.application.domain.usecase.type

import br.com.eventmanager.application.app.models.TypeModel
import br.com.eventmanager.application.domain.dataprovider.type.GetTypeDataProvider
import org.springframework.stereotype.Component
import java.math.BigInteger

@Component
class GetTypeUseCase(
    private val getTypeDataProvider: GetTypeDataProvider
) {

    fun apply(typeId: BigInteger): TypeModel {

        return getTypeDataProvider.get(typeId)

    }

}