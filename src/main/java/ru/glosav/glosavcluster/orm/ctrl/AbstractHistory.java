package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;
import java.time.LocalDateTime;

/**
 * Базовый класс сущности истории
 *
 * @author Grigory Panin
 */
public abstract class AbstractHistory extends AbstractEntity<Long> {

    private static final long serialVersionUID = -1930903994185141621L;

    /**
     * Время изменения
     */
    @Column(name="utc", nullable = false)
    private LocalDateTime utc;

    /**
     * Пользователь, осуществивший изменения
     */
    @Column(name="user_id", nullable = false)
    private Integer userId;

    /**
     * Тип действия
     * См. справочник ru.glosav.glosavcluster.orm.reference.ActionType
     */
    @Column(name="action_type", nullable = false)
    private Integer actionType;

    /**
     * Описание
     */
    @Column(name="descr")
    private String description;

    public LocalDateTime getUtc() {
        return utc;
    }

    public void setUtc(LocalDateTime utc) {
        this.utc = utc;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getActionType() {
        return actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}