package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * История иерархии групп контролируемых объектов
 *
 * @author Grigory Panin
 */
@Table(name = "ctrl_object_group_tree_history")
public class ControlledObjectGroupTreeHistory extends AbstractTreeHistory {

    private static final long serialVersionUID = 2264259239481605290L;

    /**
     * Идентификатор группы контролируемых объектов
     */
    @Column(name="ctrl_object_group_id", nullable = false)
    private Long ctrlObjectGroupId;

    public Long getCtrlObjectGroupId() {
        return ctrlObjectGroupId;
    }

    public void setCtrlObjectGroupId(Long ctrlObjectGroupId) {
        this.ctrlObjectGroupId = ctrlObjectGroupId;
    }
}