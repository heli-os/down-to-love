package kr.dataportal.with.port.`in`

import kr.dataportal.with.memo.Memo

/**
 * @Author Heli
 */
interface QueryWrittenMemoUsecase {
    fun query(query: Query): Result?

    data class Query(
        val memoId: Long
    )

    data class Result(
        val memo: Memo
    )
}
