package maps

import (
	"fmt"
	"strconv"
)

func InvokeMap() {
	var person = make(map[string]string)
	person["firstName"] = "shahm"
	person["lastName"] = "Nattarshah"
	person["age"] = strconv.Itoa(39)
	fmt.Printf("person: %v\n", person)
	
	for k, v := range person {
		fmt.Println(k, v);
	}

	// slice of maps
	persons := make([]map[string]string, 1)
	persons[0]= make(map[string]string)
	persons[0]["firstName"] = "shahm"
	persons[0]["lastName"] = "Nattarshah"

	// persons[1]= make(map[string]string)
	// persons[1]["firstName"] = "ghazni"
	// persons[1]["lastName"] = "Nattarshah"

	person= make(map[string]string)
	person["firstName"] = "shah"
	person["lastName"] = "bros"

	persons = append(persons, person)

	fmt.Printf("persons: %v\n", persons)
}
