package com.faang.bindu.bo;

import com.faang.bindu.dao.OrderDao;
import com.faang.bindu.dat.Order;

import java.sql.SQLException;

public class OrderBoImpl implements OrderBo{
    private OrderDao dao;

    public OrderDao getDao() {
        return dao;
    }

    public void setDao(OrderDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean placeOrder(Order order) throws SQLException {
       try{
          int result=dao.create(order);
          if(result == 0)
              return false;
       }catch (SQLException s){
           throw new SQLException();
       }
       return true;
    }

    @Override
    public boolean cancleOrder(int id) throws SQLException {
        try {
                   Order order=dao.read(id);
                   order.setStatus("cancled");
                   int result=dao.update(order);
                   if(result==0)
                       return false;

        }catch (SQLException s){
            throw new SQLException();
        }
        return true;
    }

    @Override
    public boolean deleteOrder(int id) throws SQLException {
        try{
            Order order=dao.read(id);
            int result=dao.delete(id);
            if(result == 0){
                return false;
            }

        } catch(SQLException s){
            throw new SQLException();
        }
        return true;
    }
}
