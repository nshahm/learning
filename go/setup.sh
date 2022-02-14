go install google.golang.org/protobuf/cmd/protoc-gen-go@v1.26
go install google.golang.org/grpc/cmd/protoc-gen-go-grpc@v1.1
go install github.com/grpc-ecosystem/grpc-gateway/v2/protoc-gen-grpc-gateway

export PATH=$PATH:$(go env GOPATH)/bin

# home-manager switch with nixpkgs.protobuf

# mkdir  /grpcemployee/proto/google/api
curl https://raw.githubusercontent.com/googleapis/googleapis/master/google/api/annotations.proto > grpcemployee/proto/google/api/annotations.proto
curl https://raw.githubusercontent.com/googleapis/googleapis/master/google/api/http.proto > grpcemployee/proto/google/api/http.proto