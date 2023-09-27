package br.com.eventmanager.application.app.repositories

import br.com.eventmanager.application.app.models.TypeModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.math.BigInteger

@Repository
interface TypeRepository: JpaRepository<TypeModel, BigInteger>