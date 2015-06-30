
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
              
              
              
              ${impliciteObjects.attributeName} 
              
              request.getParameter("userName"); --- > ${param.userName}
              
              session.getAttribute("userName"); --->${sessionScope.userName}
              
              
              
              