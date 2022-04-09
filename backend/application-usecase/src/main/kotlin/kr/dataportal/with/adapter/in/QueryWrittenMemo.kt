package kr.dataportal.with.adapter.`in`

import kr.dataportal.with.port.`in`.QueryWrittenMemoUsecase
import kr.dataportal.with.port.out.MemoPersistencePort
import org.springframework.stereotype.Service

/**
 * @Author Heli
 */
@Service
class QueryWrittenMemo(
    private val memoPersistencePort: MemoPersistencePort
) : QueryWrittenMemoUsecase {
    override fun query(query: QueryWrittenMemoUsecase.Query): QueryWrittenMemoUsecase.Result? {
        val memoId = query.memoId
        val memo = memoPersistencePort.find(memoId) ?: return null

        return QueryWrittenMemoUsecase.Result(
            memo = memo
        )
    }
}
