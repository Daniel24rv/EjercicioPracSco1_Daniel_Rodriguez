
package libreria.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import libreria.demo.service.libroService;
@Controller
@Slf4j
@RequestMapping("/libro")
public class libroController {
    @Autowired
    private libroService libroService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var libros = libroService.getLibros();
        model.addAttribute("libros", libros);
        model.addAttribute("totalLibros", libros.size());
        return "/libro/listado";
    }
}
