package ru.glosav.glosavcluster.orm.ctrl;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * История изменения оператора
 *
 * @author Grigory Panin
 */
@Table(name = "operator_history")
public class OperatorHistory extends AbstractHistory {

    private static final long serialVersionUID = 8341408661516306856L;

    /**
     * Идентификатор оператора
     */
    @Column(name="operator_id", nullable = false)
    private Integer operatorId;

    /**
     * Статус
     * См. справочник ru.glosav.glosavcluster.orm.reference.OperatorStatus
     */
    @Column(name="status", nullable = false)
    private Integer status;

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