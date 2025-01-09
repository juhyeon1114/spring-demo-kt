package study.springkts.domain.post.service

import study.springkts.domain.post.model.Post

interface PostReadService {

    fun findAll(): List<Post?>

    fun getById(id: Long): Post

}