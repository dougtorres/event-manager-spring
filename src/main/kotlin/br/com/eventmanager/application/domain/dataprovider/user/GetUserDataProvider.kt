package br.com.eventmanager.application.domain.dataprovider.user

import br.com.eventmanager.application.app.models.UserModel
import org.springframework.stereotype.Service
import java.math.BigInteger

@Service
interface GetUserDataProvider {

    fun get(userId: BigInteger): UserModel

}