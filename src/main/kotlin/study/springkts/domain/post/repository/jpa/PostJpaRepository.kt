package study.springkts.domain.post.repository.jpa

import com.linecorp.kotlinjdsl.support.spring.data.jpa.repository.KotlinJdslJpqlExecutor
import org.springframework.data.jpa.repository.JpaRepository
import study.springkts.domain.post.model.Post

interface PostJpaRepository : JpaRepository<Post, Long>, KotlinJdslJpqlExecutor {
}