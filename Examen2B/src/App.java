import BusinessLogic.*;
import BusinessLogic.Usuarios;
import BusinessLogic.Coordenadas;
import Framework.AppConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        AppConfiguration.load("src/config.properties");
        System.out.println(AppConfiguration.getDBName());
        System.out.println(AppConfiguration.getDBPathConnection());

        System.out.print("EJ_CAPACIDAD\t\t");
        System.out.print("EJ_GEOLOCA\t\t");
        System.out.print("EJ_ARSENAL\t\t");
        System.out.print("EJ_FECHA_INGRESO\t\t");



        try{
            CoordenadasBL coordenadas = new CoordenadasBL;
            for(Coordenadas c = coordenadas.getAllCoordenadas()){
                System.out.println(c.getEJ_CAPACIDAD() + "\t\t");
                System.out.println(c.getEJ_GEOLOCA() + "\t\t");
                System.out.println(c.getEJ_ARSENAL() + "\t\t");
                System.out.println(c.getEJ_FECHA_INGRESO() + "\t\t");

            }
        }
    }
}
