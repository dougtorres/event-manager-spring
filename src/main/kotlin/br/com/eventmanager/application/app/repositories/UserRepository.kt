package br.com.eventmanager.application.app.repositories

import br.com.eventmanager.application.app.models.UserModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Repository
import java.math.BigInteger

@Repository
interface UserRepository: JpaRepository<UserModel, BigInteger> {

    fun findUserModelByDocument(document: String) : UserModel?

    fun findUserModelByDocument(document: String?): UserDetails

}
