package kr.dataportal.with.adapter.out

import kr.dataportal.with.adapter.out.mapper.MemoMapper
import kr.dataportal.with.domain.memo.repository.MemoRepository
import kr.dataportal.with.port.out.MemoPersistencePort
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import kr.dataportal.with.memo.Memo as CoreMemo

/**
 * @Author Heli
 */
@Service
class MemoPersistencePortAdapter(
    private val memoRepository: MemoRepository,
    private val memoMapper: MemoMapper
) : MemoPersistencePort {
    override fun find(memoId: Long): CoreMemo? {
        val memo = memoRepository.findByIdOrNull(memoId) ?: return null
        return memoMapper.toApplication(memo)
    }

    override fun save(memo: CoreMemo) {
        val memoEntity = memoMapper.toPersistence(memo)
        memoRepository.save(memoEntity)
    }

    override fun delete(memoId: Long) {
        TODO("Not yet implemented")
    }
}
