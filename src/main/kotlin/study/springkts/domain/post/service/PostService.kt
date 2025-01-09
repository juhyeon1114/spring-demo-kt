package study.springkts.domain.post.service

import study.springkts.domain.post.model.PostCreateRequest

interface PostService {

    fun save(request: PostCreateRequest)

}