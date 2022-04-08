package kr.dataportal.with.api.domain.memo

import kr.dataportal.with.port.`in`.CreateMemoUsecase
import kr.dataportal.with.port.`in`.QueryWrittenMemoUsecase
import org.springframework.web.bind.annotation.*

/**
 * @Author Heli
 */
@RestController
@RequestMapping("/api/v1/memo")
class MemoRestController(
    private val createMemoUsecase: CreateMemoUsecase,
    private val queryWrittenMemoUsecase: QueryWrittenMemoUsecase
) {

    @PostMapping
    fun createMemo(@RequestBody request: CreateMemoRequest) {
        val command = request.toCreateUsecaseCommand()
        createMemoUsecase.command(command)
    }

    @GetMapping("/{memoId}")
    fun queryWrittenMemo(@PathVariable memoId: Long): QueryMemoResponse? {
        val query = QueryWrittenMemoUsecase.Query(memoId = memoId)
        val result = queryWrittenMemoUsecase.query(query) ?: return null
        return QueryMemoResponse.from(
            memo = result.memo
        )
    }
}
