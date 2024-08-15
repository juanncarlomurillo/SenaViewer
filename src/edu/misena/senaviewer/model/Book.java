package edu.misena.senaviewer.model;
import java.util.List;
public class Book{
        // Atributos
        private int id;
        private String title;
        private String editionDate;
        private String editorial;
        private List<String> authors;
        private String isbn;
        private boolean readed;
        private int timeReaded;

        // Constructor
        public Book(String title, String editionDate, String editorial, String isbn) {
            this.title = title;
            this.editionDate = editionDate;
            this.editorial = editorial;
            this.isbn = isbn;
            this.readed = false;
            this.timeReaded = 0;
        }

        // Getters y Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getEditionDate() {
            return editionDate;
        }

        public void setEditionDate(String editionDate) {
            this.editionDate = editionDate;
        }

        public String getEditorial() {
            return editorial;
        }

        public void setEditorial(String editorial) {
            this.editorial = editorial;
        }

        public List<String> getAuthors() {
            return authors;
        }

        public void setAuthors(List<String> authors) {
            this.authors = authors;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public boolean isReaded() {
            return readed;
        }

        public void setReaded(boolean readed) {
            this.readed = readed;
        }

        public int getTimeReaded() {
            return timeReaded;
        }

        public void setTimeReaded(int timeReaded) {
            this.timeReaded = timeReaded;
        }
    }


