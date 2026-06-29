# Bookmark Cleaner

> A Spring Boot application that automatically validates, cleans, and
> updates browser bookmarks while preserving the original folder
> hierarchy.

------------------------------------------------------------------------

## Overview

Bookmark Cleaner is a backend-focused Spring Boot project built to
solve a real-world problem: maintaining a large collection of browser
bookmarks.

Over time, bookmarks become outdated due to website migrations, domain
changes, redirects, or broken links. Manually validating hundreds of
bookmarks---especially when they are organized into deeply nested
folders---is tedious and time-consuming.

This application automates the entire process by reading the bookmark files saved by the browser, 
validating every bookmark, updating redirected URLs,
removing invalid bookmarks, and generating a cleaned bookmark file while
preserving the original folder structure.

------------------------------------------------------------------------

# Motivation

I frequently bookmark websites that I use in my daily workflow. This
includes documentation, AI tools, programming resources, anime, movies,
and many other websites.

Many of these websites eventually:

-   Change their domain
-   Permanently redirect to another URL
-   Stop working completely

As a result, my bookmark collection became cluttered with:

-   Broken bookmarks
-   Duplicate bookmarks
-   Outdated redirected URLs

Since my bookmarks are organized into multiple nested folders containing
hundreds of entries, manually maintaining them became impractical.

This project was created to automate that maintenance process while also
serving as a practical Spring Boot learning project.

------------------------------------------------------------------------

# Problem Statement
-   Read the bookmark files saved by browser directly
-   parse the bookmark structure.
-   Preserve the complete folder hierarchy.
-   Validate every bookmark URL.
-   Remove bookmarks that are no longer accessible.
-   Update redirected bookmarks with their final destination.
-   Generate an updated bookmark file without modifying the original
    folder structure.

------------------------------------------------------------------------

# Features

-   Read exported browser bookmark files
-   Parse nested bookmark folders recursively
-   Validate HTTP/HTTPS URLs
-   Detect redirects
-   Update redirected bookmarks automatically
-   Remove broken bookmarks
-   Preserve the original folder hierarchy
-   Generate a cleaned bookmark file
-   Lightweight frontend served directly by Spring Boot

------------------------------------------------------------------------

# Project Workflow

## Phase 1 -- Read & Parse

-   Read the exported bookmark JSON file.
-   Deserialize JSON into Java objects.
-   Traverse nested bookmark folders recursively.
-   Collect every bookmark for validation.

------------------------------------------------------------------------

## Phase 2 -- Validate URLs

Each bookmark is checked through an HTTP request.

Possible outcomes:

### Valid

The bookmark is kept unchanged.

### Redirected

The stored URL is replaced with the final destination URL.

### Broken

The bookmark is removed from the generated bookmark file.

------------------------------------------------------------------------

## Phase 3 -- Generate Updated Bookmark File

After validation:

-   Broken bookmarks are removed.
-   Redirected URLs are updated.
-   Folder hierarchy remains unchanged.
-   A new bookmark file is generated.

The generated file can safely replace the original bookmark file.

------------------------------------------------------------------------

# Technologies Used

-   Java
-   Spring Boot
-   Maven
-   Embedded Tomcat server
-   Jackson (JSON Processing)
-   HTML
-   CSS
-   JavaScript

------------------------------------------------------------------------

# Dependencies

-   Spring Boot Starter Web
-   Lombok
-   Spring Boot Starter Test

------------------------------------------------------------------------

# Project Structure

```text
src
├── main
│   ├── java
│   │   └── com.aman.bookmark_cleaner
│   │       ├── controller
│   │       ├── model
│   │       │   └── BookmarkNode.java
│   │       ├── parser
│   │       ├── service
│   │       └── BookmarkCleanerApplication.java
│   └── resources
│       ├── static
│       ├── templates
│       └── application.properties
└── test
    └── java
        └── com.aman.bookmark_cleaner
```

------------------------------------------------------------------------

# Why No Database?

The application processes bookmark files directly.

Since the bookmark file itself is both the input and output, a database
would add unnecessary complexity.

------------------------------------------------------------------------

# Why No Thymeleaf?

The frontend is intentionally built using plain HTML, CSS, and
JavaScript served from Spring Boot's `resources/static` directory.

This keeps the project lightweight while maintaining a clean separation
between the frontend and backend.

------------------------------------------------------------------------

# Requirements

-   Java 25 
-   Maven
-   Spring Boot

------------------------------------------------------------------------

# Getting Started

## Clone the Repository

``` bash
git clone https://github.com/aman-a25/BookmarkCleaner.git
```

## Navigate into the Project

``` bash
cd smart-bookmark-cleaner
```

## Build the Project

``` bash
mvn clean install
```

## Run the Application

``` bash
mvn spring-boot:run
```

------------------------------------------------------------------------

# Future Improvements

-   Support additional browser bookmark formats
-   Detect duplicate bookmarks automatically
-   Parallel URL validation for faster execution
-   Validation reports
-   Progress bar during processing
-   Scheduled bookmark health checks
-   Docker support
-   Comprehensive unit and integration tests

------------------------------------------------------------------------

# Learning Outcomes

This project helped strengthen practical knowledge of:

-   Spring Boot
-   REST APIs
-   File Processing
-   JSON Parsing
-   Recursive Tree Traversal
-   HTTP Communication
-   Global Exception Handling
-   Clean Project Architecture
-   Backend and Frontend Integration

------------------------------------------------------------------------

# License

This project is open-source and intended for educational, learning, and
personal use.
