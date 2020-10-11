package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @ComponentScan : 어노테이션이 붙은 얘들을 전부 등록시켜주는 아이.
 */
@Configuration
@ComponentScan(
//        basePackages = "hello.core.member", // member 패키지 내부에 있는 클래스만 컴포넌트 빈에 등록
        // 이 클래스 말고 Configuration 어노테이션이 붙은 클래스는 제외하도록 하는 코드
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}
