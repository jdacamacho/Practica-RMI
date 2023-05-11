/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor.controladores;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.List;
import servidor.DTO.UsuarioDTO;
import servidor.Repositorios.UsuarioRepositoryInt;

/**
 *
 * @author INGESIS
 */
public class ControladorGestionUsuarioImpl extends UnicastRemoteObject implements ControladorGestionUsuarioInt{
    
    private final UsuarioRepositoryInt objUsuariosRepository;
    
    public ControladorGestionUsuarioImpl(UsuarioRepositoryInt objUsuariosRepository) throws RemoteException{
        super();
        this.objUsuariosRepository = objUsuariosRepository;
    }
    
    @Override
    public boolean registrarUsuario(UsuarioDTO objUsuario) throws RemoteException {
        return this.objUsuariosRepository.registrarUsuario(objUsuario);
    }

    @Override
    public List<UsuarioDTO> listarUsuarios() throws RemoteException {
        return this.objUsuariosRepository.listarUsuarios();
    }
    
}
