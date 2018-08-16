package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Иерархия контролируемых объектов
 *
 * @author Grigory Panin
 */
@Table(name = "ctrl_object_tree")
public class ControlledObjectTree extends AbstractTreeEntity {

    private static final long serialVersionUID = 7034932686667525453L;

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