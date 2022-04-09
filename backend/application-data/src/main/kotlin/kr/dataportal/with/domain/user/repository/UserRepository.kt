package kr.dataportal.with.domain.user.repository

import kr.dataportal.with.domain.user.entity.User
import org.springframework.data.jpa.repository.JpaRepository

/**
 * @Author Heli
 */
interface UserRepository : JpaRepository<User, Long> {
}
