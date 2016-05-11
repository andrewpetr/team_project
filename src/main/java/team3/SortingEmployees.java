package team3;

import java.util.Comparator;

class SortingEmployees implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.getName().equals(e2.getName()))
			if (e1.getLastname().equals(e2.getLastname())) {
				if (e1.getPosition().equals(e2.getPosition())) {
					if (e1.getSalary() == e2.getSalary()) {
						return 0;
					} else {
						if (e1.getSalary() > e2.getSalary()) {
							return 1;
						} else {
							return -1;
						}
					}
				} else
					return e1.getPosition().compareTo(e2.getPosition());
			} else
				return e1.getLastname().compareTo(e2.getLastname());
		else
			return e1.getName().compareTo(e2.getName());
	}
}
