package com.focusclubdf.projeto.controller;

import com.focusclubdf.projeto.entity.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Service
@RequestMapping(value = "/usuario")
public class ClubController {

    public ResponseEntity<Usuario> usuariosClub()  {

         Usuario usuario = new Usuario();
         return ResponseEntity.ok().body(usuario);
    }

}
