package aplication;


import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	   System.out.println("=== TEST 1: seller findbyId ===");
       
       SellerDao sellerDao = DaoFactory.createSellerDao();
       
       Seller sl = sellerDao.findById(3);
       
       System.out.println(sl);
       
       System.out.println("=== TEST 2: seller findbyDepartment ===");
       Department department = new Department(2,null);
       List<Seller> list = sellerDao.findByDepartment(department);
       
       for(Seller obj : list) {
    	   System.out.println(obj);
       } 
       
       System.out.println("=== TEST 3: seller findAll ===");
       list = sellerDao.findAll();
       
       for(Seller obj : list) {
    	   System.out.println(obj);
       }
       
       System.out.println("=== TEST 4: Insert ===");
       Seller seller = new Seller(null, "João","joãoteste@gmail.com",new Date(), 2000.0, department);
       sellerDao.insert(seller);
       System.out.println("Inserted! new Id = "+ seller.getId());
       
	}

}
