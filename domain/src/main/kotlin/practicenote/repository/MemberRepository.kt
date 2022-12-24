package practicenote.repository

import org.springframework.data.jpa.repository.JpaRepository
import practicenote.entity.Member

interface MemberRepository : JpaRepository<Member,Long>{
}