package kr.dataportal.with.domain.map.repository

import kr.dataportal.with.domain.map.entity.GoogleMap
import org.springframework.data.jpa.repository.JpaRepository

/**
 * @Author Heli
 */
interface MapRepository : JpaRepository<GoogleMap, Long> {
}
