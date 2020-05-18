package com.airhacks.ping.boundary;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("calculator")
public class CalculatorApi {
    @Inject
    Calculator calculator;

    @POST
    public Integer processExpression(String expression) {
        return calculator.processRequest(expression);
    }

    @GET
    public int hello() {
        return calculator.getNumber();
    }
}
