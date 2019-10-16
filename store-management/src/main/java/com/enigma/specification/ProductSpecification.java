package com.enigma.specification;

import com.enigma.entities.Product;
import com.enigma.entities.Store;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Collection;

public class ProductSpecification {
    public static Specification<Product>findByCriterias(Product product){
        return new Specification<Product>() {
            @Override
            public Predicate toPredicate(Root<Product> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                final Collection<Predicate> predicates = new ArrayList<>();

                if (!StringUtils.isEmpty(product.getName())) {
                    final Predicate productNamePredicate = criteriaBuilder.like(criteriaBuilder.lower(root.get("Name")), "%" + product.getName() + "%");
                    predicates.add(productNamePredicate);
                }
                if (!StringUtils.isEmpty(product.getPrice())) {
                    final Predicate pricePredicate = criteriaBuilder.like(criteriaBuilder.lower(root.get("address")), "%" + product.getPrice() + "%");
                    predicates.add(pricePredicate);
                }


                return criteriaBuilder.or(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
    }
}
