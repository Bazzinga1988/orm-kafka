package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Группа контролируемых объектов
 *
 * @author Grigory Panin
 */
@Table(name = "ctrl_object_group")
public class ControlledObjectGroup extends AbstractEntity<Long> {

    private static final long serialVersionUID = 3215170989201671473L;

    /**
     * Тип группы контролируемых объектов
     * См. справочник ru.glosav.glosavcluster.orm.reference.ControlledObjectGroupType
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
     * См. справочник ru.glosav.glosavcluster.orm.reference.ControlledObjectGroupStatus
     */
    @Column(name="status", nullable = false)
    private Integer status;

    /**
     * Время статуса
     */
    @Column(name="status_utc", nullable = false)
    private LocalDateTime statusUtc;

    /**
     * Описание
     */
    @Column(name="descr")
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}