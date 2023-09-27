package br.com.eventmanager.application.app.models


import jakarta.persistence.*
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.AuthorityUtils
import org.springframework.security.core.userdetails.UserDetails
import java.math.BigInteger
import java.time.LocalDateTime

@Entity
@Table(schema = "public", name = "user")
data class UserModel(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    val userId: BigInteger? = null,

    @Column(name = "name")
    val name: String,

    @Column(name = "email")
    var email: String? = null,

    @Column(name = "document")
    var document: String,

    @Column(name = "password")
    var pass: String? = null,

    @Column(name = "is_admin")
    var isAdmin: Boolean,

    @Column(name = "phone")
    var phone: String,

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    var role: UserRole,

    @Column(name = "updated_date")
    var updatedDate: LocalDateTime? = LocalDateTime.now(),

    @Column(name = "created_date")
    val createdDate: LocalDateTime? = LocalDateTime.now()

) : UserDetails {
    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return if (this.role == UserRole.ADMIN) AuthorityUtils.createAuthorityList("ROLE_ADMIN", "ROLE_USER")
        else AuthorityUtils.createAuthorityList("ROLE_USER")
    }

    override fun getPassword(): String? {
        return this.pass
    }

    override fun getUsername(): String {
        return this.document
    }

    override fun isAccountNonExpired(): Boolean {
        return true
    }

    override fun isAccountNonLocked(): Boolean {
        return true
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    override fun isEnabled(): Boolean {
        return true
    }
}