package arrayslices

import "fmt"

func InvokeArray() {
	fmt.Println("Array and slices");

	var employee = [5]string{"a", "b", "c", "d"}
	employee[4] = "assigned"
	fmt.Println(employee);

	// length of array
	fmt.Printf("length of array %v\n", len(employee));
}

func InvokeSlices() {
	 employees := []string{}
	// var employees []string
	employees = append(employees, "new slice")
	
	fmt.Println(employees, len(employees), employees[0]);
}
