package kr.dataportal.with.api.domain.memo

import kr.dataportal.with.api.domain.PagedResponse
import kr.dataportal.with.api.domain.memo.request.CreateMemoRequest
import kr.dataportal.with.api.domain.memo.response.QueryMemoResponse
import kr.dataportal.with.api.domain.pagedDto
import kr.dataportal.with.port.`in`.CreateMemoUsecase
import kr.dataportal.with.port.`in`.QueryAllMemoUsecase
import kr.dataportal.with.port.`in`.QueryWrittenMemoUsecase
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.web.bind.annotation.*

/**
 * @Author Heli
 */
@RestController
@RequestMapping("/api/v1/memo")
class MemoRestController(
    private val createMemoUsecase: CreateMemoUsecase,
    private val queryAllMemoUsecase: QueryAllMemoUsecase,
    private val queryWrittenMemoUsecase: QueryWrittenMemoUsecase
) {

    @PostMapping
    fun createMemo(@RequestBody request: CreateMemoRequest) {
        val command = request.toCreateUsecaseCommand()
        createMemoUsecase.command(command)
    }

    @GetMapping
    fun queryAllMemo(@PageableDefault pageable: Pageable): PagedResponse<QueryMemoResponse> {
        val query = QueryAllMemoUsecase.Query(pageable.pageNumber, pageable.pageSize)
        val result = queryAllMemoUsecase.query(query)
        return result.memos.pagedDto { QueryMemoResponse.from(it) }
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
