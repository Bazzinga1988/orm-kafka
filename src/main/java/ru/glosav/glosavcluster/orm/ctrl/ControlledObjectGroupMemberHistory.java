package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * История назначения контролируемого объекта в группу
 *
 * @author Grigory Panin
 */
@Table(name = "ctrl_object_group_member_history")
public class ControlledObjectGroupMemberHistory extends AbstractHistory {

    private static final long serialVersionUID = 4255326745901211529L;

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
}