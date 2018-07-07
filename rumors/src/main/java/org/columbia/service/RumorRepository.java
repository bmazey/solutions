package org.columbia.service;

import org.columbia.dto.Rumor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RumorRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Rumor findRumorById(String id) {
        return jdbcTemplate.queryForObject("select * from rumors where id=?", new Object[] { id },
                new BeanPropertyRowMapper<>(Rumor.class));
    }
}
