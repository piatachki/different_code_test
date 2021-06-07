@RestController
@RequestMapping
public class JPAResource {
    @Autowired
    private BooksRepository booksRepository;
 
    @GetMapping("/books")
    public Iterable<Book> readAllBooks() {
        return booksRepository.findAll();
    }
}
 
@Entity
class Book {
    @Id
    @GeneratedValue
    private Long id;
 
    private String name;
 
    @ManyToOne
    private Author author;
 
    /* getters and setters */
}
 
@Entity
class Author {
    @Id
    @GeneratedValue
    private Long id;
 
    private String name;
 
    /* getters and setters */
}
 
interface BooksRepository extends CrudRepository<Book, Long> { }
