package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Устройство (АНТ)
 *
 * @author Grigory Panin
 */
@Entity
@Table(name = "device")
public class Device implements Serializable {

    private static final long serialVersionUID = 7944238179580362717L;

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
     * Тип устройства
     * См. справочник ru.glosav.glosavcluster.orm.reference.DeviceType
     */
    @Column(name="type", nullable = false)
    private Integer type;

    /**
     * Наименование
     */
    @Column(name="name", nullable = false)
    private String name;

    /**
     * Модель
     */
    @Column(name="model", nullable = false)
    private String model;

    /**
     * Статус
     * См. справочник ru.glosav.glosavcluster.orm.reference.DeviceStatus
     */
    @Column(name="status", nullable = false)
    private Integer status;

    /**
     * Время статуса
     */
    @Column(name="status_utc", nullable = false)
    private LocalDateTime statusUtc;

    /**
     * ????? auth_id
     */
    @Column(name="auth_id", nullable = false)
    private Integer authId;

    /**
     * ????? auth_type
     */
    @Column(name="auth_type", nullable = false)
    private Integer authType;

    /**
     * Описание
     */
    @Column(name="descr")
    private String description;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getStatusUtc() {
        return statusUtc;
    }

    public void setStatusUtc(LocalDateTime statusUtc) {
        this.statusUtc = statusUtc;
    }

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public Integer getAuthType() {
        return authType;
    }

    public void setAuthType(Integer authType) {
        this.authType = authType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}