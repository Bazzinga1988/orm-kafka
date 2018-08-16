package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * История изменения группы контролируемых объектов
 *
 * @author Grigory Panin
 */
@Table(name = "ctrl_object_group_history")
public class ControlledObjectGroupHistory extends AbstractHistory {

    private static final long serialVersionUID = -1719328435712789782L;

    /**
     * Идентификатор группы контролируемых объектов
     */
    @Column(name="ctrl_object_group_id", nullable = false)
    private Long id;

    /**
     * Статус
     * См. справочник ru.glosav.glosavcluster.orm.reference.ControlledObjectGroupStatus
     */
    @Column(name="status", nullable = false)
    private Integer status;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}