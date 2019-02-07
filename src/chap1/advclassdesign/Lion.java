package chap1.advclassdesign;

import java.util.Objects;

/**
 * Created by genil on 1/12/19 at 21 32
 **/
public class Lion {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    @Override public boolean equals(Object o) {
        if(o == null || ! (o instanceof Lion)) return false;
        if (this == o) return true;
        Lion otherLion = (Lion) o;
        return id == otherLion.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
