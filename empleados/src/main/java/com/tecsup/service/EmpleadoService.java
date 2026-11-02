package com.tecsup.service;

import com.tecsup.dto.EmpleadoDTO;
import com.tecsup.exception.ResourceNotFoundException;
import com.tecsup.model.Empleado;
import com.tecsup.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository repo;

    public List<Empleado> listar() {
        return repo.findAll();
    }

    public Empleado obtener(Long id) {
        return repo.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Empleado no encontrado con id: " + id));
    }

    public Empleado registrar(EmpleadoDTO dto) {
        Empleado e = new Empleado();
        copiar(dto, e);
        return repo.save(e);
    }

    public Empleado actualizar(Long id, EmpleadoDTO dto) {
        Empleado e = obtener(id);
        copiar(dto, e);
        return repo.save(e);
    }

    public void eliminar(Long id) {
        repo.delete(obtener(id));
    }

    private void copiar(EmpleadoDTO dto, Empleado e) {
        e.setNombres(dto.getNombres());
        e.setApellidos(dto.getApellidos());
        e.setEmail(dto.getEmail());
        e.setSueldo(dto.getSueldo());
    }
}
