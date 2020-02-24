package com.epam.TASK;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.PrintStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
@SuppressWarnings("resource")
 class SimpleAndCompundInterest {
	private static final Logger LOGGER=LogManager.getLogger(SimpleAndCompundInterest.class);

public SimpleAndCompundInterest()
{
	LOGGER.info("This is Shreya");	

Scanner sc=new  Scanner(System.in);
Double principle_amount,rate,time,simple_interest,compound_interest;
//print_stream.print("Calculating Simple and Compound Interest\n");
LOGGER.info("Calculating Simple and Compound Interest");

LOGGER.info("Enter Principle Amount");	
//print_stream.print("Enter Principle Amount\n");
principle_amount=sc.nextDouble();

//print_stream.print("Enter Time\n");
LOGGER.info("Enter Time");
time=sc.nextDouble();

//print_stream.print("Enter Rate\n");
LOGGER.info("Enter Rate");
rate=sc.nextDouble();

simple_interest=((principle_amount*time*rate)/100);
LOGGER.info("Simple Interest is");
LOGGER.info(simple_interest);
//print_stream.print("Simple Interest is"+simple_interest);
//print_stream.print("\n");

compound_interest=principle_amount*(Math.pow((1+rate/100),time));
LOGGER.info("Compound Interest is");
LOGGER.info(compound_interest);
//print_stream.print("CompoundInterst is "+compound_interest);
System.exit(0);
}



}



