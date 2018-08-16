package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * История назначений устройства на контролируемый объект
 *
 * @author Grigory Panin
 */
@Table(name = "device_ctrl_object_history")
public class DeviceControlledObjectHistory extends AbstractHistory {

    private static final long serialVersionUID = -4206671987807774121L;

    /**
     * Идентификатор устройства
     */
    @Column(name="device_id", nullable = false)
    private Integer deviceId;

    /**
     * Идентификатор оператора
     */
    @Column(name="operator_id", nullable = false)
    private Integer operatorId;

    /**
     * Идентификатор контролируемого объекта
     */
    @Column(name="ctrl_object_id", nullable = false)
    private Long ctrlObjectId;

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Long getCtrlObjectId() {
        return ctrlObjectId;
    }

    public void setCtrlObjectId(Long ctrlObjectId) {
        this.ctrlObjectId = ctrlObjectId;
    }
}