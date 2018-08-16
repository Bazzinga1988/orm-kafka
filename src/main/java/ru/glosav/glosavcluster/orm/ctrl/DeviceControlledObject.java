package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Текущее назначение устройства на контролируемый объект
 *
 * @author Grigory Panin
 */
@Entity
@Table(name = "device_ctrl_object")
public class DeviceControlledObject implements Serializable {

    private static final long serialVersionUID = -5626485289539223448L;

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

    /**
     * Время последнего назначения
     */
    @Column(name="utc", nullable = false)
    private LocalDateTime utc;

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

    public LocalDateTime getUtc() {
        return utc;
    }

    public void setUtc(LocalDateTime utc) {
        this.utc = utc;
    }
}