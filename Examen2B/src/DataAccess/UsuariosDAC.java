package DataAccess;

import java.sql.SQLException;
import javax.security.auth.login.AppConfigurationEntry;
import java.sql.ResultSet;
import java.sql.SQLException;
import Framework.AppConfiguration;
import Framework.AppException;


public class UsuariosDAC extends SQLiteDataHelper{
    public UsuariosDAC(){
        super(AppConfiguration.getDBPathConnection());
    }

    public ResultSet getAllUsuarios() throws AppException{
        try{
            String sql = "SELCT EJ_ID_USUARIOS, EJ_USUARIOS, EJ_CONTRASENA_ENCRIPTADA FROM USUARIOS";
            return getResultSet(sql);

        }
        catch(SQLException e){
            throw new AppException(e, getClass(), "getAllUsuarios()");
        }
    }
}