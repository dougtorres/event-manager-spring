package br.com.eventmanager.application.app.entrypoint.http.type

import br.com.eventmanager.application.app.models.TypeModel
import br.com.eventmanager.application.domain.usecase.type.CreateTypeUseCase
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Tag(name = "Type API")
@RequestMapping("/v1/type")
class PostCreateTypeControllerApi(
    val createTypeUseCase: CreateTypeUseCase
) {

    @PostMapping
    fun create(@RequestBody type: TypeModel) {
        return createTypeUseCase.apply(type)
    }

}