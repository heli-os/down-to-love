package kr.dataportal.with.port.`in`

import kr.dataportal.with.memo.Memo
import org.springframework.data.domain.Page

/**
 * @Author Heli
 */
interface QueryAllMemoUsecase {
    fun query(query: Query): Result

    data class Query(
        val page: Int,
        val size: Int
    )

    data class Result(
        val memos: Page<Memo>
    )
}
