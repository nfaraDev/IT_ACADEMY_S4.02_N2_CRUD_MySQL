package cat.itacademy.barcelonactiva.fara.natalia.s04.t02.n02.controllers;


import cat.itacademy.barcelonactiva.fara.natalia.s04.t02.n02.domain.Entity_Domain;
import cat.itacademy.barcelonactiva.fara.natalia.s04.t02.n02.services.FrutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/fruta")

public class FrutaController {

    @Autowired
    private FrutaService frutaService;

    @GetMapping
    public ArrayList<Entity_Domain>getFrutas() {
        return this.frutaService.getFutas() ;

    }

    @PostMapping
    public Entity_Domain saveFruta(@RequestBody Entity_Domain fruta) {
        return this.frutaService.saveFruta(fruta);
    }

    @GetMapping(path = "/¨{id}")
    public Optional<Entity_Domain>getFrutaById(@PathVariable("id") Long id){
        return this.frutaService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public Entity_Domain updateFrutaById(@RequestBody Entity_Domain request, Long id) {
        return this.frutaService.updateById(request,id);
    }
    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean ok = this.frutaService.deleteFruta(id);

        if(ok){
            return "La fruta con id" + id + "se ha borrado";
        }else {
            return"Error";
        }

    }


}
