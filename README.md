# WebCrawler
**WebCrawler** is a Java-based console application designed to crawl web pages and extract relevant information. The program leverages the Jsoup library to parse and traverse HTML documents.

## Features

- Crawling web pages and extracting data.
- Support for handling multiple pages recursively.
- Parsing and traversing HTML using the Jsoup library.

## Installation and Usage

### Requirements

- Java Development Kit (JDK) version 20 or higher
- Java compiler (`javac`)

### Building the Project

1. Clone the repository or download the source code.

    ```sh
    git clone https://github.com/your-repo/WebCrawler.git
    cd WebCrawler
    ```

2. Compile the project using the command line.

    ```sh
    javac -d out -cp src/webCrawlerPackage/jsoup.jar src/webCrawlerPackage/*.java
    ```

### Running the Program

1. Run the program.

    ```sh
    java -cp out:webCrawlerPackage/jsoup.jar webCrawlerPackage.Main
    ```

2. Enter the URL of the website you want to crawl.

3. The program will crawl the specified website and output the extracted information.

## Usage Example

```plaintext
Enter the URL to crawl:
https://example.com
Crawling https://example.com...
Found link: https://example.com/about
Found link: https://example.com/contact
...
```

## Project Structure

- **Main.java**: The entry point of the application, which initializes the crawler.
- **WebCrawler.java**: The main class that handles the crawling logic.
- **jsoup.jar**: The Jsoup library used for parsing HTML.

## License

This project is licensed under the MIT License. See the LICENSE file for details.

---

Let me know if there are any specific details or sections you'd like to add or modify!
