package kr.dataportal.with.port.out

import kr.dataportal.with.memo.Memo

/**
 * @Author Heli
 */
interface MemoPersistencePort {
    fun find(memoId: Long): Memo?
    fun save(memo: Memo)
    fun delete(memoId: Long)
}
