package br.com.eventmanager.application.app.entrypoint.http.user

import br.com.eventmanager.application.app.models.UserModel
import br.com.eventmanager.application.domain.usecase.user.UpdateUserUseCase
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Tag(name = "User API")
@RequestMapping("/v1/user")
class PutUpdateUserControllerApi(
    val updateUserUseCase: UpdateUserUseCase
) {

    @PutMapping
    fun update(@RequestBody user: UserModel) {
        updateUserUseCase.apply(user)
    }

}