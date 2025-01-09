package study.springkts.domain.post.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.web.PagedModel
import org.springframework.web.bind.annotation.*
import study.springkts.domain.post.model.Post
import study.springkts.domain.post.model.dto.PostCreateRequest
import study.springkts.domain.post.service.PostReadService
import study.springkts.domain.post.service.PostService
import study.springkts.global.utils.logger
import study.springkts.global.utils.pageable

@RestController
@RequestMapping("/post")
class PostController @Autowired constructor(
    private val postService: PostService,
    private val postReadService: PostReadService
) {

    @GetMapping("/page")
    fun page(
        @RequestParam("page", defaultValue = "0") page: Int,
        @RequestParam("size", defaultValue = "10") size: Int
    ): PagedModel<Post?> {
        logger.info { "page: $page, size: $size" }
        return postReadService.getPage(pageable(page, size))
    }

    @GetMapping
    fun findAll(): List<Post?> {
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