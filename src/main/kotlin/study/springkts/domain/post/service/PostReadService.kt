package study.springkts.domain.post.service

import org.springframework.data.domain.Pageable
import org.springframework.data.web.PagedModel
import study.springkts.domain.post.model.Post

interface PostReadService {

    fun findAll(): List<Post?>

    fun getById(id: Long): Post

    fun getPage(pageable: Pageable): PagedModel<Post?>

}