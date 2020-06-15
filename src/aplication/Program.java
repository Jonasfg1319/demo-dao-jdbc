package aplication;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       
       SellerDao sellerDao = DaoFactory.createSellerDao();
       
       Seller sl = sellerDao.findById(3);
       
       System.out.println(sl);
       
	}

}
