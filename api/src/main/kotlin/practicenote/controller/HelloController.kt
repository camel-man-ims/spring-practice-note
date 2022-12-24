package practicenote.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import practicenote.entity.Member
import practicenote.repository.MemberRepository

@RestController
class HelloController(
    val memberRepository: MemberRepository
) {
    @GetMapping
    fun helloTest(): Member{
        return memberRepository.save(Member(name="hello"))
    }
}