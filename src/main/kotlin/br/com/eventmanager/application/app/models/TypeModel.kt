package br.com.eventmanager.application.app.models


import jakarta.persistence.*
import java.math.BigInteger
import java.time.LocalDateTime

@Entity
@Table(schema = "public", name = "type")
data class TypeModel(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id")
    val typeId: BigInteger? = null,

    @Column(name = "name")
    val name: String,

    @Column(name = "updated_date")
    var updatedDate: LocalDateTime? = LocalDateTime.now(),

    @Column(name = "created_date")
    val createdDate: LocalDateTime? = LocalDateTime.now()

    )