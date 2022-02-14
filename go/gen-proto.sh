
# user
protoc --go_out=. --go_opt=paths=source_relative \
    --go-grpc_out=. --go-grpc_opt=paths=source_relative \
    grpcuser/proto/user.proto

# employee with grpc gateway
protoc -I ./grpcemployee/proto \
  --go_out ./grpcemployee --go_opt=paths=source_relative \
  --go-grpc_out ./grpcemployee --go-grpc_opt=paths=source_relative \
  --grpc-gateway_out ./grpcemployee --grpc-gateway_opt=paths=source_relative \
  grpcemployee/proto/employee/employee.proto