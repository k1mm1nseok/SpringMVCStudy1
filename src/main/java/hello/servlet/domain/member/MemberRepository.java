package hello.servlet.domain.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    /*
    동시성 문제가 있으므로 실무에서는 거의 사용 안함.
    ConcurrentHashMap 혹은 AtomicLong을 사용.
     */
    private Map<Long, Member> store = new HashMap<>();
}
