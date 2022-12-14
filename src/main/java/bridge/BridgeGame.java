package bridge;

import java.util.List;
import java.util.Objects;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    static final String END = "END";
    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public static String move(String selectMove, List<String> bridgeShape) {
        if (Objects.equals(selectMove, bridgeShape.get(0))){
            bridgeShape.remove(0);
            return selectMove;
        }
        return END;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public static void retry(int bridgeSize, List<String> bridgeShape) {
        UpDown.upBridges.clear();
        UpDown.downBridges.clear();
        new CrossBridge(bridgeSize, bridgeShape);
    }
}
