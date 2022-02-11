package condition

import "fmt"

func InvokeIfElse() {

	persons := []string{"a", "b", "c", "d", "e"}
	for index, person := range persons{
		fmt.Printf("%v\n", person);
		if index == 3 {
			fmt.Println("Matched with index 3 and continue the loop")
			continue
		} else if index == 4{
			fmt.Println("Matched with index 4 and break the loop")
			break
		} 
	}
}