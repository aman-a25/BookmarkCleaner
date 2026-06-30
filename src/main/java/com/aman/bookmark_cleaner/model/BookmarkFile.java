package com.aman.bookmark_cleaner.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class BookmarkFile {

    private String checksum;

    private Roots roots;

    private int version;

}
