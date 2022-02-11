package types

import "fmt"

type PersonData struct {
	firstName string
	lastName string
	age uint
}

func InvokeTypes() {
	var person PersonData = PersonData {
		firstName: "shahm",
		lastName: "nattarshah",
		age: 39,
	}

	fmt.Printf("person: %+v\n", person)
}