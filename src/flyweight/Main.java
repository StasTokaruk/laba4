package flyweight;

/**
 * The flyweight.Main class demonstrates the usage of the flyweight.Flyweight pattern for managing
 * file system components (files and directories) with shared icons.
 * It creates a flyweight.FlyweightFactory to manage flyweight.Flyweight instances for icons,
 * and illustrates the creation of file system components with those icons.
 */
public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
// Створення іконок
        Flyweight fileIcon = factory.getFlyweight("File Icon");
        Flyweight directoryIcon = factory.getFlyweight("Directory Icon");
        Flyweight fileIcon2 = factory.getFlyweight("File Icon");
// Створення файлів та директорій
        FileSystemComponent file1 = new File("file1.jpg", fileIcon);
        FileSystemComponent file2 = new File("file2.jpg", fileIcon2);
        Directory directory1 = new Directory("Documents", directoryIcon);
        Directory directory2 = new Directory("Documents2", directoryIcon);
// Додавання
        directory1.add(file1);
        directory1.add(file2);
        directory1.add(directory2);
// Виведення
        directory1.draw();
    }
}