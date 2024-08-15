package edu.misena.senaviewer.model;
import java.util.List;
public class Magazine {

        // Atributos
        private int id;
        private String title;
        private String editionDate;
        private String editorial;
        private List<String> authors;

        // Constructor
        public Magazine(String title, String editionDate, String editorial) {
            this.title = title;
            this.editionDate = editionDate;
            this.editorial = editorial;
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
    }

