package kr.dataportal.with.config.jpa

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import kr.dataportal.with.infrastructure.util.lateInit

/**
 * @Author Heli
 */
@MappedSuperclass
abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = lateInit()
}
