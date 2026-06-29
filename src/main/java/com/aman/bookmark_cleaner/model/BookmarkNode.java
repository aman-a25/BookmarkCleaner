package com.aman.bookmark_cleaner.model;

import lombok.Data;
import java.util.List;

@Data
public class BookmarkNode {

    private String id;

    private String name;

    private String type;

    private String url;

    private List<BookmarkNode> children;

}