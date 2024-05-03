package shopping;

import customer.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;
import org.junit.jupiter.api.Test;
import product.Product;
import product.ProductDao;

class ShoppingServiceTest {


  /**
   *
   */
  @Test
  void cartTest() {
    Cart cart = new Cart(new Customer(5L, "111-222-333"));

    IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,
        () -> cart.add(new Product("A2", 1), 2));
    Assertions.assertEquals("Невозможно добавить товар '%s' в корзину, т.к. нет необходимого количества товаров"
        .formatted("A2"), exception.getMessage());

    Product a1 = new Product("A1", 10);
    cart.add(a1, 3);
    Assertions.assertEquals(7,a1.getCount());


//    Assertions.assertEquals(cart.getProducts() );

  }

  /**
   * Проверка метода ShoppingServiceImpl.getCart
   */
  @Test
  void getCartTest() {
//    Cart cart = new Cart(new Customer(5L, "111-222-333"));

    ShoppingServiceImpl ssi = new ShoppingServiceImpl(new ProductDao());
    Assertions.assertEquals(new Cart(new Customer(5L, "111-222-333")),
        ssi.getCart(new Customer(5L, "111-222-333")));

  }

  @Test
  void getAllProducts() {
  }

  @Test
  void getProductByName() {
  }

  @Test
  void buy() {
  }
}