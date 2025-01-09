package study.springkts.domain.post.repository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import study.springkts.domain.post.model.Post

@Repository
class PostRepositoryImpl @Autowired constructor(
    private val postDatabaseRepository: PostDatabaseRepository
) : PostRepository {

    override fun findAll(): List<Post> {
        return postDatabaseRepository.findAll()
    }

    override fun save(post: Post) {
        postDatabaseRepository.save(post)
    }

    override fun update(content: String) {

    }

    override fun deleteById(id: Long) {
        postDatabaseRepository.delete {
            deleteFrom(
                entity(Post::class)
            ).where(
                path(Post::id).eq(id)
            )
        }
    }

    override fun findById(id: Long): Post? {
        TODO("Not yet implemented")
    }

}