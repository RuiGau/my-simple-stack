package deqo.rgui;

import java.util.Objects;

public class Item {
    private Object value;

    public Item(Object value){
        setValue(value);
    }

    /**
     * Commentaire exigence #1
     * @return
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}
