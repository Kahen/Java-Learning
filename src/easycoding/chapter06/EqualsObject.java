package easycoding.chapter06;

import java.security.PublicKey;
import java.util.Objects;

/**
 * @author: Kahen
 * @time: 2020/5/23 16:22
 * 测试如果覆写了equals,而没有覆写hashCode,具体会有什么影响
 */
public class EqualsObject {
    private int id;
    private String name;

    public EqualsObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }


        EqualsObject that = (EqualsObject) o;
        if (that.getId() == this.id && name.equals(that.getName())) {
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
