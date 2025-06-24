import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Usuario_DAO {
    private Connection connection;
    
    public void UsuarioDAO(){
        this.connection = new Constructor_Factory().conectaBD();
    }
    
    public void criarUsuario(Usuario usuario) throws SQLException{
        String sql = "INSERT INTO usuarios (nome, email, telefone, tipo_usuario) Values (?, ?, ?, ?)";
        
       PreparedStatement pstm;
               pstm = null;
        
        try {
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getEmail());
            pstm.setString(3, usuario.getTelefone());
            pstm.setString(4, usuario.getTipo_usuario());
        } catch (SQLException e) {
            System.out.println("Deu erro na criação de cadastro"+ e.getMessage());
        }
        finally{
            if(pstm != null)pstm.close();
        }
    }
    
    
    
    public List<Usuario> Listar_usuario() throws SQLException{
        List<Usuario> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM usuarios";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            pstm = connection.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next() ){
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setTipo_usuario(rs.getString("tipo_usuario"));
                
                lista.add(usuario);
            }
        } catch (SQLException e) {
            System.out.println("Erro na listagem de usuarios!"+ e.getMessage());
        }
        finally{
            if(pstm != null)pstm.close();
            if(rs != null) pstm.close();
        }
        return lista;
    }
    
    
    public Usuario buscarUsuarioPorID(int id) throws SQLException{
    String sql = "SELECT * FROM usuarios WHERE id = ? ";
    PreparedStatement pstm = null;
    ResultSet rs = null;
    Usuario usuario =null;
    
    
        try {
           
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setTipo_usuario(rs.getString("tipo_usuario"));
                
            }
            
        }catch (SQLException e) {
        System.out.println("Erro ao listar usuários: " + e.getMessage());
    } finally {
        if (rs != null) rs.close();
        if (pstm != null) pstm.close();
    }
        return usuario;
}
    
     public void atualizarUsuario(Usuario usuario)throws SQLException {
        String sql = "UPDATE usuarios SET nome=?, email=?, telefone=?, tipo_usuario=?. WHERE id=?";
        PreparedStatement pstm = null;
        
            try {
                pstm= connection.prepareStatement(sql);
                pstm.setString(1, usuario.getNome() );
                pstm.setString(2, usuario.getEmail());
                pstm.setString(3, usuario.getTelefone());
                pstm.setString(4, usuario.getTipo_usuario());
                pstm.setInt(5, usuario.getId());
                
                int linhaAfetadas = pstm.executeUpdate();
                if(linhaAfetadas > 0){
                    System.out.println("Aualizado com Sucesso");
                }
                else{
                    System.out.println("Usuario nao encontrado");
                }
                
            } catch (SQLException e) {
                System.out.println("Erro "+ e.getMessage());
            }finally{
                if(pstm !=null)pstm.close();
                    
                
            }
        
    }
    
    public void deletarUsuario (int id)throws SQLException{
        Usuario usuario = new Usuario();
        
        String sql="DELETE FROM usuarios WHERE id =?";
        PreparedStatement pstm = null;
        
        try {
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id);
            
            int linhasAfetadas = pstm.executeUpdate();
            
           if (linhasAfetadas==1){
               System.out.println("Usuario com ID "+ id +" Deletado com sucesso");
           }
           
           else{
               System.out.println("Usuario com o ID "+ id+ " não encontrado");
           }
            
        } catch (SQLException e) {
            System.out.println("ERRO!!"+ e.getMessage());
        }finally{
            if (pstm !=null)pstm.close();
        }
    }
}
