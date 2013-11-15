/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.gui;

import database.MysqlDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Matt
 */
public class GuiDB implements GuiDBInterface {

    @Override
    public int createBin(int row, int column) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeBin(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getBinId(int row, int column) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] getBinLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean login(int userId, String password, int type) {
        
        //Currently the log in system does not use hashing, this will be changed for the next milestone
        // for security reasons
        String query="SELECT count(*) FROM users where id="+userId+" and password='"+password+"' and type="+type+";";
        //System.out.println(query);
        try {
            ResultSet results=MysqlDB.runQuery(query);
            
            //If we get a return count of 1, then the user authenticated correctly
            if(results!=null && results.next() && results.getInt(1)==1)
            {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GuiDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    
    }
    
}
