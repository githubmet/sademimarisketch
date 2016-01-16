package com.example.incir.myapplication.model;

import java.util.Map;

public class GithubPublicGistsStrong {

    private String id;
    private Map<String,FilesStrong> files;

    public Map<String, FilesStrong> getFiles() {
        return files;
    }

    public String getId() {
        return id;
    }

    public class FilesStrong{
        private String  filename;
        private String type;
        private String language;

        public String getFilename() {
            return filename;
        }

        public String getType() {
            return type;
        }

        public String getLanguage() {
            return language;
        }
    }
}
