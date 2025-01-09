package study.springkts.domain.post.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import study.springkts.domain.post.model.dto.PostCreateRequest

@Entity
class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
    var title: String? = null
    var content: String? = null

    companion object {
        fun create(request: PostCreateRequest): Post {
            val post = Post()
            post.title = request.title
            post.content = request.content
            return post
        }
    }

    fun update(content: String) {
        this.content = content
    }

}