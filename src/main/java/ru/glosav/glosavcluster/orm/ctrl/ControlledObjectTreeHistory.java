package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * История иерархии контролируемых объектов
 *
 * @author Grigory Panin
 */
@Table(name = "ctrl_object_tree_history")
public class ControlledObjectTreeHistory extends AbstractTreeHistory {

    private static final long serialVersionUID = -8497722540484090540L;

    /**
     * Идентификатор контролируемого объекта
     */
    @Column(name="ctrl_object_id", nullable = false)
    private Long ctrlObjectId;

    public Long getCtrlObjectId() {
        return ctrlObjectId;
    }

    public void setCtrlObjectId(Long ctrlObjectId) {
        this.ctrlObjectId = ctrlObjectId;
    }
}