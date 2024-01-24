package com.belov.hibernate.repository;

import com.belov.hibernate.domain.Order;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class ProductRepository {

    @PersistenceContext
    private final EntityManager entityManager;

    public List<String> getProductName(String customerName) {
        List<String> products = new ArrayList<>();
        Query query = entityManager.createQuery(
                "select o.productName, count(o.amount) from Order o where customer.name ilike :customerName group by o.productName");
        query.setParameter("customerName", customerName);
        List<Object[]> objects = query.getResultList();
        for (Object[] o : objects) {
            products.add((String) o[0] + (Long) o[1]);
        }
        return products;
    }
}