package com.mingtai.mingtai_backend.controllers;

import com.mingtai.mingtai_backend.configs.ApiVersion;
import com.mingtai.mingtai_backend.pojos.Orchid;
import com.mingtai.mingtai_backend.services.interfaces.OrchidService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/{version}/")
@ApiVersion(1)

public class OrchidController {

    @Resource
    private OrchidService orchidService;

    @GetMapping("/orchids")
    public List<Orchid> selectAllOrchids(){
        return orchidService.selectAllOrchids();
    }
    @PostMapping("/orchids")
    public boolean insertOrchid(@RequestBody Orchid orchid) {
        return orchidService.insertOrchid(orchid);
    }

    @DeleteMapping("/orchids")
    public boolean deleteOrchid(@RequestParam(value = "id") int id) {
        return orchidService.deleteOrchid(id);
    }

    @PutMapping("/orchids")
    public boolean updateOrchid(@RequestParam(value = "id") int id, @RequestBody Orchid orchid) {
        return orchidService.updateOrchid(id, orchid);
    }


}
