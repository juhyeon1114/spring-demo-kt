package study.springkts.global.utils

import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable

fun pageable(page: Int, size: Int?): Pageable {
    val limit = size ?: Int.MAX_VALUE
    return PageRequest.of(page, limit)
}