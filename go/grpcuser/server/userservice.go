package grpcuser

import (
	"context"
	"fmt"
	"math/rand"
	"net"
	"strconv"

	userpb "github.com/nshahm/learninggo/grpcuser/proto"
	"google.golang.org/grpc"
)

const (
	port = ":50052"
)

type UserServer struct {
	userpb.UnimplementedUserServiceServer
}

func (u UserServer) CreateUser(c context.Context, req *userpb.UserRequest) (*userpb.UserResponse, error) {

	var newId int64 = int64(rand.Intn(1000))
	return &userpb.UserResponse{
		Id: strconv.FormatInt(newId, 36),
		FirstName: req.GetFirstName(),
		LastName: req.GetLastName(),
		Age: req.GetAge(),
	}, nil 
}

func ListenGrpcServer() {
	listen, err := net.Listen("tcp", port);
	if err != nil {
		fmt.Printf("failed to listen on port %v", err);
		
	}

	grpcServer := grpc.NewServer();
	userpb.RegisterUserServiceServer(grpcServer, &UserServer{});
	fmt.Printf("Listen to server %v\n", listen.Addr())
	if err := grpcServer.Serve(listen); err != nil {
		fmt.Printf("Error listening to grpc server %v", err);
	}
}