package main

import (
	"fmt"
	"time"

	"github.com/nshahm/learninggo/arrayslices"
	grpcemployee "github.com/nshahm/learninggo/grpcemployee/api"
	grpcclient "github.com/nshahm/learninggo/grpcuser/client"
	grpcserver "github.com/nshahm/learninggo/grpcuser/server"
	"github.com/nshahm/learninggo/interfaces"

	// "github.com/nshahm/learninggo/variables"
	"sync"

	"github.com/nshahm/learninggo/concurrency"
	"github.com/nshahm/learninggo/condition"
	"github.com/nshahm/learninggo/functions"

	"github.com/nshahm/learninggo/loops"
	"github.com/nshahm/learninggo/maps"
	"github.com/nshahm/learninggo/types"
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


	// grpc
	wg.Add(1)
	go grpcserver.ListenGrpcServer();

	// call grpc server to get userinfo
	grpcclient.CreateUserClient(&wg)

	// start the employee rest api using grpc gateway
	wg.Add(1)
	go grpcemployee.StartEmployeeRESTAPi()
	time.Sleep(time.Second * 3);
	grpcemployee.InvokeEmployeeRESTAPI(&wg)
	

	wg.Wait()
}