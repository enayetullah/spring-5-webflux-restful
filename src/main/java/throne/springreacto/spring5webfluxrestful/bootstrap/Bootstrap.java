package throne.springreacto.spring5webfluxrestful.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import throne.springreacto.spring5webfluxrestful.domain.Category;
import throne.springreacto.spring5webfluxrestful.domain.Vendor;
import throne.springreacto.spring5webfluxrestful.repositories.CategoryRepository;
import throne.springreacto.spring5webfluxrestful.repositories.VendorRepository;

@Component
public class Bootstrap implements CommandLineRunner {


    private final CategoryRepository categoryRepository;
    private final VendorRepository vendorRepository;

    public Bootstrap(CategoryRepository categoryRepository, VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        categoryRepository.deleteAll().block();
        vendorRepository.deleteAll().block();
            //load data
            System.out.println("#### LOADING DATA ON BOOTSTRAP #####");

            categoryRepository.save(Category.builder()
                    .description("Fruits").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Nuts").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Breads").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Meats").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Eggs").build()).block();

            System.out.println("Loaded Categories: " + categoryRepository.count().block());

            vendorRepository.save(Vendor.builder()
                    .firstname("Joe")
                    .lastname("Buck").build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstname("Micheal")
                    .lastname("Weston").build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstname("Jessie")
                    .lastname("Waters").build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstname("Bill")
                    .lastname("Nershi").build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstname("Jimmy")
                    .lastname("Buffett").build()).block();

            System.out.println("Loaded Vendors: " + vendorRepository.count().block());


    }
}
