package database;

import java.sql.ResultSet;

/**
 * Singleton class to provide access to the MySQL database via JDBC
 * @author Matt
 */
public class MysqlDB {
    
    private static MysqlDB database;
    
    /**
     * Constructor, creates a database connector
     */
    private MysqlDB()
    {
        //Connect to the database
        
    }
    
    /**
     * Accessor to the database
     * @return database connection
     */
    static MysqlDB get()
    {
        if(database==null)
        {
            database=new MysqlDB();
        }
        
        return database;
    }
    
    /**
     * Runs the given query on the database
     * @param query A SQL query to be run on the MySQL database
     * @return The ResultSet generated from the query
     */
    protected ResultSet runQuery(String query)
    {
        
        return null;
    }
}
