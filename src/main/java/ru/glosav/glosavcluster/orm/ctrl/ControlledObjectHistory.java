package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * История контролируемого объекта
 *
 * @author Grigory Panin
 */
@Table(name = "ctrl_object_history")
public class ControlledObjectHistory extends AbstractHistory {

    private static final long serialVersionUID = 8714139835801209351L;

    /**
     * Идентификатор контролируемого объекта
     */
    @Column(name="ctrl_object_id", nullable = false)
    private Long ctrlObjectId;

    /**
     * Тип контролируемого объекта
     * См. справочник ru.glosav.glosavcluster.orm.reference.ControlledObjectType
     */
    @Column(name="type", nullable = false)
    private Integer type;

    /**
     * Статус
     * См. справочник ru.glosav.glosavcluster.orm.reference.ControlledObjectStatus
     */
    @Column(name="status", nullable = false)
    private Long status;

    /**
     * Идентификатор главного устройства
     */
    @Column(name="main_device_id")
    private Long mainDeviceId;

    public Long getCtrlObjectId() {
        return ctrlObjectId;
    }

    public void setCtrlObjectId(Long ctrlObjectId) {
        this.ctrlObjectId = ctrlObjectId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getMainDeviceId() {
        return mainDeviceId;
    }

    public void setMainDeviceId(Long mainDeviceId) {
        this.mainDeviceId = mainDeviceId;
    }
}