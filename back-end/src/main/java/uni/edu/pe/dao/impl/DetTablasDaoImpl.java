package uni.edu.pe.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.dao.DetTablasDao;
import uni.edu.pe.dto.DetTablas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class DetTablasDaoImpl implements DetTablasDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private Connection conexion;
    private void obtenerConexion() {
        try{
            conexion = jdbcTemplate.getDataSource().getConnection();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    private void cerrarConexion(){
        try {
            conexion.close();
            conexion = null;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public int actualizarDet(DetTablas DetTabla) {
        int registrosAfectadas = 0;
        try{
            obtenerConexion();
            String sql = "UPDATE detalle_tablas SET codigoTabla = ? WHERE codigoTabla =?;";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setInt(1, DetTablas.getId());
            st.setString(2, DetTablas.getCodigoTabla());
            st.setString(3, DetTablas.getCodigoDetalle());
            st.setString(4, DetTablas.getValor());
            st.setString(5, DetTablas.getdescripciondt());
            st.setString(6, DetTablas.getEstado());
            registrosAfectadas = st.executeUpdate();
            st.close();
            cerrarConexion();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }

        return registrosAfectadas;
    }
}
