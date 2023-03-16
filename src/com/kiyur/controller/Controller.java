package com.kiyur.controller;
import com.kiyur.service.*;
public class Controller {
	
	public static void main(String[]args)
	
	{   try {
		welcome w=new welcome();
		w.wish();
	}catch(Exception e) {
		e.printStackTrace();
	}
		
	}

}
