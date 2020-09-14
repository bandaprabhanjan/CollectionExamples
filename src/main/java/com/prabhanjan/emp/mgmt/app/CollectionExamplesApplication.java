package com.prabhanjan.emp.mgmt.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollectionExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionExamplesApplication.class, args);

		System.out.println("flatMap Example");
		List<String> part1 = Arrays.asList("A", "B", "C");
		List<String> part2 = Arrays.asList("A", "B", "C", "D", "E");
		List<DetailBean> details = new ArrayList<DetailBean>();
		DetailBean detail1 = new DetailBean(1001, part1);
		DetailBean detail2 = new DetailBean(1002, part2);
		details.add(detail1);
		details.add(detail2);
		Stream<String> flatMap = details.stream()
				.flatMap(element -> element.getParts().stream());
				flatMap.forEach(System.out::println);

		List<Integer> list = Arrays.asList(1, 2, 3);
		Integer reduce = list.stream().reduce(23, (a, b) -> a + b);
		System.out.println("Reduce print:" + reduce);

		List<Integer> list1 = Arrays.asList(10, 20, 30);
		Integer reduce2 = list1.stream().reduce(23, (a, b) -> a - b);
		System.out.println("Reduce Print Subtract:" + reduce2);

		System.out.println("Collect Termianl Operation");
		List<String> listOfStrings = Arrays.asList("Prabhanjan", "Ramesh", "Raju", "Ravi");
		List<String> collect = listOfStrings.stream().map(element -> element.toUpperCase())
				.collect(Collectors.toList());
		collect.forEach(System.out::println);

		Address address = new Address();
		address.setAddressLine1("BHEL");
		address.setAddressLine2("LingamPally");
		address.setCity("Hyderabad");

		EmployeeBean emp1 = new EmployeeBean(1001, "Emp1", 1000, "ASE", address);

		EmployeeBean emp2 = new EmployeeBean(1002, "Emp2", 2000, "SE", address);
		EmployeeBean emp3 = new EmployeeBean(1003, "Emp3", 3000, "SSE", address);
		EmployeeBean emp4 = new EmployeeBean(1004, "Emp4", 4000, "Lead", address);
		EmployeeBean emp5 = new EmployeeBean(1005, "Emp5", 5000, "Manager", address);

		DepartmentBean dept1 = new DepartmentBean(1, "CSE", "A-Block");
		DepartmentBean dept2 = new DepartmentBean(2, "ECE", "B-Block");

		Map<EmployeeBean, DepartmentBean> empDeptMap = new HashMap<EmployeeBean, DepartmentBean>();
		empDeptMap.put(emp1, dept1);
		empDeptMap.put(emp2, dept1);
		empDeptMap.put(emp3, dept1);
		empDeptMap.put(emp4, dept2);
		empDeptMap.put(emp5, dept2);

		Set<Entry<EmployeeBean, DepartmentBean>> entrySet = empDeptMap.entrySet();
		for (Entry<EmployeeBean, DepartmentBean> entry : entrySet) {
			System.out.println("EntrySet_Sysout");
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		Set<EmployeeBean> keySet = empDeptMap.keySet();
		for (EmployeeBean key : keySet) {

			System.out.println("KeySet_Sysout");
			System.out.println(key);
		}
	}

}
