package br.com.eventmanager.application.app.entrypoint.http.user

import br.com.eventmanager.application.domain.usecase.user.DeleteUserUseCase
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigInteger

@RestController
@Tag(name = "User API")
@RequestMapping("/v1/user")
class DeleteUserControllerApi(
    val deleteUserUseCase: DeleteUserUseCase
) {

    @DeleteMapping( "/{userId}")
    fun delete(@PathVariable userId: BigInteger) {
        deleteUserUseCase.apply(userId)
    }

}