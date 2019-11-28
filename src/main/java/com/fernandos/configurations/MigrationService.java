package com.fernandos.configurations;

import org.flywaydb.core.Flyway;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class MigrationService {

    @Inject
    private Flyway flyway;

    public void checkMigration() {
        flyway.clean();
        flyway.migrate();
        // This will print 1.0.0
        System.out.println(flyway.info().current().getVersion().toString());
    }

}
