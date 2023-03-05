package com.mingtai.mingtai_backend.services.interfaces;

import com.mingtai.mingtai_backend.pojos.Orchid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrchidService {
    List<Orchid> selectAllOrchids();
    boolean updateOrchid(int id, Orchid orchid);
    boolean deleteOrchid(int id);
    boolean insertOrchid(Orchid orchid);


}
