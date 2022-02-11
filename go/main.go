package main

import (
	"fmt"
	"learninggo/arrayslices"
	"learninggo/interfaces"

	// "learninggo/variables"
	"learninggo/concurrency"
	"learninggo/condition"
	"learninggo/functions"
	"learninggo/loops"
	"learninggo/maps"
	"learninggo/types"
	"sync"
)

var (
	global = "global"
	packageLevel = "packageLevel"
)
var wg =  sync.WaitGroup{}

func main() {

	// global package level variable
	fmt.Println(global, packageLevel);

	// variables and values at same line - compiler implies the tupe
	// variables.InvokeVariables();

	// Array pointers
	arrayslices.InvokeArray()
	arrayslices.InvokeSlices()

	//loops
	// loops.InvokeInfiniteFor();
	loops.InvokeForEach()
	loops.InvokeForCondition()

	// condition
	condition.InvokeIfElse()
	condition.InvokeSwitch()

	// functions
	res := functions.Sum(1,2)
	fmt.Printf("%v\n", res)

	//  functions with multiple returns
	sum, minus, multiple, divide := functions.Arithmetic(10,2)
	fmt.Printf("sum %v, minus %v, multiple %v, division %v \n", sum, minus, multiple, divide)


	// functions - with receiver function
	functions.InvokeReceiverFunction();

	// map
	maps.InvokeMap()

	// types
	types.InvokeTypes()

	
	

	// Interface
	interfaces.InvokeInterfaces()

	// routines
	concurrency.InvokeRoutine()
	
	concurrency.InvokeRoutineWithNoInfiniteLoop(&wg)
	
	// Channels
	concurrency.InvokeChannels(&wg)
	wg.Wait()
}