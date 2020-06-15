package aplication;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Department dp = new Department(3,"Guill");
       Seller sl = new Seller(21,"joao","joao@gmail.com",new Date(),1200.00,dp);
       
       SellerDao sellerDao = DaoFactory.createSellerDao();
       
       System.out.println(sl);
       
	}

}
