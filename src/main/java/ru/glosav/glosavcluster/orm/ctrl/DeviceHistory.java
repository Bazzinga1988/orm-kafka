package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * История изменений конфигурации устройства
 *
 * @author Grigory Panin
 */
@Table(name = "device_history")
public class DeviceHistory extends AbstractHistory {

    private static final long serialVersionUID = -5777750229313069344L;

    /**
     * Идентификатор устройства
     */
    @Column(name="device_id", nullable = false)
    private Long deviceId;

    /**
     * Идентификатор оператора
     */
    @Column(name="operator_id", nullable = false)
    private Integer operatorId;

    /**
     * Статус
     * См. справочник ru.glosav.glosavcluster.orm.reference.DeviceStatus
     */
    @Column(name="status", nullable = false)
    private Integer status;

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}