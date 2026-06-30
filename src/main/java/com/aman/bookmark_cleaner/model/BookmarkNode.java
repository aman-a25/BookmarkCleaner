package com.aman.bookmark_cleaner.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class BookmarkNode {

    private String id;

    private String name;

    private String type;

    private String url;

    private List<BookmarkNode> children;

}