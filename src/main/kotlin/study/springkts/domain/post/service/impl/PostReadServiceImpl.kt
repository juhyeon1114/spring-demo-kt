package study.springkts.domain.post.service.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import study.springkts.domain.post.model.Post
import study.springkts.domain.post.repository.PostRepository
import study.springkts.domain.post.service.PostReadService

@Service
@Transactional(readOnly = true)
class PostReadServiceImpl @Autowired constructor(
    private val postRepository: PostRepository
) : PostReadService {

    override fun findAll(): List<Post> {
        return postRepository.findAll()
    }

    override fun getById(id: Long): Post {
        return postRepository.getById(id)
    }

}