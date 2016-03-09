package by.givebook.controllers.offer;

import by.givebook.controllers.GenericController;
import by.givebook.entities.offer.BookCondition;
import by.givebook.services.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Default class description.
 *
 * @author P.Sinitski
 * @version 1.0
 * @since 04.03.2016
 */
@RestController
@RequestMapping("/bookConditions")
public class BookConditionController extends GenericController<BookCondition,SimpleService<BookCondition>> implements javax.servlet.Filter {

    @Autowired
    public BookConditionController(@Qualifier("bookConditionService") SimpleService<BookCondition> service) {
        super(service);
    }
}