package br.com.eventmanager.application.app.entrypoint.http.authentication

import br.com.eventmanager.application.app.models.AuthenticationDTO
import br.com.eventmanager.application.app.models.UserModel
import br.com.eventmanager.application.app.services.TokenService
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class AuthenticationController(
    private val authenticationManager: AuthenticationManager,
    private val tokenService: TokenService
) {

    @PostMapping("/login")
    fun login(@RequestBody @Valid data: AuthenticationDTO): ResponseEntity<String> {
        val usernamePassword = UsernamePasswordAuthenticationToken(data.login, data.password)
        val auth = authenticationManager.authenticate(usernamePassword)
        val token = tokenService.generateToken(auth.principal as UserModel)
        return ResponseEntity.ok("{ \"token\":\"$token\" }")
    }

}