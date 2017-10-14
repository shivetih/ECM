package com.test;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.tempuri.Calculator;
import org.tempuri.CalculatorLocator;
import org.tempuri.CalculatorSoap;

public class TestWS {

	public static void main(String[] args) throws ServiceException, RemoteException {
		// TODO Auto-generated method stub
     Calculator calc=new CalculatorLocator();
     CalculatorSoap calsoap=calc.getCalculatorSoap();
     System.out.println(calsoap.multiply(12, 13));
     
	}

}
