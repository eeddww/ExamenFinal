package uni.edu.pe.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.dao.CatTablasDao;
import uni.edu.pe.dto.CatTablas;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CatTablasDaoImpl implements CatTablasDao {

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
    public List<CatTablas> obtenerCatTablas() {
        List<CatTablas> CatTabla = new ArrayList<>();
        try {
            obtenerConexion();
            String sql = " SELECT codigoTabla, descripcion from catalogo_tablas WHERE estado LIKE '1'; ";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                CatTablas CatTabla1 = new CatTablas(
                        rs.getString("codigoTabla"),
                        rs.getString("descripcion"),
                        rs.getString("estado")
                        );
                CatTablas.add(CatTabla1);
            }
            rs.close();
            st.close();
            cerrarConexion();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return CatTabla;
    }

    @Override
    public int registrarCatTablas(CatTablas CatTabla) {
        int tablasAfectadas = 0;
        try{
            obtenerConexion();
            String sql = "INSERT INTO catalogo_tablas VALUES(?, ?, ?);";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setString(1, CatTablas.getCodigoTabla());
            st.setString(2, CatTablas.getdescripcionct());
            st.setString(3, CatTablas.getEstado());
            tablasAfectadas = st.executeUpdate();
            st.close();
            cerrarConexion();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }

        return tablasAfectadas;
    }
}
