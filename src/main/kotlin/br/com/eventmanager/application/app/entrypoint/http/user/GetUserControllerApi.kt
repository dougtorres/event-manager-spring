package br.com.eventmanager.application.app.entrypoint.http.user

import br.com.eventmanager.application.app.models.UserModel
import br.com.eventmanager.application.domain.usecase.user.GetUserUseCase
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigInteger

@RestController
@Tag(name = "User API")
@RequestMapping("/v1/user")
class GetUserControllerApi(
    val getUserUseCase: GetUserUseCase
) {

    @GetMapping( "/{userId}")
    fun get(@PathVariable userId: BigInteger): UserModel {
        return getUserUseCase.apply(userId)
    }

}