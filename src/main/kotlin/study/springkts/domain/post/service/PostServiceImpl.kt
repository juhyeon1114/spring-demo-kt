package study.springkts.domain.post.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import study.springkts.domain.post.repository.PostRepository

@Service
class PostServiceImpl @Autowired constructor(
    private val postRepository: PostRepository
) : PostService {



}