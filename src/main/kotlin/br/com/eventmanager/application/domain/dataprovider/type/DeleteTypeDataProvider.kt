package br.com.eventmanager.application.domain.dataprovider.type

import org.springframework.stereotype.Service
import java.math.BigInteger

@Service
interface DeleteTypeDataProvider {

    fun delete(typeId: BigInteger)

}