package kr.dataportal.with.domain.memo.entity

import jakarta.persistence.Entity
import kr.dataportal.with.config.jpa.BaseEntity

/**
 * @Author Heli
 */
@Entity
class Memo(
    val content: String
) : BaseEntity()
