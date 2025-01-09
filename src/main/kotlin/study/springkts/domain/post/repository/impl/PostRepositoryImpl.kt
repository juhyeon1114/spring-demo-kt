package study.springkts.domain.post.repository.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import study.springkts.domain.post.model.Post
import study.springkts.domain.post.repository.PostJpaRepository
import study.springkts.domain.post.repository.PostRepository

@Repository
class PostRepositoryImpl @Autowired constructor(
    private val postJpaRepository: PostJpaRepository
) : PostRepository {

    override fun findAll(): List<Post?> {
        return postJpaRepository.findAll {
            select(
                entity(Post::class)
            ).from(
                entity(Post::class)
            ).orderBy(
                path(Post::id).asc()
            )
        }
    }

    override fun save(post: Post) {
        postJpaRepository.save(post)
    }

    override fun update(id: Long, content: String) {
        postJpaRepository.update {
            update(
                entity(Post::class)
            ).set(
                path(Post::content), content
            ).where(
                path(Post::id).eq(id)
            )
        }
    }

    override fun deleteById(id: Long) {
        postJpaRepository.delete {
            deleteFrom(
                entity(Post::class)
            ).where(
                path(Post::id).eq(id)
            )
        }
    }

    override fun findById(id: Long): Post? {
        return postJpaRepository.findAll {
            select(
                entity(Post::class)
            ).from(
                entity(Post::class)
            ).where(
                path(Post::id).eq(id)
            )
        }.firstOrNull()
    }

}