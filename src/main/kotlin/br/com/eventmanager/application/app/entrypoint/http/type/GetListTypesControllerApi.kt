package br.com.eventmanager.application.app.entrypoint.http.type

import br.com.eventmanager.application.app.models.TypeModel
import br.com.eventmanager.application.domain.usecase.type.ListTypesUseCase
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Tag(name = "Type API")
@RequestMapping("/v1/type")
class GetListTypesControllerApi(
    private val listTypesUseCase: ListTypesUseCase
) {

    @GetMapping( "/list")
    fun get(): List<TypeModel> {
        return listTypesUseCase.apply()
    }

}