package br.com.eventmanager.application.app.entrypoint.http.type

import br.com.eventmanager.application.domain.usecase.type.DeleteTypeUseCase
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigInteger

@RestController
@Tag(name = "Type API")
@RequestMapping("/v1/type")
class DeleteTypeControllerApi(
    val deleteTypeUseCase: DeleteTypeUseCase
) {

    @DeleteMapping("/{typeId}")
    fun delete(@PathVariable typeId: BigInteger) {
        return deleteTypeUseCase.apply(typeId)
    }

}