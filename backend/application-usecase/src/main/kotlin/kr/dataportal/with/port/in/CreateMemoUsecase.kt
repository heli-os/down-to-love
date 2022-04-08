package kr.dataportal.with.port.`in`

import kr.dataportal.with.memo.Memo

/**
 * @Author Heli
 */
interface CreateMemoUsecase {
    fun command(command: Command)

    data class Command(
        val memo: Memo
    )
}
