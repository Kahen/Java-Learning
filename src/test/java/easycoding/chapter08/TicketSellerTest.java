package easycoding.chapter08;

import javafx.beans.binding.BooleanExpression;
import javafx.beans.binding.NumberExpression;
import org.junit.jupiter.api.*;

/**
 * @author: Kahen
 * @time: 2020/6/1 20:26
 * 典型的JUnit测试类结构
 * 定义一个测试类并指定用例在测试报告中的展示名称
 */
@DisplayName("售票器类型测试")
public class TicketSellerTest {
    // 定义待测类的示例
    private TicketSeller ticketSeller;

    // 定义在整个测试类开始前执行的操作
    // 通常包括全局和外部资源（包括测试行）的构建和初始化
    @BeforeAll
    public static void init() {
    }

    // 定义在整个测试类结束后的操作
    // 通常包括全局和外部资源的释放和销毁
    @AfterAll
    public static void cleanup() {
    }

    // 定义在每个测试用例之前的操作
    // 通常包括基础数据和运行环境的准备
    @BeforeEach
    public void create() {
    }

    // 定义在每个测试用例完成后执行的操作
    // 通常包括运行环境的清理
    @AfterEach
    public void destroy() {
    }

    //测试用例，当车票售出后余票应该减少
    @Test
    @DisplayName("售票后余票应减少")
    public void shouldReduceInventoryWhenSoldOut() {
        ticketSeller.setInventory(10);
        ticketSeller.sell(1);
        assertThat(ticketSeller.getInventory()).isEqualTo(9);
    }

    private NumberExpression assertThat(Integer inventory) {
        NumberExpression numberExpression = null;
        numberExpression.add(inventory);
        return numberExpression;
    }


}

class TicketSeller {
    private Integer Inventory;

    public Integer getInventory() {
        return Inventory;
    }

    public void setInventory(Integer inventory) {
        Inventory = inventory;
    }

    public void sell(int i) {
        Inventory = Inventory - i;
    }
}
