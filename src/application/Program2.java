package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao department = DaoFactory.createDepartmentDao();
		/**==== Teste INSERT ====
		Department newDepartment = new Department(9, "Social");
		department.insert(newDepartment);
		System.out.println("Inserted ! " + newDepartment.getId());**/
		
		/** === TESTE DELETE === 
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		department.deleteById(id);
		System.out.println("Delete Completed !");**/
		
		/** === TESTE FindByID e Update ===
		Department dep = new Department();
		dep = department.findById(1);
		dep.setName("Jogos");
		department.update(dep);**/
		
		/** === TESTE findAll === **/
		List<Department> list = new ArrayList<>();
		list = department.findAll();
		for(Department dp : list) {
			System.out.println(dp);
		}
		
		sc.close();

	}

}
