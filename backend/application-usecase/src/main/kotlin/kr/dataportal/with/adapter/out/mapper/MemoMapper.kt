package kr.dataportal.with.adapter.out.mapper

import kr.dataportal.with.config.jpa.requiredId
import kr.dataportal.with.domain.memo.entity.Memo
import org.springframework.stereotype.Service
import kr.dataportal.with.memo.Memo as CoreMemo

/**
 * @Author Heli
 */
@Service
class MemoMapper {

    fun toPersistence(memo: CoreMemo): Memo {
        return Memo(
            content = memo.content
        )
    }

    fun toApplication(memo: Memo): CoreMemo {
        return CoreMemo(
            id = memo.requiredId,
            content = memo.content
        )
    }
}
