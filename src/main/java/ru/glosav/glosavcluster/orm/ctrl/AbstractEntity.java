package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * Базовый класс сущности
 *
 * @author Grigory Panin
 */
@Entity
public abstract class AbstractEntity<I extends Comparable> implements Comparable<AbstractEntity>, Serializable {

    private static final long serialVersionUID = -92108899786651816L;

    /**
     * ID
     */
    @Id
    @Column(name="id", unique = true, nullable = false)
    private I id;

    public I getId() {
        return id;
    }

    public void setId(I id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        } else if (object == null || object.getClass() != this.getClass()) {
            return false;
        }

        AbstractEntity entity = (AbstractEntity)object;
        return Objects.equals(getId(), entity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public int compareTo(AbstractEntity entity) {
        if (entity == null) {
            return 1;
        } else {
            return getId().compareTo(entity.getId());
        }
    }
}