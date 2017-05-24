package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_IDBManager
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 24.
 * <pre>
 *
 * @author : Seung
 * @version : 1.0
 */
public interface IDBManager {
    String ORACLE_DATABASE = "ORACLE";
    String SYBASE_DATABASE = "SYBASE";

    void insert();
    void search();
    void update();
    void delete();

    static IDBManager getDBObject(String a){
        if(ORACLE_DATABASE.equalsIgnoreCase(a)){
            return new OracleDB();
        }else if(SYBASE_DATABASE.equalsIgnoreCase(a)){
            return new SybaseDB();
        }else
            return null;
    }

}
