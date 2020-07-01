package easycoding.chapter06;

import java.util.Comparator;

/**
 * @author: Kahen
 * @time: 2020/5/23 16:05
 * Comparator将最近订单数的权重调整到相关度和浏览数之间
 */
public class SearchResultComparator implements Comparator<SearchResult> {

    @Override
    public int compare(SearchResult o1, SearchResult o2) {
        // 相关度是第一排序准则，更高者排前（避免if-else嵌套过多使用卫语句来实现)
        if (o1.relativeRatio != o2.relativeRatio) {
            return o1.relativeRatio > o2.relativeRatio ? 1 : -1;
        }
        // 如果相关度一样，则最近订单数者排前
        if (o1.recentOrders != o2.recentOrders) {
            return o1.recentOrders > o2.recentOrders ? 1 : -1;
        }

        // 如果相关度和最近订单数都一样，则浏览数多者排前
        if (o1.count != o2.count) {
            return o1.count > o2.count ? 1 : -1;
        }
        return 0;
    }
}
