package com.SBS.springbookseller;

import com.SBS.springbookseller.DAO.entities.Book;
import com.SBS.springbookseller.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

@SpringBootApplication
public class SpringBookSellerApplication implements CommandLineRunner {

	@Autowired
	BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBookSellerApplication.class, args);
	}

//	public static Book generateRandomBook() {
//		Random random = new Random();
//		Book book = new Book();
//		book.setTitle("Title " + random.nextInt(100));
//		book.setDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
//		book.setReleaseDate(new Date(System.currentTimeMillis() - random.nextInt(1000000000)));
//		book.setAuthor("Author " + random.nextInt(100));
//		book.setPrice(random.nextDouble() * 100);
//		book.setImageUrl("https://via.placeholder.com/150/" + random.nextInt(256) + "/0000FF");
//		return book;
//	}

	@Override
	public void run(String... args) throws Exception {
//			for (int i = 0; i < 20; i++) {
//				Book book = generateRandomBook();
//				bookService.saveBook(book);
//			}
	}
}
