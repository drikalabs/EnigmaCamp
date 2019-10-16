package com.enigma.specification;

import com.enigma.entities.User;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Collection;

public class UserSpacification {
    public static Specification<User>findByCriterias(User user){
        return new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                final Collection<Predicate> predicates = new ArrayList<>();

                if(!StringUtils.isEmpty(user.getUserName())){
                    final Predicate userNamePredicate = criteriaBuilder.like(criteriaBuilder.lower(root.get("storeName")),"%"+user.getUserName()+"%");
                    predicates.add(userNamePredicate);
                }
                if(!StringUtils.isEmpty(user.getAddress())){
                    final Predicate addressPredicate = criteriaBuilder.like(criteriaBuilder.lower(root.get("address")),"%"+user.getAddress()+"%");
                    predicates.add(addressPredicate);
                }


                return criteriaBuilder.or(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
    }
}
