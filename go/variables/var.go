package variables

import "fmt"

func InvokeVariables() {
	var packageName = "Go learning"
	const author = "shahm"
	// space automatically added before and after
	fmt.Println("Welcome to", packageName, "by", author)

	fmt.Printf("Welcome to %v by %v - printed using printf\n", packageName, author)

	// scan userinput
	var userName string;
	var userAge uint; // only accept positive numbers
	fmt.Scan(&userName);
	fmt.Scan(&userAge);
	fmt.Printf("Hello %v and your age is %v \n", userName, userAge);
	// fmt.Scanf("Enter username", &userName);
	// fmt.Scanf("Enter age", &userAge);

	var firstName, lastName = "shahm", "nattarshah";
	fmt.Printf("%v %v", firstName, lastName);
}