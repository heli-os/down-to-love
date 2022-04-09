package kr.dataportal.with.port.out

import kr.dataportal.with.memo.Memo
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

/**
 * @Author Heli
 */
interface MemoPersistencePort {
    fun find(memoId: Long): Memo?
    fun findAll(pageable: Pageable): Page<Memo>
    fun save(memo: Memo)
    fun delete(memoId: Long)
}
