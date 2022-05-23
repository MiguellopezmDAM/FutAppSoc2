package com.example.futappsoc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class Modelo {
    public SQLiteDatabase getConn(Context context) {
        ConexionSQlite conn = new ConexionSQlite(context, "FutAppSoc", null, 1);
        SQLiteDatabase db = conn.getWritableDatabase();
        return db;
    }
    int insertaUsuario(Context context, Torneo dto) {
        int res = 0;
        String sql = "INSERT INTO Torneo (Name,Tipo,Direccion,Telefono,Url,Comentario,Fecha,Hora) VALUES('" + dto.getName() + "', '" + dto.getTipo()+ "', '" + dto.getDireccion()+ "', " + dto.getTelefono()+", '" + dto.getUrl()+ "', '" + dto.getComentario()+ "', '" + dto.getFecha()+ "', '" + dto.getHora()+  "')";
        SQLiteDatabase db = this.getConn(context);
        try {
            db.execSQL(sql);
            res=1;
        } catch (Exception e) {
    System.out.println("hola");
        }
        return res;
    }
    }

