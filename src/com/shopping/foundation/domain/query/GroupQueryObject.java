 package com.shopping.foundation.domain.query;
 
 import com.shopping.core.query.QueryObject;
 import org.springframework.web.servlet.ModelAndView;
 
 public class GroupQueryObject extends QueryObject
 {
   public GroupQueryObject(String currentPage, ModelAndView mv, String orderBy, String orderType)
   {
     super(currentPage, mv, orderBy, orderType);
   }
 
   public GroupQueryObject()
   {
   }
 }



 
 