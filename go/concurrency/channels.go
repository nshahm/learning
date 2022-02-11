package concurrency

import (
	"fmt"
	"sync"
	"time"
)

var chMultipleUsingSelect = make(chan string, 50)

// empty allocated changed only used for closing channel - e.g. logger - starts and stops only when server shutdown or last statement
var doneReceiver = make(chan struct{})

func InvokeChannels(wg *sync.WaitGroup) {
	ch := make(chan string)
	wg.Add(2)
	go Send(ch, wg)
	go Receive(ch, wg)

	chMultiple := make(chan string)
	wg.Add(2)
	go SendMany(chMultiple, wg)
	go ReceiveMany(chMultiple, wg)

	// Channel using select

	// wg.Add(1)
	SendManySelect()
	go ReceiveManySelect(wg)
	
	time.Sleep(time.Second * 5)
	doneReceiver <- struct{}{}
}

func Receive(receiver <-chan string, wg *sync.WaitGroup) {
	var message string = <-receiver
	fmt.Printf(" Receive %v\n", message)
	wg.Done()
}

func Send(sender chan<- string, wg *sync.WaitGroup) {
	sender <- "hello"
	wg.Done()
}

func ReceiveMany(receiver <-chan string, wg *sync.WaitGroup) {

	for {
		// ok bool will show if the channel is closed.
		if message, ok := <-receiver; ok {
			fmt.Printf("Receive Many %v\n", message)
		} else {
			break
		}
	}
	// We can also process with range
	// for message := range receiver {
	// 	fmt.Printf("Receive Many using range %v\n", message)
	// }
	// wg.Done()
}

func SendMany(sender chan<- string, wg *sync.WaitGroup) {
	sender <- "hello again"
	sender <- "hello one more"
	sender <- "hello another one"
	// manually closing the channel after all message is sent
	close(sender)
	wg.Done()
}

func SendManySelect() {
	chMultipleUsingSelect <- "hello again :: select "
	chMultipleUsingSelect <- "hello one more :: select"
	chMultipleUsingSelect <- "hello another one :: select"
	// close(chMultipleUsingSelect)
	// wg.Done()
	// manually closing the channel after all message is sent
}

func ReceiveManySelect(wg *sync.WaitGroup) {

	for {
		select {
		case message := <-chMultipleUsingSelect:
				fmt.Printf("Received using select %v\n", message)
		case <-doneReceiver:
				// wg.Done()
				// close(chMultipleUsingSelect)
				close(chMultipleUsingSelect)
				// break;
			
		}
	}

}
