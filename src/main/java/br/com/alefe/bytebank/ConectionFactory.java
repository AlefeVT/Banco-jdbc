package br.com.alefe.bytebank;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConectionFactory {

    public Connection recuperarConexao() {
        try {
            return createDataSource().getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private HikariDataSource createDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("url do Banco de dados");
        config.setUsername("Username");
        config.setPassword("Senha");
        config.setMaximumPoolSize(10);

        return new HikariDataSource(config);
    }
}
