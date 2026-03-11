using System;

public class EmailAccount
{
    private string email;
    private string password;
    private double storageLimit;
    private double usedStorage;

    public EmailAccount(string email, string password, double storageLimit)
    {
        if (!email.Contains("@") || !email.Contains("."))
            throw new Exception("Email không hợp lệ!");

        if (password.Length < 8)
            throw new Exception("Password phải ít nhất 8 ký tự!");

        if (storageLimit <= 0)
            throw new Exception("StorageLimit phải > 0!");

        this.email = email;
        this.password = password;
        this.storageLimit = storageLimit;
        this.usedStorage = 0;
    }

    public void changePassword(string oldPass, string newPass)
    {
        if (oldPass != password)
        {
            Console.WriteLine("Sai mật khẩu cũ!");
            return;
        }

        if (newPass.Length < 8)
        {
            Console.WriteLine("Mật khẩu mới phải ≥ 8 ký tự!");
            return;
        }

        password = newPass;
        Console.WriteLine("Đổi mật khẩu thành công!");
    }

    public void uploadFile(double sizeGB)
    {
        if (usedStorage + sizeGB > storageLimit)
        {
            Console.WriteLine("Không đủ dung lượng!");
        }
        else
        {
            usedStorage += sizeGB;
            Console.WriteLine("Upload thành công!");
        }
    }

    public double calculateStoragePercentage()
    {
        return (usedStorage / storageLimit) * 100;
    }

    public void displayInfo()
    {
        Console.WriteLine("Email: " + email);
        Console.WriteLine("Dung lượng đã dùng: " + usedStorage + " GB");
        Console.WriteLine("Giới hạn: " + storageLimit + " GB");
        Console.WriteLine("Đã dùng: " + calculateStoragePercentage() + "%");
    }
}