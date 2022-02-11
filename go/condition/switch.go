package condition

import "fmt"

func InvokeSwitch() {
	cities := []string{"chennai", "New york", "london", "germany", "other"}

	for _, city := range cities {
		switch city {
			case "chennai":
				fmt.Println("Asia")
			case "New york":
				fmt.Println("USA")
			case "london", "germany":
				fmt.Println("Europe")
			default: 
				fmt.Println("No region")
		}
	}

}