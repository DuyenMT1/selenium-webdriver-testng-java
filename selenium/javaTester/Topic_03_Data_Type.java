package javaTester;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic_03_Data_Type {
	
	public static void main() {
		
		// Khai báo biến
		
		// 1 - Kiểu dữ liệu của biến
		// 2 - Tên biến
		// 3 - Giá trị của biến
		
		// 2 Cách khai báo và gán giá trị 
		
		// 1 - Vừa khai báo vừa gán trực tiếp luôn:
		// String name = "Automation Testing";
		// 2 - Khai báo trước rồi gán sau 
		// String name;
		// name = "Automation Testing";
		// name = "Automation FC";
		
		// 2 loại kiểu dữ 
		
		// I - Kiểu dữ liệu nguyên thuỷ ()
		//(int/ long/ double (float)/ boolean)
		
		// 8 loại
		
		// Số nguyên: byte/ short/ int/ long
		byte bNumber = 5;
		
		short sNumber = 500;
		
		int iNUmber = 6000;
		
		long lNumber = 123456789;
		
		// Số thực: float/ double
		
		float salary = 15.5f;
		
		double point = 9.8d;
		
		// Kí tự: char
		// Dấu nháy đơn ''
		// Chứa duy nhất 1 ký 
		char a = 'a';
		
		// Logic: boolean
		boolean marriedStatus = true;
		marriedStatus = false;
		
		// II - Kiểu dữ liệu tham chiếu ()
		
		// Chuỗi: String (Chữ/ Số/ kí tự đặc biêt/...)
		//Dấu nháy đôi
		String emailInvalid = "afc~!@#@gami.com";
		
		// Class/ Interface (DateTime)
		Date date = new Date();
		
		WebDriver driver = new FirefoxDriver();
		
		// Đối tượng: Object
		Object students;
		
		// Mảng: Array (Khai báo số lượng dữ liệu ) - Cố định số 
		 int numbers[] = {15, 20, 45};
		 String addresses[] = {"Ha Noi", "HCM", "Da Nang"};		
		
		// List/ Set/ Queue (Collection) - 
		 List<Integer> studentNUmber = new ArrayList<Integer>();
		 List<String> studentAddress = new ArrayList<String>();
		 
		 Set<String> studentCity = new LinkedHashSet<String>();
		
		
	}

}
