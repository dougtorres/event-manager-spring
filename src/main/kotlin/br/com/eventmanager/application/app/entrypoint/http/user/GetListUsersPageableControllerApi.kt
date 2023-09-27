package br.com.eventmanager.application.app.entrypoint.http.user

import br.com.eventmanager.application.app.models.UserModel
import br.com.eventmanager.application.domain.usecase.user.ListUsersPageableUseCase
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@Tag(name = "User API")
@RequestMapping("/v1/user")
class GetListUsersPageableControllerApi(
    val listUsersPageableUseCase: ListUsersPageableUseCase
) {

    @GetMapping( "/list/pageable")
    fun listUsersPageable(@RequestParam("page") page: Int, @RequestParam("perPage") perPage: Int): Page<UserModel> {
        return listUsersPageableUseCase.apply(page, perPage)
    }

}