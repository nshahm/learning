package functions

import "fmt"

type Employee struct {
	firstName string
	lastName string
	age uint
}

func (e Employee) FullName() string {
	return e.firstName + " " + e.lastName;
}

// Receiver function with pointers
func (e *Employee) Age(age uint) {
	e.age = age
}

func InvokeReceiverFunction() {
	e := Employee{
		firstName: "Shahm",
		lastName: "Nattarshah",
	}
	// fullname is receiver function
	fmt.Printf(" Receiver function: %v\n", e.FullName())

	// receiver function invoke with pointers
	e.Age(39);
	fmt.Printf("receiver function with pointers: %v\n", e);
}