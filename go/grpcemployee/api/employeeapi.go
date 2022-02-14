package grpcemployee

import (
	"bytes"
	"context"
	"fmt"
	"io/ioutil"
	"math/rand"
	"net/http"
	"strconv"
	"sync"

	"github.com/grpc-ecosystem/grpc-gateway/v2/runtime"
	employeepb "github.com/nshahm/learninggo/grpcemployee/employee"
)

type EmployeeApiServer struct {
	employeepb.UnimplementedEmployeeServiceServer
	// employeepb.UnsafeEmployeeServiceServer
}

func (e EmployeeApiServer) CreateEmployee(ctx context.Context, req *employeepb.EmployeeRequest) (*employeepb.EmployeeResponse, error) {
	var newId int64 = int64(rand.Intn(1000))
	return &employeepb.EmployeeResponse{
		Id:        strconv.FormatInt(newId, 36),
		FirstName: "hello " + req.GetFirstName(),
		LastName:  req.GetLastName(),
		Age:       req.GetAge(),
	}, nil
}

func StartEmployeeRESTAPi() {
	ctx := context.Background()

	ctx, cancel := context.WithCancel(ctx)
	defer cancel()

	mux := runtime.NewServeMux()
	err := employeepb.RegisterEmployeeServiceHandlerServer(ctx, mux, &EmployeeApiServer{})
	
	if err != nil {
		fmt.Printf("Error registering gateway service handler %v", err)
	}

	if err := http.ListenAndServe(":8081", mux); err != nil {
		fmt.Printf("Failed to start Http endpoint %v", err)
	}
}

func InvokeEmployeeRESTAPI(wg *sync.WaitGroup) {
	json := bytes.NewBuffer([]byte(`{
		"firstName": "ghazni",
		"lastName": "nattarshah",
		"age": 39
	  }`))
	resp, err := http.Post("http://localhost:8081/employee/create", "application/json", json);
	
	if err != nil  {
		fmt.Printf("Error in invoking rest api %v\n", err);
	};

	if resp != nil {
		body, _ := ioutil.ReadAll(resp.Body);
		fmt.Printf("REST API response %v \n", string(body))
	}
	wg.Done()
	defer resp.Body.Close()

}
