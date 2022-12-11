package Exercises.E06ObjectsAndClasses;

import java.util.Scanner;

public class P02Articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] articlesParts = scanner.nextLine().split(", ");
        String title = articlesParts[0];
        String content = articlesParts[1];
        String author = articlesParts[2];
        Article article = new Article(title, content, author);
        int commandsCount = Integer.parseInt(scanner.nextLine());
        for (int count = 1; count <= commandsCount; count++) {
            String command = scanner.nextLine();
            String commandName = command.split(": ")[0];
            String newValue = command.split(": ")[1];
            switch (commandName) {
                case "Edit":
                    article.setContent(newValue);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(newValue);
                    break;
                case "Rename":
                    article.setTitle(newValue);
                    break;
            }
        }
        System.out.println(article);
    }
}

class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void setContent(String newContent) {
        this.content = newContent;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }
}
