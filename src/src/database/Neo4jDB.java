package database;

import java.sql.ResultSet;

/**
 * Singleton class to provide access to the Neo4j database
 * @author Matt
 */
public class Neo4jDB {
    
    private static Neo4jDB database;
    
    /**
     * Constructor, creates a Neo4j database connection
     */
    private Neo4jDB()
    {
        //Connect to the database
        
    }
    
    /**
     * Accessor to the database
     * @return database connection
     */
    static Neo4jDB get()
    {
        if(database==null)
        {
            database=new Neo4jDB();
        }
        
        return database;
    }
    
    /**
     * Runs the given query on the database
     * @param query A Cypher query to be run on the Neo4j database
     * @return The ResultSet generated from the query
     */
    protected ResultSet runQuery(String query)
    {
        
        return null;
    }
}
