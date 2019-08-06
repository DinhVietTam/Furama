package Controllers;

import Models.AccommodationInterface;
import Models.Customer;
import Models.Villa;

import java.util.Scanner;

public class ControllerDate1 {
    public static void showTask01(){
        // Khởi tạo đối tượng customer tạo sẵn dữ liệu hoặc tự nhập
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        System.out.print("Enter customer name: ");
        customer.setNameCustomer(scanner.nextLine());
        System.out.print("Enter customer age: ");
        customer.setAgeCustomer(scanner.nextInt());
        System.out.println(customer.toString());
        // Khởi tạo villa bằng cách truyền dữ liệu new Villa(tên,đối tương, số ngày thuê)
        Villa villa = new Villa("villa1", customer, 4);
        // hiển thị ra theo yêu cầu bài
        System.out.println(villa.getName());
        System.out.println(villa.getTotalDate());
        // hiển thị tiền mà khách hàng phải trả
        System.out.println(villa.getCostFinal());
    }
    public static void showTask02(){
        // chạy hàm check mở cửa hồ bơi
        // khởi tạo đối tượng customer gán sẵn dữ liệu hoặc tự nhập
        // tạo đối tượng villa như ở task 01
        // hiển thị số tiền khách hàng trả
        // hiển thị số ngày khách hàng đã thuê
    }
    public static void checkAndShowTimeOpenSwimmingPool(){
        // khởi tao float timeSwimming
        // tạo đối tượng Swingming swp;
        // get thời gian mở cửa ra mang hình
        // nhập vào thời gian customer muốn sử dụng hồ bơi
        // gán timeSwimming = dữ liệu vừa nhâp
        // if < 9 sout Go back at 9:00 am
        // else sout Welcome to Pool
    }
}
