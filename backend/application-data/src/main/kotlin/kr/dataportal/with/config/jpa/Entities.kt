package kr.dataportal.with.config.jpa

import jakarta.persistence.*
import kr.dataportal.with.infrastructure.util.lateInit
import kr.dataportal.with.infrastructure.util.notNull
import java.time.LocalDateTime

/**
 * @Author Heli
 */
@MappedSuperclass
abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = lateInit()

    @Column(updatable = false)
    var createdAt: LocalDateTime = lateInit()

    var modifiedAt: LocalDateTime = lateInit()

    @PrePersist
    fun prePersist() {
        val now = LocalDateTime.now()
        createdAt = now
        modifiedAt = now
    }

    @PreUpdate
    fun preUpdate() {
        modifiedAt = LocalDateTime.now()
    }
}

val BaseEntity.requiredId: Long get() = id.notNull { "Entity(${javaClass.simpleName}) id is null" }
