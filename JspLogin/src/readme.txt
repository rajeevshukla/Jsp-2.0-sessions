
    ${sessionScope.cartInfo}  or ${cartInfo}  // page scope -- > request --- > session  ----  > application 

    EL implicite objects. 

       scope related : 

              pageScope
              requestScope
              sessionScope
              applicationScope


             request parameter : 
                     param
                     paramValues
            
             Header related  : 
                header 
                headerValues
     
              cookie
               
              initParam --- > aplication's init parameter.



              pageContext 
              
              
              
              ${impliciteObjects.attributeName}  or ${attributeName} 
              
              request.getParameter("userName"); --- > ${param.userName}
              
              session.getAttribute("userName"); --->${sessionScope.userName}
              
              
              el handles null values gracefully.
              
              
              you can use operators in el. 
              
              + 
              - 
              / 
              * 
              >   or  gt
              <   or   lt
              >=  or   ge
              <=   or  le
              
              
              
              when jstl is not enough we use custom tag. 
              
               custom tag 
               
                  simple tag     - extends SimpleTagSupport
                  classic tag    -- exteds TagSupport class. 
                  
                  
                  
                  
                  
              
              
              