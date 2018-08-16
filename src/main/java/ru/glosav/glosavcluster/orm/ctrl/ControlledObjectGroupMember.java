package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Участник группы контролируемых объектов
 *
 * @author Grigory Panin
 */
@Entity
@Table(name = "ctrl_object_group_member")
public class ControlledObjectGroupMember implements Serializable {

    private static final long serialVersionUID = -356985360129124574L;

    /**
     * Идентификатор контролируемого объекта
     */
    @Column(name="ctrl_object_id", nullable = false)
    private Long controlledObjectId;

    /**
     * Идентификатор группы контролируемого объекта
     */
    @Column(name="ctrl_object_group_id", nullable = false)
    private Long controlledObjectGroupId;

    /**
     * Время последнего изменения
     */
    @Column(name="utc", nullable = false)
    private LocalDateTime utc;

    public Long getControlledObjectId() {
        return controlledObjectId;
    }

    public void setControlledObjectId(Long controlledObjectId) {
        this.controlledObjectId = controlledObjectId;
    }

    public Long getControlledObjectGroupId() {
        return controlledObjectGroupId;
    }

    public void setControlledObjectGroupId(Long controlledObjectGroupId) {
        this.controlledObjectGroupId = controlledObjectGroupId;
    }

    public LocalDateTime getUtc() {
        return utc;
    }

    public void setUtc(LocalDateTime utc) {
        this.utc = utc;
    }
}