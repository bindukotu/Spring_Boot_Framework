package com.faang.bindu;

import com.faang.bindu.bo.OrderBo;
import com.faang.bindu.bo.OrderBoImpl;
import com.faang.bindu.dao.OrderDao;
import com.faang.bindu.dat.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class OrderTicketImplTest {
    private OrderBoImpl bo;

    @Mock
    private OrderDao dao;


    @BeforeEach
    public void  setup(){
        MockitoAnnotations.openMocks(this);
        bo=new OrderBoImpl();
        bo.setDao(dao);
    }

    @Test
    public void placeOrderShouldCreateOrder() throws SQLException{
        Order order=new com.faang.bindu.dat.Order();
        when(dao.create(order)).thenReturn(1);
        boolean  result= bo.placeOrder(order);
        assertTrue(result);
    }

    @Test
    public void placeOrderShouldNotCreateOrder() throws SQLException{
        Order order=new Order();
        when(dao.create(order)).thenReturn(0);
        boolean result=bo.placeOrder(order);
        assertFalse(result);
    }

    @Test
    public void cancleOrderShouldCancleOrder() throws SQLException{
        Order order=new Order();
        when(dao.read(123)).thenReturn(order);
        when(dao.update(order)).thenReturn(1);

        boolean result=bo.cancleOrder(123);
        assertTrue(result);
    }

    @Test
    public void cancleOrderShouldNotCancleOrder() throws SQLException{
        Order order=new Order();
        when(dao.read(15)).thenReturn(order);
        when(dao.update(order)).thenReturn(0);

        boolean result=bo.cancleOrder(15);
       // System.out.println(result);
        assertFalse(result);
    }

    @Test
    public void deleteOrderShouldDeleteOrder() throws SQLException{
        Order order=new Order();
        when(dao.delete(12)).thenReturn(12);

        boolean result=bo.deleteOrder(12);
        assertTrue(result);
    }

    @Test
    public void placeOrderShouldThrowException() throws SQLException{
        Order order=new Order();

        when(dao.create(order)).thenThrow(SQLException.class);

        assertThrows(SQLException.class,()->{
           bo.placeOrder(order);
        });
    }

}
