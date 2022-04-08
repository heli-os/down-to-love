package kr.dataportal.with.api.domain.memo

import kr.dataportal.with.port.`in`.QueryWrittenMemoUsecase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @Author Heli
 */
@RestController
@RequestMapping("/api/v1/memo")
class MemoRestController(
    private val queryWrittenMemoUsecase: QueryWrittenMemoUsecase
) {

    @GetMapping("/{memoId}")
    fun queryWrittenMemo(@PathVariable memoId: Long): QueryMemoResponse? {
        val query = QueryWrittenMemoUsecase.Query(memoId = memoId)
        val result = queryWrittenMemoUsecase.query(query) ?: return null
        return QueryMemoResponse.from(
            memo = result.memo
        )
    }
}
