package DataAccess;

import java.sql.ResultSet;
import java.sql.SQLException;
import Framework.AppConfiguration;
import Framework.AppException;

public class CoordenadasDAC extends SQLiteDataHelper{
    public CoordenadasDAC(){
        super(AppConfiguration.getDBPathConnection());
    }

    public ResultSet getAllCoordenadas() throws AppException{
        try{
            String sql = "SELECT EJ_CAPACIDAD, EJ_GEOLOCA, EJ_ARSENAL, EJ_FECHA_INGRESO";
            return getResultSet(sql);
        }
        catch (SQLException e){
            throw new AppException(e, getClass(), "getAllCoordenadas()");
        }
    }
    
}
