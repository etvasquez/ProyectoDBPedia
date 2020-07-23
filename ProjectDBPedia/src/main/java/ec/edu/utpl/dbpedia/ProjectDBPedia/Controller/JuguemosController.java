package ec.edu.utpl.dbpedia.ProjectDBPedia.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class JuguemosController {

    @GetMapping("/juguemos")
    public String homePage(Model model) {
        //listaManiferos = consultas.consultarAnimalesM();
        //model.addAttribute("listaManiferos", listaManiferos);
        return "/juguemos.html";
    }
}
