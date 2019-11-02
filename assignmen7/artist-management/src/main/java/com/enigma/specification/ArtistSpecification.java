package com.enigma.specification;

import com.enigma.entity.Artist;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Collection;

public class ArtistSpecification {
    public  static Specification<Artist>findByKriteria(Artist artist){
        return new Specification<Artist>() {
            @Override
            public Predicate toPredicate(Root<Artist> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                final Collection<Predicate> predicates =new ArrayList<>();
                if (!StringUtils.isEmpty(artist.getArtistName())) {
                    final Predicate artistNamePredicate = criteriaBuilder.like(criteriaBuilder.lower(root.get("artistName")), "%" + artist.getArtistName() + "%");
                    predicates.add(artistNamePredicate);
                }
                if (!StringUtils.isEmpty(artist.getBornPlace())) {
                    final Predicate artistBornplacePredicate = criteriaBuilder.like(criteriaBuilder.lower(root.get("bornPlace")), "%" + artist.getBornPlace() + "%");
                    predicates.add(artistBornplacePredicate);
                }
                if (!StringUtils.isEmpty(artist.getGender())) {
                    final Predicate artistGenderPredicate = criteriaBuilder.like(criteriaBuilder.lower(root.get("gender")), "%" + artist.getGender() + "%");
                    predicates.add(artistGenderPredicate);
                }
                return criteriaBuilder.or(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
    }
}
