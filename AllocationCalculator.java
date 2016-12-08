package com.ekk.expenseallocation;

public class AllocationCalculator {
	private final int DEVELOPER_ALLOCATION = 1000;
	private final int QA_TESTER_ALLOCATION = 500;
	private final int MANAGER_ALLOCATION = 300;
	
	public AllocationCalculator() {
	}
	
	public int calculate(Position position) {
		if (position.equals(Position.DEVELOPER)) {
			return DEVELOPER_ALLOCATION;
		} else if (position.equals(Position.QA_TESTER)) {
			return QA_TESTER_ALLOCATION;
		} else if (position.equals(Position.MANAGER)) {
			return MANAGER_ALLOCATION;
		} else {
			return 0;
		}
	}
}
