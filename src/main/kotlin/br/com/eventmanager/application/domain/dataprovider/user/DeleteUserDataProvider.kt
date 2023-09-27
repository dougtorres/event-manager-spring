package br.com.eventmanager.application.domain.dataprovider.user

import org.springframework.stereotype.Service
import java.math.BigInteger

@Service
interface DeleteUserDataProvider {

    fun delete(userId: BigInteger)

}