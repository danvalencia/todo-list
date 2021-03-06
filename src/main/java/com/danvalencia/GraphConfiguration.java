package com.danvalencia;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@EnableNeo4jRepositories("com.danvalencia.domain")
public class GraphConfiguration extends Neo4jConfiguration {
    @Override
    public SessionFactory getSessionFactory() {
        return new SessionFactory("com.danvalencia.domain");
    }
}
