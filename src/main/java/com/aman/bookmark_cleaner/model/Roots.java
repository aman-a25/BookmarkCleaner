package com.aman.bookmark_cleaner.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Roots {

    private BookmarkNode bookmark_bar;

    private BookmarkNode other;

    private BookmarkNode synced;

}