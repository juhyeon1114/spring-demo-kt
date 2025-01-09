package study.springkts.domain.post.service.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import study.springkts.domain.post.model.Post
import study.springkts.domain.post.model.PostCreateRequest
import study.springkts.domain.post.repository.PostRepository
import study.springkts.domain.post.service.PostService

@Service
@Transactional
class PostServiceImpl @Autowired constructor(
    private val postRepository: PostRepository
) : PostService {

    override fun save(request: PostCreateRequest) {
        postRepository.save(Post.create(request))
    }

    override fun update(id: Long, content: String) {
        val post = postRepository.getById(id)
        post.update(content)
//        postRepository.update(id, content)
    }

    override fun deleteById(id: Long) {
        postRepository.deleteById(id)
    }

}