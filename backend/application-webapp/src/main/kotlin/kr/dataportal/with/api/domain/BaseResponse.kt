package kr.dataportal.with.api.domain

import org.springframework.data.domain.Page

/**
 * @Author Heli
 */
data class PagedResponse<T>(
    val content: List<T>,
    val page: PageResponse
)

data class PageResponse(
    val number: Int,
    val size: Int,
    val totalElements: Long,
    val totalPages: Int,
    val first: Boolean,
    val last: Boolean,
    val hasNext: Boolean,
    val hasPrevious: Boolean
)

inline fun <T, R> Page<T>.pagedDto(convert: (T) -> R): PagedResponse<R> {
    return PagedResponse(
        content = content.map(convert),
        page = toResponse()
    )
}

fun Page<*>.toResponse() = PageResponse(
    number = number,
    size = size,
    totalElements = totalElements,
    totalPages = totalPages,
    first = isFirst,
    last = isLast,
    hasNext = hasNext(),
    hasPrevious = hasPrevious()
)
