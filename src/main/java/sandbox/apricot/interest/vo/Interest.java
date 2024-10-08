package sandbox.apricot.interest.vo;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sandbox.apricot.common.entity.BaseTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(of = "interestId", callSuper = false)
public class Interest extends BaseTime {

    private Long interestId; // 관심사 고유 식별자
    private Long memberId; // 사용자 고유 식별자(FK)
    private String categoryId; // 분야 고유 식별(FK)
    private int priority; // 우선 순위

    @Builder
    public Interest(Long memberId, String categoryId, int priority) {
        this.memberId = memberId;
        this.categoryId = categoryId;
        this.priority = priority;
    }

}
