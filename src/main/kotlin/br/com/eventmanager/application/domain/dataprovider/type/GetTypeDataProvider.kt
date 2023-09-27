package br.com.eventmanager.application.domain.dataprovider.type

import br.com.eventmanager.application.app.models.TypeModel
import org.springframework.stereotype.Service
import java.math.BigInteger

@Service
interface GetTypeDataProvider {

    fun get(typeId: BigInteger): TypeModel

}