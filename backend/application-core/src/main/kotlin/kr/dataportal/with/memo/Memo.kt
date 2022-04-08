package kr.dataportal.with.memo

/**
 * @Author Heli
 */
class Memo(
    val id: Long?,
    val content: String
) {
    companion object {
        fun new(content: String): Memo {
            return Memo(
                id = null,
                content = content
            )
        }
    }
}
