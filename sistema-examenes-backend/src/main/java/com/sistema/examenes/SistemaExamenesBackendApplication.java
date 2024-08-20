package com.sistema.examenes;

import com.sistema.examenes.modelo.Rol;
import com.sistema.examenes.modelo.Usuario;
import com.sistema.examenes.modelo.UsuarioRol;
import com.sistema.examenes.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemaExamenesBackendApplication implements CommandLineRunner {

	@Autowired
	private UsuarioServicio usuarioServicio;

	public static void main(String[] args) {
		SpringApplication.run(SistemaExamenesBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		//ingreso usuario
		Usuario usuario = new Usuario();
		usuario.setNombre("Gerson");
		usuario.setApellido("Escobar");
		usuario.setUsername("gerson");
		usuario.setPassword("1234");
		usuario.setEmail("gerson@gmail.com");
		usuario.setTelefono("55443322");
		usuario.setPerfil("foto.png");

		// ingreso rol
		Rol rol = new Rol();
		rol.setRolId(1L);
		rol.setNombre("ADMIN");

		//asigno rol y usuario
		Set<UsuarioRol> usuarioRoles = new HashSet<>();
		UsuarioRol usuarioRol = new UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);
		usuarioRoles.add(usuarioRol);

		Usuario usuarioGuardado = usuarioServicio.guardarUsuario(usuario, usuarioRoles);
			System.out.println(usuario.getUsername());

		 */

	}
}
