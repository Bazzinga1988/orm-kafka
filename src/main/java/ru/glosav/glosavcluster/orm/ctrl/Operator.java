package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Оператор
 *
 * @author Grigory Panin
 */
@Table(name = "operator")
public class Operator extends AbstractEntity<Integer> {

    private static final long serialVersionUID = -4987768890245647680L;

    /**
     * Тип оператора
     * См. справочник ru.glosav.glosavcluster.orm.reference.OperatorType
     */
    @Column(name="type", nullable = false)
    private Integer type;

    /**
     * Наименование
     */
    @Column(name="name", unique = true, nullable = false)
    private String name;

    /**
     * Статус
     * См. справочник ru.glosav.glosavcluster.orm.reference.OperatorStatus
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