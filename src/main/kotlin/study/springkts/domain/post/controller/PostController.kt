package study.springkts.domain.post.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import study.springkts.domain.post.model.Post
import study.springkts.domain.post.model.PostCreateRequest
import study.springkts.domain.post.service.PostReadService
import study.springkts.domain.post.service.PostService

@RestController
@RequestMapping("/post")
class PostController @Autowired constructor(
    private val postService: PostService,
    private val postReadService: PostReadService
) {

    @GetMapping
    fun findAll(): List<Post> {
        return postReadService.findAll()
    }

    @PostMapping
    fun save(request: PostCreateRequest) {
        postService.save(request)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable("id") id: Long, content: String) {
        postService.update(id, content)
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: Long): Post {
        return postReadService.getById(id)
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable("id") id: Long) {
        postService.deleteById(id)
    }

}