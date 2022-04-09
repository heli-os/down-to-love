package kr.dataportal.with.adapter.`in`

import kr.dataportal.with.port.`in`.QueryAllMemoUsecase
import kr.dataportal.with.port.out.MemoPersistencePort
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

/**
 * @Author Heli
 */
@Service
class QueryAllMemo(
    private val memoPersistencePort: MemoPersistencePort
) : QueryAllMemoUsecase {
    override fun query(query: QueryAllMemoUsecase.Query): QueryAllMemoUsecase.Result {
        val page = query.page
        val size = query.size
        val memos = memoPersistencePort.findAll(pageable = PageRequest.of(page, size))
        return QueryAllMemoUsecase.Result(
            memos = memos
        )
    }
}
