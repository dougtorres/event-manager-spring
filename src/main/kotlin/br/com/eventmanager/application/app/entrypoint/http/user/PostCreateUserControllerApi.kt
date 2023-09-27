package br.com.eventmanager.application.app.entrypoint.http.user

import br.com.eventmanager.application.app.models.UserModel
import br.com.eventmanager.application.domain.usecase.user.CreateUserUseCase
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Tag(name = "User API")
@RequestMapping("/v1/user")
class PostCreateUserControllerApi(
    val createUserUseCase: CreateUserUseCase
) {

    @PostMapping
    fun create(@RequestBody user: UserModel) {
        createUserUseCase.apply(user)
    }

}