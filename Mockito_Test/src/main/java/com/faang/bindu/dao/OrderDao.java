package com.faang.bindu.dao;

import com.faang.bindu.dat.Order;

import java.sql.SQLException;

public interface OrderDao {
    int create(Order order) throws SQLException;
    Order read(int id) throws SQLException;
    int update(Order order) throws SQLException;
    int delete(int id) throws SQLException;
}
