package kr.dataportal.with.adapter.`in`

import kr.dataportal.with.port.`in`.CreateMemoUsecase
import kr.dataportal.with.port.out.MemoPersistencePort
import org.springframework.stereotype.Service

/**
 * @Author Heli
 */
@Service
class CreateMemo(
    private val memoPersistencePort: MemoPersistencePort
) : CreateMemoUsecase {
    override fun command(command: CreateMemoUsecase.Command) {
        val memo = command.memo
        memoPersistencePort.save(memo)
    }
}
