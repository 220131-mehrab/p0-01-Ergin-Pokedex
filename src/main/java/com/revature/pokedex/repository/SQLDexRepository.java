package com.revature.pokedex.repository;

import com.revature.pokedex.domain.Pokemon;

import java.sql.*;
import java.util.List;

public class SQLDexRepository implements DexRepository{
    @Override
    public Pokemon getPokemon(String name) {
        Pokemon result = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa","");
            String query = "select * from pokemon where name ='" + name+"'";
            Statement statement = conn.createStatement();
            statement.execute(query);
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()){
                result = Pokemon.of()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getString(("name")))
                        .type1(resultSet.getString("type1"))
                        .type2(resultSet.getString("type2"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Pokemon> getPocketMonsters() {
        return null;
    }
}
