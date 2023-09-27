package br.com.eventmanager.application.app.entrypoint.http.user

import br.com.eventmanager.application.app.models.UserModel
import br.com.eventmanager.application.domain.usecase.user.GetUserByDocumentUseCase
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Tag(name = "User API")
@RequestMapping("/v1/user")
class GetUserByDocumentControllerApi(
    val getUserByDocumentUseCase: GetUserByDocumentUseCase
) {

    @GetMapping( "/document/{userDocument}")
    fun getByDocument(@PathVariable userDocument: String): UserModel {
        return getUserByDocumentUseCase.apply(userDocument)
    }

}