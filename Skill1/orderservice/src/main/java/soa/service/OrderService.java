package soa.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soa.models.Order;
import soa.models.Orderitems;
@Service


public class OrderService {

   @Autowired
   soa.repo.Orderservicerepo OR;
   public OrderService(soa.repo.Orderservicerepo OR) {
     this.OR = OR;
   }
   public Object placeOrder(Order order){
     Map<String, Object> response = new HashMap<>();
     try
     {
       for(Orderitems item: order.getItems())
         item.setOrder(order); //Set Parent Reference
       
       OR.save(order); //Insert 
       
       response.put("code", 200);
       response.put("orderId", order.getOrderId());
       response.put("status", "Order Placed Successfully");
     }catch(Exception e) {
       response.put("code", 500);
       response.put("message", e.getMessage());
     }
     return response;
   }
   
 }