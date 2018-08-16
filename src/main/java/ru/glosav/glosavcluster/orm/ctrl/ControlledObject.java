package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Контролируемый объект
 *
 * @author Grigory Panin
 */
@Table(name = "ctrl_object")
public class ControlledObject extends AbstractEntity<Long> {

    private static final long serialVersionUID = -1090972496411936666L;

    /**
     * Тип контролируемого объекта
     * См. справочник ru.glosav.glosavcluster.orm.reference.ControlledObjectType
     */
    @Column(name="type", nullable = false)
    private Integer type;

    /**
     * Наименование
     */
    @Column(name="name", nullable = false)
    private String name;

    /**
     * Статус
     * См. справочник ru.glosav.glosavcluster.orm.reference.ControlledObjectStatus
     */
    @Column(name="status", nullable = false)
    private Integer status;

    /**
     * Время статуса
     */
    @Column(name="status_utc", nullable = false)
    private LocalDateTime statusUtc;

    /**
     * Регистрационный номер
     */
    @Column(name="reg_number")
    private String regNumber;

    /**
     * Модель
     */
    @Column(name="model")
    private String model;

    /**
     * Атрибут 1
     */
    @Column(name="attr1")
    private String attr1;

    /**
     * Атрибут 2
     */
    @Column(name="attr2")
    private String attr2;

    /**
     * Описание
     */
    @Column(name="descr")
    private String description;

    /**
     * Идентификатор главного устройства
     */
    @Column(name="main_device_id")
    private Long mainDeviceId;

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

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getMainDeviceId() {
        return mainDeviceId;
    }

    public void setMainDeviceId(Long mainDeviceId) {
        this.mainDeviceId = mainDeviceId;
    }
}