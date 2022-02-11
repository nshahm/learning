package interfaces

import "fmt"

type Speeder interface {
	speed() string
}

type Enginer interface {
	engine() string
}
// composing interface
type Vehicle interface {
	Speeder
	Enginer
}

// type Vehicle interface {
// 	speed() string
// 	engine() string
// }



type Car struct {
	make string;
	model uint;
}

func (c Car) speed() string {
	return "200km"
}

func (c Car) engine() string {
	return "Petrol"
}


type Truck struct {
	make string;
	model uint;
}

func (c Truck) speed() string {
	return "100km"
}

func (c Truck) engine() string {
	return "Diesel"
}

func InvokeInterfaces() {
	
	car := Car{
		make: "Honda",
		model: 2005,
	}

	printVehicle(car);

	truck := Truck{
		make: "Honda",
		model: 2005,
	}
	
	printVehicle(truck);

}

func printVehicle(v Vehicle) {
	fmt.Printf("engine: %v\n", v.engine())
	fmt.Printf("speed : %v\n", v.speed())
}