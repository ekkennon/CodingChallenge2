package com.ekk.expenseallocation;

import static org.junit.Assert.*;

import org.junit.Test;

public class AllocationHierarchyTest {

	@Test
	public void testAllocationHierarchyDepartment() {
		AllocationHierarchy dept = new AllocationHierarchy(false);
		dept.addEmployee(new Employee(Position.MANAGER));
		dept.addEmployee(new Employee(Position.DEVELOPER));
		dept.addEmployee(new Employee(Position.QA_TESTER));
		dept.addEmployee(new Employee(Position.MANAGER));
		assertEquals(2100, dept.getAllocation());
	}
	
	@Test
	public void testAllocationHierarchyManager() {
		AllocationHierarchy m2 = new AllocationHierarchy(true);
		m2.addEmployee(new Employee(Position.MANAGER));
		m2.addEmployee(new Employee(Position.DEVELOPER));
		m2.addEmployee(new Employee(Position.QA_TESTER));
		assertEquals(2100, m2.getAllocation());
	}
}
