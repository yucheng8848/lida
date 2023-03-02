package com.lida.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName detail_orders
 */
@TableName(value ="detail_orders")
@Data
public class DetailOrders implements Serializable {
    /**
     * 订单号
     */
    @TableId
    private Integer ordersid;

    /**
     * 菜品号
     */
    @TableId
    private Integer dishesid;

    /**
     * 菜品数量
     */
    private Integer dishesNum;

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
        DetailOrders other = (DetailOrders) that;
        return (this.getOrdersid() == null ? other.getOrdersid() == null : this.getOrdersid().equals(other.getOrdersid()))
            && (this.getDishesid() == null ? other.getDishesid() == null : this.getDishesid().equals(other.getDishesid()))
            && (this.getDishesNum() == null ? other.getDishesNum() == null : this.getDishesNum().equals(other.getDishesNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrdersid() == null) ? 0 : getOrdersid().hashCode());
        result = prime * result + ((getDishesid() == null) ? 0 : getDishesid().hashCode());
        result = prime * result + ((getDishesNum() == null) ? 0 : getDishesNum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ordersid=").append(ordersid);
        sb.append(", dishesid=").append(dishesid);
        sb.append(", dishesNum=").append(dishesNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}