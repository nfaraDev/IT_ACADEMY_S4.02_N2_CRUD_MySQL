package cat.itacademy.barcelonactiva.fara.natalia.s04.t02.n02.services;

import cat.itacademy.barcelonactiva.fara.natalia.s04.t02.n02.domain.Entity_Domain;
import cat.itacademy.barcelonactiva.fara.natalia.s04.t02.n02.repository.FrutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class FrutaService {
    @Autowired
    FrutaRepository frutaRepository;

    public ArrayList<Entity_Domain>getFutas(){

        return(ArrayList<Entity_Domain>) frutaRepository.findAll();
    }

    public Entity_Domain saveFruta(Entity_Domain fruta){

        return frutaRepository.save(fruta);
    }

    public Optional<Entity_Domain>getById(Long id) {

        return frutaRepository.findById(id);
    }

    public Entity_Domain updateById(Entity_Domain request, Long id){
        Entity_Domain fruta = frutaRepository.findById(id).get();
        fruta.setNombre(request.getNombre());
        fruta.setPesoKg(request.getPesoKg());
        return fruta;
    }

    public Boolean deleteFruta(Long id) {
        try {
            frutaRepository.deleteById(id);
            return true;
        }catch (Exception e) {
             return false;
        }
    }


}
