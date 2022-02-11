package grpcuser

import (
	"context"
	"fmt"
	"sync"
	"time"

	userpb "github.com/nshahm/learninggo/grpcuser/proto"
	"google.golang.org/grpc"
)

const (
	address = "localhost:50052"
)

func CreateUserClient(wg *sync.WaitGroup) {
	conn, err := grpc.Dial(address, grpc.WithInsecure(), grpc.WithBlock())
	if err != nil {
		fmt.Printf("Unable to connect to grpc server %v", err);
	}
	defer conn.Close();
	client := userpb.NewUserServiceClient(conn);

	ctx, cancel := context.WithTimeout(context.Background(), time.Second)
	defer cancel()

	newUser := userpb.UserRequest{
		FirstName: "shahm",
		LastName: "Nattarshah",
		Age: 39,
	}

	userResponse, err := client.CreateUser(ctx, &newUser)
	if err != nil {
		fmt.Printf("Error in creating user %v", err)
	}
	fmt.Printf("User response %v", userResponse);

	wg.Done()
	
	
}