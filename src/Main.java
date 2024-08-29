package edu.misena.senaviewer.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        List<Movie> movies = new ArrayList<>();
        List<Magazine> magazines = new ArrayList<>();
        List<Chapter> chapters = new ArrayList<>();
        List<Series> series = new ArrayList<>();

        while (true) {
            System.out.println("Welcome to Sena Viewer");
            System.out.println("1. Add a Book");
            System.out.println("2. Add a Movie");
            System.out.println("3. Add a Magazine");
            System.out.println("4. Add a Chapter");
            System.out.println("5. Add a Serie");
            System.out.println("6. Exit");

            int option = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (option) {
                case 1:
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter edition date: ");
                    String bookEditionDate = scanner.nextLine();
                    System.out.print("Enter editorial: ");
                    String bookEditorial = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String bookIsbn = scanner.nextLine();

                    Book book = new Book(bookTitle, bookEditionDate, bookEditorial, bookIsbn);
                    books.add(book);
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.print("Enter movie title: ");
                    String movieTitle = scanner.nextLine();
                    System.out.print("Enter genre: ");
                    String movieGenre = scanner.nextLine();
                    System.out.print("Enter creator: ");
                    String movieCreator = scanner.nextLine();
                    System.out.print("Enter duration: ");
                    int movieDuration = scanner.nextInt();
                    System.out.print("Enter year: ");
                    int movieYear = scanner.nextInt();

                    Movie movie = new Movie(movieTitle, movieGenre, movieCreator, movieDuration, movieYear);
                    movies.add(movie);
                    System.out.println("Movie added successfully!");
                    break;

                case 3:
                    System.out.print("Enter magazine title: ");
                    String magazineTitle = scanner.nextLine();
                    System.out.print("Enter edition date: ");
                    String magazineEditionDate = scanner.nextLine();
                    System.out.print("Enter editorial: ");
                    String magazineEditorial = scanner.nextLine();

                    Magazine magazine = new Magazine(magazineTitle, magazineEditionDate, magazineEditorial);
                    magazines.add(magazine);
                    System.out.println("Magazine added successfully!");
                    break;

                case 4:
                    System.out.print("Enter chapter title: ");
                    String chapterTitle = scanner.nextLine();
                    System.out.print("Enter duration: ");
                    int chapterDuration = scanner.nextInt();
                    System.out.print("Enter year: ");
                    int chapterYear = scanner.nextInt();

                    Chapter chapter = new Chapter(chapterTitle, chapterDuration, chapterYear);
                    chapters.add(chapter);
                    System.out.println("Chapter added successfully!");
                    break;

                case 5:
                    System.out.print("Enter series title: ");
                    String seriesTitle = scanner.nextLine();
                    System.out.print("Enter genre: ");
                    String seriesGenre = scanner.nextLine();
                    System.out.print("Enter duration: ");
                    int seriesDuration = scanner.nextInt();

                    Series serie = new Series(seriesTitle, seriesGenre, seriesDuration);
                    series.add(serie);
                    System.out.println("Serie added successfully!");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
