package br.com.eventmanager.application.app.services

import br.com.eventmanager.application.app.models.UserModel
import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import com.auth0.jwt.exceptions.JWTCreationException
import com.auth0.jwt.exceptions.JWTVerificationException
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import java.lang.RuntimeException
import java.time.LocalDateTime
import java.time.ZoneOffset

@Service
class TokenService(

    @Value("\${api.security.token.secret}")
    private val secret: String

) {

    fun generateToken(user: UserModel): String {
        try {
            val algorithm = Algorithm.HMAC256(secret)
            return JWT.create()
                .withIssuer("event-manager") // definindo nome do emissor
                .withSubject(user.document) // usuario que está logando
                .withExpiresAt(LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00")))
                .sign(algorithm) // definindo o algoritmo para o hash

        } catch (e: JWTCreationException) {
            throw RuntimeException("Error while generating token " + e.message)
        }
    }


    // validando token
    fun validateToken(token: String): String {
        return try {
            val algorithm = Algorithm.HMAC256(secret)
            JWT.require(algorithm)
                .withIssuer("event-manager")
                .build()
                .verify(token)
                .subject
        } catch (e: JWTVerificationException) {
            return ""
        }
    }

}