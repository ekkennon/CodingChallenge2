package com.ekk.expenseallocation;

import java.util.ArrayList;

public class AllocationHierarchy {
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	private int allocation = 0;
	
	public AllocationHierarchy(boolean manager) {
		if (manager) {
			allocation = 300;
		}
	}
	
	public ArrayList<Employee> getDeptEmployees() {
		return employees;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
		addAllocation(employee.getAllocation());
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
		subtractAllocation(employee.getAllocation());
	}

	public int getAllocation() {
		return allocation;
	}

	private void addAllocation(int allocation) {
		this.allocation = getAllocation() + allocation;
	}
	
	private void subtractAllocation(int allocation) {
		this.allocation = getAllocation() - allocation;
	}
}
	