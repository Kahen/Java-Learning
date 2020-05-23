package easycoding.chapter06;

/**
 * @author: Kahen
 * @time: 2020/5/23 15:57
 * 实现现根据相关度排序，再根据浏览数排序的自定义Comparable的示例代码
 */
public class SearchResult implements Comparable<SearchResult> {

  int relativeRatio;
  long count;
  int recentOrders;

  public SearchResult(int relativeRatio, long count) {
    this.relativeRatio = relativeRatio;
    this.count = count;
  }

  @Override
  public int compareTo(SearchResult o) {
    // 先比较相关度
    if (this.relativeRatio != o.relativeRatio) {
      return this.relativeRatio > o.relativeRatio ? 1 : -1;
    }
    // 相关度相等时再比较浏览数
    if (this.count != o.count) {
      return this.count > o.count ? 1 : -1;
    }
    return 0;
  }

  public SearchResult(int recentOrders) {
    this.recentOrders = recentOrders;
  }
}
