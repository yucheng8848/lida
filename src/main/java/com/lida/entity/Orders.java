package com.lida.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName orders
 */
@TableName(value ="orders")
@Data
public class Orders implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 
     */
    private Date orderTime;

    /**
     * 
     */
    private Integer customersId;

    /**
     * 
     */
    private Integer busiessesId;

    /**
     * 
     */
    private Integer cost;

    /**
     * 
     */
    private Integer state;

    /**
     * 
     */
    private Integer riderId;

    /**
     * 备注
     */
    private String marks;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Orders other = (Orders) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderTime() == null ? other.getOrderTime() == null : this.getOrderTime().equals(other.getOrderTime()))
            && (this.getCustomersId() == null ? other.getCustomersId() == null : this.getCustomersId().equals(other.getCustomersId()))
            && (this.getBusiessesId() == null ? other.getBusiessesId() == null : this.getBusiessesId().equals(other.getBusiessesId()))
            && (this.getCost() == null ? other.getCost() == null : this.getCost().equals(other.getCost()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getRiderId() == null ? other.getRiderId() == null : this.getRiderId().equals(other.getRiderId()))
            && (this.getMarks() == null ? other.getMarks() == null : this.getMarks().equals(other.getMarks()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderTime() == null) ? 0 : getOrderTime().hashCode());
        result = prime * result + ((getCustomersId() == null) ? 0 : getCustomersId().hashCode());
        result = prime * result + ((getBusiessesId() == null) ? 0 : getBusiessesId().hashCode());
        result = prime * result + ((getCost() == null) ? 0 : getCost().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getRiderId() == null) ? 0 : getRiderId().hashCode());
        result = prime * result + ((getMarks() == null) ? 0 : getMarks().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", customersId=").append(customersId);
        sb.append(", busiessesId=").append(busiessesId);
        sb.append(", cost=").append(cost);
        sb.append(", state=").append(state);
        sb.append(", riderId=").append(riderId);
        sb.append(", marks=").append(marks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}