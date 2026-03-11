using System;

class Program
{
    static void Main(string[] args)
    {
        EmailAccount acc = new EmailAccount("user@gmail.com", "12345678", 15);

        acc.uploadFile(5);
        acc.uploadFile(4);

        acc.changePassword("12345678", "newpass123");

        acc.displayInfo();
    }
}