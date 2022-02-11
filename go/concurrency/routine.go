package concurrency

import (
	"fmt"
	"sync"
	"time"
)

func InvokeRoutine() {
	var counter uint = 0

	// with for loop the go routines main thread wait until its child completes.
	for {
		counter++
		go printCounter(counter)
		if counter == 10 {
			time.Sleep(time.Second * 3)
			break
		}
	}
}

func InvokeRoutineWithNoInfiniteLoop(wg *sync.WaitGroup) {
	counter := 1;
	// counter++
	wg.Add(1)
	go printCounterWaitGroup(uint(counter), wg)
}

func printCounter(counter uint) {
	fmt.Printf("counter: %v\n", counter)
}

func printCounterWaitGroup(counter uint, wg *sync.WaitGroup) {
	counter++
	fmt.Printf("counter - wg: %v\n", counter)
	// if (counter == 10) {
	// 	wg.Done()
	// }
	wg.Done()
}
