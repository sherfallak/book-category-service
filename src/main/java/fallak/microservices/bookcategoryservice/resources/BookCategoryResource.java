package fallak.microservices.bookcategoryservice.resources;

import fallak.microservices.bookcategoryservice.model.BookCategory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping
public class BookCategoryResource {

        @RequestMapping("/{userId}")
        public List<BookCategory> getBook(@PathVariable("userId") String userId) {
            return Collections.singletonList(
                    new BookCategory("Quran", "holy book", 5)
            );
        }
    }

