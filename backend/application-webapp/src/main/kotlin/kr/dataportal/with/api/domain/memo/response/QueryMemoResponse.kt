package kr.dataportal.with.api.domain.memo.response

import kr.dataportal.with.memo.Memo

/**
 * @Author Heli
 */
data class QueryMemoResponse(
    val memo: Memo
) {
    companion object {
        fun from(memo: Memo): QueryMemoResponse {
            return QueryMemoResponse(
                memo = memo
            )
        }
    }
}
