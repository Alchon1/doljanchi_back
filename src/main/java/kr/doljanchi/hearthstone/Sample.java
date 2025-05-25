package kr.doljanchi.hearthstone;

import java.sql.Connection;
import java.sql.DriverManager;

public class Sample {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@(description= (retry_count=20)(retry_delay=3)(address=(protocol=tcps)(port=1522)(host=adb.ap-chuncheon-1.oraclecloud.com))(connect_data=(service_name=g7d13ed4cd7110b_doljanchi_high.adb.oraclecloud.com))(security=(ssl_server_dn_match=yes)))";
        String user = "ADMIN";
        String password = "Oracle12345678";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("연결 성공!");
        } catch (Exception e) {
            e.printStackTrace();
        } // try-catch
    } // main
} // end class
