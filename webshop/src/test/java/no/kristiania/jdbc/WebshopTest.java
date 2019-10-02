package no.kristiania.jdbc;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebshopTest {

    @Test
    void shouldRetrieveStoredProduct(){
        ProductDao dao = new ProducutDao();
        String productName = pickOne(new String[] {"Apples", "Bananas", "Coconuts", "Dates"});
        dao.insertProduct(productName);
        assertThat(dao.listAll()).contains(productName);
    }

    private String pickOne(String[] strings) {
        return strings[new Random().nextInt(strings.length)];

    }
}
