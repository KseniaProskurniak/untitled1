package lessons.lesson12.task1.model;

import java.io.Serializable;

public interface Generatable<T extends Generatable<T>> extends Serializable {
    T generate();
}
