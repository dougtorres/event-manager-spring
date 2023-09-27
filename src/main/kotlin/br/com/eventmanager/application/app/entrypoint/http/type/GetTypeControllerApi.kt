package br.com.eventmanager.application.app.entrypoint.http.type

import br.com.eventmanager.application.app.models.TypeModel
import br.com.eventmanager.application.domain.usecase.type.GetTypeUseCase
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigInteger

@RestController
@Tag(name = "Type API")
@RequestMapping("/v1/type")
class GetTypeControllerApi(
    val getTypeUseCase: GetTypeUseCase
) {

    @GetMapping( "/{typeId}")
    fun get(@PathVariable typeId: BigInteger): TypeModel {
        return getTypeUseCase.apply(typeId)
    }

}