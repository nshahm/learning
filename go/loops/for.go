package loops

import (
	"fmt"
	"time"
)

func InvokeInfiniteFor() {
	var counter uint = 0
	// Infinite loop

	for {
		counter++
		time.Sleep(time.Second)
		fmt.Printf("%v ", counter)
	}

}

func InvokeForEach() {
	employees := []string{"a", "b", "c", "d"}
	for index, employee := range employees {
		fmt.Printf("%v %v", index, employee)
	}
}

func InvokeForCondition() {
	// for true {
	for {
		fmt.Println("success");
		break
	}
	i:= 1

	for i < 5 {
		fmt.Println(i)
		i++
	}
}
