package org.yearup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.yearup.data.ProductDao;
import org.yearup.data.ShoppingCartDao;
import org.yearup.data.UserDao;
import org.yearup.models.Product;
import org.yearup.models.ShoppingCart;
import org.yearup.models.ShoppingCartItem;
import org.yearup.models.User;

import java.security.Principal;

// only logged in users should have access to these actions
@RestController
@RequestMapping
@CrossOrigin
public class ShoppingCartController {
    private ShoppingCartDao shoppingCartDao;
    private UserDao userDao;
    private ProductDao productDao;

//    @Autowired
//    public ShoppingCartController(ShoppingCartDao shoppingCartDao, UserDao userDao, ProductDao productDao) {
//        this.shoppingCartDao = shoppingCartDao;
//        this.userDao = userDao;
//        this.productDao = productDao;
//    }
}


    // each method in this controller requires a Principal object as a parameter
//    @GetMapping
//    public ShoppingCart getCart(Principal principal)
//    {
//        try
//        {
//            // get the currently logged in username
//            String userName = principal.getName();
//            // find database user by userId
//            User user = userDao.getByUserName(userName);
//            int userId = user.getId();
//
//            // use the shoppingcartDao to get all items in the cart and return the cart
//            return this.shoppingCartDao.getByUserId(userId);
//        }
//        catch(Exception e)
//        {
//            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
//        }
//    }

    // add a POST method to add a product to the cart - the url should be
    // https://localhost:8080/cart/products/15 (15 is the productId to be added
//    @PostMapping("/products/{productId}")
//    @PreAuthorize("isAuthenticated()")
//    public void addToCart(Principal principal, @PathVariable int productId) {
//        try {
//            if (principal != null) {
//                String userName = principal.getName();
//                User user = userDao.getByUserName(userName);
//                int userId = user.getId();
//                ShoppingCart cart = shoppingCartDao.getByUserId(userId);
//                if (cart == null) {
//                    cart = new ShoppingCart();
//                }
//                ShoppingCartItem item = cart.get(productId);
//                if (item == null) {
//                    item = new ShoppingCartItem();
//                    item.setQuantity(1);
//                    // Retrieve the product using the ProductDao
//                    Product product = productDao.getById(productId);
//                    if (product != null) {
//                        // Set the retrieved product in the ShoppingCartItem
//                        item.setProduct(product);
//                        cart.add(item);
//                    } else {
//                        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found.");
//                    }
//                } else {
//                    item.setQuantity(item.getQuantity() + 1);
//                }
//                shoppingCartDao.saveCart(userId, productId, item.getQuantity());
//            } else {
//                throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "User not authenticated.");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
//        }
//    }


    // add a PUT method to update an existing product in the cart - the url should be
    // https://localhost:8080/cart/products/15 (15 is the productId to be updated)
    // the BODY should be a ShoppingCartItem - quantity is the only value that will be updated
//    @PutMapping("/products/{productId}")
//    public void saveCart(Principal principal, @PathVariable int productId, @RequestBody ShoppingCartItem item) {
//        try {
//            String userName = principal.getName();
//            User user = userDao.getByUserName(userName);
//            int userId = user.getId();
//            ShoppingCart cart = shoppingCartDao.getByUserId(userId);
//            if (cart == null) {
//                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Shopping cart not found.");
//            }
//            ShoppingCartItem existingItem = cart.get(productId);
//            if (existingItem == null) {
//                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found in the cart.");
//            }
//            existingItem.setQuantity(item.getQuantity());
//            shoppingCartDao.saveCart(userId, productId, item.getQuantity());
//        } catch (Exception e) {
//            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
//        }
//    }


    // add a DELETE method to clear all products from the current users cart
    // https://localhost:8080/cart
//    public void clearCart(Principal principal) {
//        try {
//            String userName = principal.getName();
//            User user = userDao.getByUserName(userName);
//            int userId = user.getId();
//            ShoppingCart cart = shoppingCartDao.getByUserId(userId);
//            if (cart == null) {
//                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Shopping cart not found.");
//            }
//            shoppingCartDao.clearCart(userId);
//        } catch (Exception e) {
//            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
//        }
//    }
//}


