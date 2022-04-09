package kr.dataportal.with.domain.memo.repository

import kr.dataportal.with.domain.memo.entity.Memo
import org.springframework.data.jpa.repository.JpaRepository

/**
 * @Author Heli
 */
interface MemoRepository : JpaRepository<Memo, Long>
