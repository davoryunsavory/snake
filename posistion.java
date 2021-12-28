import java.util.ArrayList;
import java.util.List;

public class posistion {
    List<Boolean> pos;

    posistion() {
        this.pos = new ArrayList<>() {{
            for (int i = 0; i < (16*16); i++) {
                add(false);
            }
        }};
    }

    public boolean getActive(int index) {
        return this.pos.get(index);
    }

    public void setActive(int index) {
        this.pos.set(index, true);
    }
}
