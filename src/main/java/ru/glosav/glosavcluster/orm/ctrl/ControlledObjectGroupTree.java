package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Иерархия групп контролируемых объектов
 *
 * @author Grigory Panin
 */
@Table(name = "ctrl_object_group_tree")
public class ControlledObjectGroupTree extends AbstractTreeEntity {

    private static final long serialVersionUID = 31176840475384897L;

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