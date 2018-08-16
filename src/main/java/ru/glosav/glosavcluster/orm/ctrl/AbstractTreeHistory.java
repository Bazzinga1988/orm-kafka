package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;

/**
 * Базовая сущность истории иерархии
 *
 * @author Grigory Panin
 */
public abstract class AbstractTreeHistory extends AbstractHistory {

    private static final long serialVersionUID = 5021878974856692914L;

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