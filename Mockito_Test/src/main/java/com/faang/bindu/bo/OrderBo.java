package com.faang.bindu.bo;

import com.faang.bindu.dat.Order;

import java.sql.SQLException;

public interface OrderBo {
    boolean placeOrder(Order order) throws SQLException;
    boolean cancleOrder(int id) throws SQLException;
    boolean deleteOrder(int id) throws SQLException;
}
