package study.springkts.domain.post.repository

import org.springframework.data.domain.Pageable
import study.springkts.domain.post.model.Post

interface PostRepository {

    fun getCount(): Long

    fun getPageItems(pageable: Pageable): List<Post?>

    fun findAll(): List<Post?>

    fun save(post: Post)

    fun update(id: Long, content: String)

    fun deleteById(id: Long)

    fun findById(id: Long): Post?

    fun getById(id: Long): Post {
        return findById(id) ?: throw IllegalArgumentException("Post not found")
    }

}