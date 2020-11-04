package main.lesson8.task4;

public class Application {
    public static void main(String[] args) {
        Client client1 = new Client("nameTest", "testAddress");
        client1.validate();
        Client client2 = new Client("nameTest", "testAddress");
        client2.validate();
        Client client3 = new Client("nameTest3", "testAddress3");
        client3.validate();
        User user1 = new User("userName", "seller");
        user1.validate();
        User user2 = new User("userName", "seller");
        user2.validate();
        User user3 = new User("userName3", "seller3");
        user3.validate();
        Branch branch1 = new Branch("branchName", "address1");
        branch1.validate();
        Branch branch2 = new Branch("branchName", "address1");
        branch2.validate();
        Branch branch3 = new Branch("branchName3", "address3");
        branch3.validate();
        Account account = new Account("accountName", "123");
        account.validate();
        Account account2 = new Account("accountName", "123");
        account2.validate();
        Account account3 = new Account("accountName3", "1234");
        account3.validate();
        System.out.println();
        ValidatorStub.printEntities();
    }
}
