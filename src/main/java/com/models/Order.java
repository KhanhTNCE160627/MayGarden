/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

import java.util.Date;

/**
 *
 * @author PC
 */
public class Order {
    private int Order;
    private int UserId;
    private Date OrderDate;
    private Date ShipDate;
    private String Note;
    private boolean OrderStatus;

    public Order() {
    }

    public Order(int Order, int UserId, Date OrderDate, Date ShipDate, String Note, boolean OrderStatus) {
        this.Order = Order;
        this.UserId = UserId;
        this.OrderDate = OrderDate;
        this.ShipDate = ShipDate;
        this.Note = Note;
        this.OrderStatus = OrderStatus;
    }

    public int getOrder() {
        return Order;
    }

    public void setOrder(int Order) {
        this.Order = Order;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public Date getShipDate() {
        return ShipDate;
    }

    public void setShipDate(Date ShipDate) {
        this.ShipDate = ShipDate;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }

    public boolean isOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(boolean OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    
    
}
