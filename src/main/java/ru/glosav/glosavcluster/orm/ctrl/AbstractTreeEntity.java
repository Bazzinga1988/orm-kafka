package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Базовая сущность иерархии
 *
 * @author Grigory Panin
 */
@Entity
public abstract class AbstractTreeEntity implements Serializable {

    private static final long serialVersionUID = 1698258354651001911L;

    /**
     * Идентификатор родительского элемента
     */
    @Column(name="parent_id")
    private Long parentId;

    /**
     * Уроверь иерархии
     */
    @Column(name="level", nullable = false)
    private Integer level;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}