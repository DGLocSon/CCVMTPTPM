import java.util.ArrayList;
import java.util.Scanner;

public class demo {
    static ArrayList<String> todoList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addTodo();
                    break;
                case 2:
                    showTodos();
                    break;
                case 3:
                    removeTodo();
                    break;
                case 0:
                    System.out.println("Thoát chương trình 👋");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }

    static void showMenu() {
        System.out.println("\n===== TODO LIST =====");
        System.out.println("1. Thêm công việc");
        System.out.println("2. Xem danh sách");
        System.out.println("3. Xóa công việc");
        System.out.println("0. Thoát");
        System.out.print("Chọn: ");
    }

    static void addTodo() {
        System.out.print("Nhập công việc: ");
        String task = scanner.nextLine();
        todoList.add(task);
        System.out.println("✔ Đã thêm!");
    }

    static void showTodos() {
        if (todoList.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        System.out.println("📋 Danh sách công việc:");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + ". " + todoList.get(i));
        }
    }

    static void removeTodo() {
        showTodos();
        if (todoList.isEmpty()) return;

        System.out.print("Nhập số công việc cần xóa: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index >= 0 && index < todoList.size()) {
            todoList.remove(index);
            System.out.println("🗑 Đã xóa!");
        } else {
            System.out.println("Số không hợp lệ!");
        }
    }
}
