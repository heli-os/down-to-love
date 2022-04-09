package kr.dataportal.with.api.domain.memo.request

import kr.dataportal.with.memo.Memo
import kr.dataportal.with.port.`in`.CreateMemoUsecase

/**
 * @Author Heli
 */
data class CreateMemoRequest(
    val content: String
) {

    fun toCreateUsecaseCommand(): CreateMemoUsecase.Command {
        return CreateMemoUsecase.Command(
            memo = toMemo()
        )
    }

    private fun toMemo(): Memo {
        return Memo.new(
            content = content
        )
    }
}
