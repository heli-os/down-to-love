package kr.dataportal.with.domain.calendar.repository

import kr.dataportal.with.domain.calendar.entity.GoogleCalendar
import org.springframework.data.jpa.repository.JpaRepository

/**
 * @Author Heli
 */
interface CalendarRepository : JpaRepository<GoogleCalendar, Long> {
}
