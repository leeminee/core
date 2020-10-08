package hello.core.member;

/**
 * MemberService 에 대한 구현체
 * MemberServiceImple 은 MemberRepository에도 의존하고 MemoryMemberRepository 에도 의존하게된다.
 * 즉, 추상화에도 의존하고 구체화에도 의존하게된다.
 */
public class MemberServiceImpl implements MemberService {

//    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final MemberRepository memberRepository;

    // 생성자주입 , 의존관계 주입(Dependency Injection)
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
